package org.zerock.b4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
public class HellowController {

    @GetMapping("/hellow")
    public void hellow(){
        log.info("안녕~~");
    }
    
}
