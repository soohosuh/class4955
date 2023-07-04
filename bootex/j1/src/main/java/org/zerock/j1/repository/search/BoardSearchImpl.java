package org.zerock.j1.repository.search;

import java.util.List;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.zerock.j1.domain.Board;
import org.zerock.j1.domain.QBoard;

import com.querydsl.jpa.JPQLQuery;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class BoardSearchImpl extends QuerydslRepositorySupport implements BoardSearch {

    public BoardSearchImpl() {
        super(Board.class);
    }

    @Override
    public List<Board> search1() {

        QBoard board = QBoard.board;

        JPQLQuery<Board> query = from(board);

        query.where(board.title.contains("1"));
        //query.eq(board.title.contains("1"));
        
        List<Board> list = query.fetch();

        long count = query.fetchCount();

        log.info(list);
        log.info("count: " + count);
        
        return null;
    }
    
}
