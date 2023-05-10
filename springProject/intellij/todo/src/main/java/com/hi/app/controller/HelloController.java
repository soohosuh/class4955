package com.hi.app.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Log4j2
public class HelloController {

    @RequestMapping("/hello")
    public ModelAndView hello() {

        ModelAndView mav = new ModelAndView();
        mav.setViewName("hello");
        mav.addObject("greeting", "Hello~~~~");

        return mav;


    }




}
