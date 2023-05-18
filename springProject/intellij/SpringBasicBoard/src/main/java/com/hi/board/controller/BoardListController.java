package com.hi.board.controller;

import com.hi.board.service.BoardListService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j2
public class BoardListController {

    @Autowired
    private BoardListService listService;

    @RequestMapping("/board/list")
    public void boardList(
            Model model
    ){
        log.info("/board/list...");
        model.addAttribute("list", listService.getBoardList());

    }

}
