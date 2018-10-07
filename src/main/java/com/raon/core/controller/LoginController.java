package com.raon.core.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class LoginController implements ErrorController {


    @RequestMapping({"/","/error"})
    @ResponseBody
    public String index(){
        return "index";
    }


    @RequestMapping("/loginAuth")
    @ResponseBody
    public String login(@RequestBody Map map) {
        return "logina";
    }

    @Override
    public String getErrorPath() {
        return "/error";
    }

}
