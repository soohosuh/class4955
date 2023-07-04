package org.zerock.j1.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "tbl_todo2")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
public class Todo {
    
    // PK
    @Id
    // 키생성 전략 DB가 알아서 한다.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tno;
    // 길이 300에 not null
    @Column(length = 300, nullable = false)
    private String title;

    public void changeTitle(String title){
        this.title=title;
    }
    
}