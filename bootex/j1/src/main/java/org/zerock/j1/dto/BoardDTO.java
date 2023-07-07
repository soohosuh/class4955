package org.zerock.j1.dto;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class BoardDTO {


    private Long bno;
    private String title;
    private String content;
    private String writer;

    @JsonFormat(pattern = "yyy-mm-dd hh:mm:ss")
    private LocalDateTime regDate;

    @JsonFormat(pattern = "yyy-mm-dd hh:mm:ss")
    private LocalDateTime modDate;
    
}
