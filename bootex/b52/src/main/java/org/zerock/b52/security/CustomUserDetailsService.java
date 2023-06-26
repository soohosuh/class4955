package org.zerock.b52.security;

import java.util.List;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.zerock.b52.dto.MemberDTO;
import org.zerock.b52.dto.MemberReadDTO;
import org.zerock.b52.mappers.MemberMapper;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final MemberMapper memberMapper;

    private PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        

        log.info("loadUserByname: "+ username);

        MemberReadDTO readDTO = memberMapper.selectOne(username);

        MemberDTO memberDTO = new MemberDTO(
            username,
            readDTO.getMpw(),
            readDTO.getMname(),
            readDTO.getRolenames());

       


        return memberDTO;
    }
    
}
