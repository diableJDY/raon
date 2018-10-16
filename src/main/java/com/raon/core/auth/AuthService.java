package com.raon.core.auth;

import com.raon.core.domain.login.Member;
import com.raon.core.domain.login.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;



@Service
public class AuthService {

    @Autowired
    MemberRepository memberRepository;

    private PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();


    public Member login(String id, String pw) {
        Member m = new Member();
        m = memberRepository.findById(id);
        if ( m == null ) {
            return null;
        }
        if ( !passwordEncoder.matches(pw, m.getPw())) {
            return null;
        }
        return m;
    }

    public static Member getCurrentUser() {
        Authentication authentication = (Authentication) SecurityContextHolder.getContext().getAuthentication();
        if (authentication instanceof MyAuthentication)
            return ((MyAuthentication) authentication).getMember();
        return null;
    }

    public static void setCurrentUser(Member member) {
        ((MyAuthentication) SecurityContextHolder.getContext().getAuthentication()).setMember(member);
    }

}