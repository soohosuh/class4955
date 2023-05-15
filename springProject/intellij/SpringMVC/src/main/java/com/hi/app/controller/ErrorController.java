package com.hi.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class ErrorController {

    @GetMapping
    public String getPage(){
        String str = null;
        str.toString();
        return "index";

    }


}
