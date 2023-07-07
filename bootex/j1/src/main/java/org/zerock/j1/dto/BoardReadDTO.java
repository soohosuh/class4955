package org.zerock.j1.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

public interface BoardReadDTO {
    
    Long getBno();
    String getTitle();
    String getContent();

    @JsonFormat(pattern = "yyy-mm-dd hh:mm:ss")
    LocalDateTime getRegDate();
    @JsonFormat(pattern = "yyy-mm-dd hh:mm:ss")
    LocalDateTime getModDate();
}
