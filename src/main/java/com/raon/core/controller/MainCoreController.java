package com.raon.core.controller;

import com.raon.core.domain.login.Member;
import com.raon.core.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/api")
public class MainCoreController  {

    @Autowired
    MainService mainService;

    @RequestMapping("/movies")
    @ResponseBody
    public List<Member> first(){
        List list = new ArrayList();
        Member member= mainService.getMember();
        member.setName("김성원?");
        list.add(member);
        return list;

    }

    @RequestMapping("/movies/{id}")
    @ResponseBody
    public Member show(@PathVariable long id){
        //List list = new ArrayList();
        Member member= mainService.getMember();
        member.setName("김성원?");
        //list.add(member);
        return member;

    }

/*

    @RequestMapping("/login")
    @ResponseBody
    public String login(){
        return "login";
    }

*/


    /*@RequestMapping("/api")
    @ResponseBody
    public String main(){
        return "Start";
    }*/

/*
    @RequestMapping("/error")
    @ResponseBody
    public String mains(){
        throw new RuntimeException("test exception");
    }*/


}
