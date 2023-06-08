package org.zerock.bj2.dto;

import lombok.Data;

@Data
public class TodoDTO {
    
    private Long tno;
  private String title;
  private String writer;
  private String content;
  private boolean complete;
  private String dueDate;
    
}
