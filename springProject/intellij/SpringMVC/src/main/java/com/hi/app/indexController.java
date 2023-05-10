package com.hi.app;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j2
public class indexController {

    // 사용자가 요청하는 URI 등록
    // http://localhost:8080/index
    @RequestMapping("/index")
    public String getIndex() {

        log.info("/index getIndex()");

        // view 경로 반환
        return "index"; // /WEB-INF/views/index.jsp
        // /WEB-INF/views/member/loginForm.jsp

    }



}
