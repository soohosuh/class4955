package org.zerock.b2;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zerock.b2.mappers.TimeMapper;

import lombok.extern.log4j.Log4j2;

@SpringBootTest
@Log4j2
class B2ApplicationTests {


@Autowired
private TimeMapper timeMapper;


@Test
public void testTime(){
	
	log.info(timeMapper.getTime());

}





	@Test
	void contextLoads() {
	}

}
