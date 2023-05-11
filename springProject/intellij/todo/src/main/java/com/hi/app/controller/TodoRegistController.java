package com.hi.app.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/todo/regist")
@Log4j2
public class TodoRegistController {

    @RequestMapping(method = RequestMethod.GET)
    public String getRegistForm() {
        log.info("get /todo/regist");
        return "todo/registForm";
    }
    @RequestMapping(method = RequestMethod.POST)
    public String regist() {
        log.info("post /todo/regist");
        return "redirect:/todo/list";
    }


}
