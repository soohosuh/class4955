package org.zerock.j1.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "tbl_sample")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
public class Sample {
    // Entity Class
    // 모든 Entity는 primary key(ID)가있어야된다
    // Entity 객체는 수정은 DB수정이니까 getter만 EX) 회원가입
    @Id
    private String keyCol;
    
    private String first;
    
    private String last;
    
    private String addr;

    private String zipCode;

    private String city;
    
}