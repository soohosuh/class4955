package org.astro.portfolio.dto;

import groovy.transform.ToString;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BoardDTO {

    //변수
    private Integer bno;        //pk
    private String title;       //제목
    private String content;     //내용
    private String writer;      //작성자
    private String dueDate;     //등록일
    private String updateDate;  //수정일
    private boolean status;     //상태여부
    
}
