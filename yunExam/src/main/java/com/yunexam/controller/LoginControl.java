package com.yunexam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginControl {

    @RequestMapping(path = "")
    public String Login(){
        // 用户登陆 service 验证处理
        System.out.println("用户登录");
        return "login.html";
    }
}