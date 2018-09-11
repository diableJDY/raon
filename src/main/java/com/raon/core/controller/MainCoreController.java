package com.raon.core.controller;

import com.raon.core.domain.login.Member;
import com.raon.core.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MainCoreController {

    @Autowired
    MainService mainService;

    @RequestMapping("/")
    @ResponseBody
    public String index(){
        return "Start";
    }


    @RequestMapping("/first")
    @ResponseBody
    public Member first(){

        Member member= mainService.getMember();

        return member;

    }




}
