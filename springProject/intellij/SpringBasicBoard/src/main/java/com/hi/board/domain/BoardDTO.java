package com.hi.board.domain;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
public class BoardDTO {

    private int bno;
    private String title;
    private String content;
    private String writer;
    private String regdate;
    private String updatedate;


}
