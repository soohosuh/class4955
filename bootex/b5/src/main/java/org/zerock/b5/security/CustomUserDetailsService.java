package org.zerock.b5.security;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class CustomUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        

        log.info("loadUserByname: "+ username);

        UserDetails user = User.builder()
            .username(username)
            .password("$2a$10$EfO1VKNNFYNOaAnw2349gu.rmx3Ye9LgW85HPb92wi11qQ1ZhUzam")
            .authorities("ROLE_USER", "ROLE_G1")
            .build();

        return user;
    }


    
}
