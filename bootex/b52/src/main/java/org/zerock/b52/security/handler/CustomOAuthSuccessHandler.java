package org.zerock.b52.security.handler;

import java.io.IOException;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.zerock.b52.dto.MemberDTO;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class CustomOAuthSuccessHandler implements AuthenticationSuccessHandler{

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
            Authentication authentication) throws IOException, ServletException {
        
        log.info(("=================================="));
        log.info(authentication.getPrincipal());

        MemberDTO dto = (MemberDTO)authentication.getPrincipal();

        log.info(dto);

        log.info("=======================================");
        log.info(("=================================="));

        if(dto.getPw() == null || dto.getPw().equals("")){
            response.sendRedirect("/member/modify");
        }
    }
    
}
