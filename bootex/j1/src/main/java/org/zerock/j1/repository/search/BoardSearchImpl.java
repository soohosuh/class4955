package org.zerock.j1.repository.search;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.zerock.j1.domain.Board;
import org.zerock.j1.domain.QBoard;
import org.zerock.j1.domain.QReply;
import org.zerock.j1.dto.BoardListRcntDTO;
import org.zerock.j1.dto.PageRequestDTO;
import org.zerock.j1.dto.PageResponseDTO;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.Tuple;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.JPQLQuery;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class BoardSearchImpl extends QuerydslRepositorySupport implements BoardSearch {

    // 생성자를 만들어준다.
    public BoardSearchImpl() {
        super(Board.class);
    }

    // interface 메소드를 구현
    @Override
    public Page<Board> search1(String searchType, String keyword, Pageable pageable) {

        // QueryDomain 이 필요하다
        QBoard board = QBoard.board;
        // Query를 동적으로 만들어내는 작업
        // SQL 문을 객체화 시켜놓은것
        JPQLQuery<Board> query = from(board);

        // query.where(board.title.contains("1"));

        // 키워드 와 타입이 있는지 확인 후 
        if(keyword != null && searchType !=null){
            //tc => [t,c]
            String[] searchArr = searchType.split("");
            // BooleanBuilder 생성
            BooleanBuilder searchBuilder = new BooleanBuilder();

            for (String  type : searchArr) {
                
                switch(type){
                    case "t" -> searchBuilder.or(board.title.contains(keyword));
                    case "c" -> searchBuilder.or(board.content.contains(keyword));
                    case "w" -> searchBuilder.or(board.writer.contains(keyword));
                }

            }// end for
            // for문 끝난후 where 로 searchBuilder 추가
            query.where(searchBuilder);
        }

        this.getQuerydsl().applyPagination(pageable, query);
        // list를 가져오는 방법
        List<Board> list = query.fetch();
        long count = query.fetchCount();

        log.info(list);
        log.info("count: " + count);
        // 동적쿼리까지 처리된 list
        return new PageImpl<>(list, pageable, count);
    }

    @Override
    public Page<Object[]> searchWithRcnt(String searchType, String searchKeyword, Pageable pageable) {
        
        QBoard board = QBoard.board;
        QReply reply = QReply.reply;

        JPQLQuery<Board> query = from(board);
        query.leftJoin(reply).on(reply.board.eq(board));

        if(searchKeyword != null && searchType !=null){

            //tc => [t,c]
            String[] searchArr = searchType.split("");
            // BooleanBuilder 생성
            BooleanBuilder searchBuilder = new BooleanBuilder();

            for (String  type : searchArr) {
                
                switch(type){
                    case "t" -> searchBuilder.or(board.title.contains(searchKeyword));
                    case "c" -> searchBuilder.or(board.content.contains(searchKeyword));
                    case "w" -> searchBuilder.or(board.writer.contains(searchKeyword));
                }

            }// end for
            // for문 끝난후 where 로 searchBuilder 추가
            query.where(searchBuilder);
        }

        query.groupBy(board);

        JPQLQuery<Tuple> tupleQuery =
            query.select(board.bno, board.title, board.writer, reply.countDistinct());
        
        this.getQuerydsl().applyPagination(pageable, tupleQuery);

        log.info("1----------------");
        List<Tuple> tuples = tupleQuery.fetch();

        List<Object[]> arrList =
            tuples.stream().map(tuple -> tuple.toArray()).collect(Collectors.toList());

        log.info("2----------------");
        log.info(tuples);

        log.info("3----------------");

        long count = tupleQuery.fetchCount();

        log.info("count: " + count);

        return new PageImpl<>(arrList, pageable, count);

    }

    @Override
    public PageResponseDTO<BoardListRcntDTO> searchDTORcnt(PageRequestDTO requestDTO) {

        Pageable pageable = makePageable(requestDTO);

        QBoard board = QBoard.board;
        QReply reply = QReply.reply;

        JPQLQuery<Board> query = from(board);
        query.leftJoin(reply).on(reply.board.eq(board));

        String searchKeyword = requestDTO.getKeyword();
        String searchType = requestDTO.getType();

        if(searchKeyword != null && searchType !=null){

            //tc => [t,c]
            String[] searchArr = searchType.split("");
            // BooleanBuilder 생성
            BooleanBuilder searchBuilder = new BooleanBuilder();

            for (String  type : searchArr) {
                
                switch(type){
                    case "t" -> searchBuilder.or(board.title.contains(searchKeyword));
                    case "c" -> searchBuilder.or(board.content.contains(searchKeyword));
                    case "w" -> searchBuilder.or(board.writer.contains(searchKeyword));
                }

            }// end for
            // for문 끝난후 where 로 searchBuilder 추가
            query.where(searchBuilder);
        }

        this.getQuerydsl().applyPagination(pageable, query);
        query.groupBy(board);

        query.groupBy(board);

        JPQLQuery<BoardListRcntDTO> listQuery = query.select(
            Projections.bean(
            BoardListRcntDTO.class, 
            board.bno, 
            board.title, 
            board.writer, 
            reply.countDistinct().as("replyCount")));
        
        List<BoardListRcntDTO> list = listQuery.fetch();

        log.info("--------------------");
        log.info(list);

        long totalCount = listQuery.fetchCount();

        return new PageResponseDTO<>(list, totalCount, requestDTO);
        
    }

}