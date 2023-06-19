package org.zerock.bj2.dto;

import java.time.LocalDate;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReplyDTO {

    private Long rno;
    @NotNull
    private Long tno;
    @NotEmpty
    private String reply;
    @NotEmpty
    private String replyer;
    
    @Builder.Default
    private Long gno = 0L;

    private int step;
    
    private LocalDate replyDate;
    
}
