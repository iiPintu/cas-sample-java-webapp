package com.tceasy.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author liyh on 2017/3/18 14:26
 */
@Controller
@RequestMapping(value = "login")
public class LoginController {


    @RequestMapping(value = "main")
    public String main(){
        return "ssssssssssss";
    }


}
