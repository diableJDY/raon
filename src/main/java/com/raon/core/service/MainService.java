package com.raon.core.service;

import com.raon.core.domain.login.Member;
import com.raon.core.domain.login.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class MainService {

    @Autowired
    MemberRepository memberRepository;

    private PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public Member getMember() {

        List<Member> list = memberRepository.findAll();
        Member saveMember=new Member();
        if(list.size() == 0|| list.size() > 0){
            Member member=new Member();
//            member.setId("jdy");
//            member.setPw(passwordEncoder.encode("1234"));
//            member.setEmail("okonghpp@naver.com");
            member.setName("정대영");
//            member.setCellphone("010873690714");
            saveMember = memberRepository.save(member);

        }

        Member ss = memberRepository.getOne(saveMember.getIdx());
        return ss;
    }
}
