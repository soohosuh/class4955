package org.zerock.b52.mappers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;
import org.zerock.b52.dto.MemberReadDTO;

@SpringBootTest
public class MemberMapperTests {

    @Autowired
    private MemberMapper memberMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Test
    public void testGetTime() {

        System.out.println(memberMapper.getTime());
    }
    

    @Test
    @Transactional
    @Commit
    public void testInsert() {

        String email = "sooho@gmail.com";
        String mpw = passwordEncoder.encode("1111");
        String mname = "BBB";
        String rolename = "ADMIN";

        memberMapper.insertMember(email, mpw, mname);
        memberMapper.insertMemberRole(email, rolename);
        memberMapper.insertMemberRole(email, "USER");
    }

    @Test
    public void testSelectOne() {

        String email = "soohosuh3@gmail.com";

        MemberReadDTO dto = memberMapper.selectOne(email);

        System.out.println(dto);
    }
}
