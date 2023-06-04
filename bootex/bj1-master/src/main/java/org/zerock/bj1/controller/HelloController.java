package org.zerock.bj1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
public class HelloController {
  
  @GetMapping("/hello")
  public void hello(){
    log.info("Hello...............");
  }
}
