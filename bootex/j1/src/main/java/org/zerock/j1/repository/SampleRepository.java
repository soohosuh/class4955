package org.zerock.j1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zerock.j1.domain.Sample;
// Repository 라 명시해주고 extends JpaRepository에 Entity 클래스와  키 값타입을 잡아준다. CRUD
public interface SampleRepository extends JpaRepository<Sample, String>{
    
}