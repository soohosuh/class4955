package org.zerock.j1.repository;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;
import org.zerock.j1.domain.Board;

import lombok.extern.log4j.Log4j2;

@SpringBootTest
@Log4j2
public class BoardRepositoryTests {

    // 테스트를 위한 DI
    @Autowired
    private BoardRepository boardRepository;

    // Insert 테스트
    @Test
    public void testInsert() {
        for (int i = 0; i < 100; i++) {
            Board board = Board.builder()
                    .title("Sample Title" + i)
                    .content("Sample Content" + i)
                    .writer("user" + (i % 10))
                    .build();

            boardRepository.save(board);
        }
    }

    // Read 테스트
    @Test
    public void testRead() {

        Long bno = 1L;

        Optional<Board> result = boardRepository.findById(bno);

        log.info("--------------------------------");

        Board board = result.orElseThrow();

        log.info(board);
    }

    // Update 테스트
    @Test
    public void testUpdate() {
        // JPA 업데이트는 Mybatis 방식과 다르다.
        // 조회후 save를 다시하는 방법
        // 이방식이 복잡하고 너무길다 싶을때 쓰는게
        // Query method 방식
        Long bno = 1L;

        Optional<Board> result = boardRepository.findById(bno);

        Board board = result.orElseThrow();
        board.changeTitle("Update Title");

        boardRepository.save(board);
    }

    // Query method 관련 테스트
    @Test
    public void testQuery1() {

        java.util.List<Board> list = boardRepository.findByTitleContaining("1");

        log.info("----------------------");
        log.info(list.size());
        log.info(list);
    }

    // JPQL 관련 테스트
    @Test
    public void testQuery1_1() {

        java.util.List<Board> list = boardRepository.listTitle("1");

        log.info("----------------------");
        log.info(list.size());
        log.info(list);
    }

    // JPQL 실제 사용이유의 방식의 테스트
    @Test
    public void testQuery1_2() {

        java.util.List<Object[]> list = boardRepository.listTitle2("1");

        log.info("----------------------");
        log.info(list.size());
        list.forEach(arr -> log.info(Arrays.toString(arr)));
    }

    // Page 처리 JPQL
    @Test
    public void testQuery1_3() {
        Pageable pageable = PageRequest.of(0, 10, Sort.by("bno").descending());

        Page<Object[]> result = boardRepository.listTitle3("1", pageable);

        log.info(result);

    }
    // JPQL Modify Test
    @Commit
    @Transactional
    @Test
    public void testModify(){
        Long bno = 100L;
        String title = "Modified Title 100";
        int count = boardRepository.modifyTitle(title, bno);

        log.info("-----------------" + count);

    }

    // 검색하면서 Paging 처리가 되는방법
    @Test
    public void testQuery2() {

        Pageable pageable = PageRequest.of(
                0, 10, Sort.by("bno").descending());

        Page<Board> result = boardRepository.findByContentContaining("1", pageable);

        log.info("------------------------");
        log.info(result);
    }

    @Test
    public void testNative(){

        List<Object[]> result = boardRepository.listNative();
        
        result.forEach(arr -> log.info(Arrays.toString(arr)));
        
    }

    // QBoard를 써서 만든테스트
    @Test
    public void testSearch1(){

       Pageable pageable = PageRequest.of(0, 10, Sort.by("bno").descending());
       Page<Board> result = boardRepository.search1("tcw","1", pageable);
       log.info(result.getTotalElements());

       result.get().forEach(b -> log.info(b));
    }

}