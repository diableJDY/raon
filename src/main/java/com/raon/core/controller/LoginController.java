package com.raon.core.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController implements ErrorController {


    @RequestMapping({"/","/error"})
    //@ResponseBody
    public String index(){
        return "index";
    }


    @RequestMapping("/login")
    //@ResponseBody
    public String login() {
        return "logina";
    }

    @Override
    public String getErrorPath() {
        return "/error";
    }

}
