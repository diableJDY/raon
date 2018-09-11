package com.raon.core.service;

import com.raon.core.domain.login.Member;
import com.raon.core.domain.login.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class MainService {

    @Autowired
    MemberRepository memberRepository;

    public Member getMember() {

        List<Member> list = memberRepository.findAll();
        Member saveMember=new Member();
        if(list.size() == 0|| list.size() > 0){
            Member member=new Member();
            saveMember = memberRepository.save(member);

        }

        Member ss = memberRepository.getOne(saveMember.getId());
        return ss;
    }
}
