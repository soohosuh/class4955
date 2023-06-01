package org.zerock.b2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
public class HelloController {
    
    @GetMapping("/")
    public void hello(){
        log.info("ex1..........");
        return new String[] {"AAA", "BB", "CCC"};
    }
}
