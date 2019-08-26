package com.yyc.personalbolg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {

    @RequestMapping("index")
    public String showMe(){
        return "index";
    }

    @RequestMapping("javaBase")
    public String javaBase(){
        return "javaBase";
    }
    @RequestMapping("selfIntroduce")
    public String selfIntroduce(){
        return "selfIntroduce";
    }
    @RequestMapping("readBase")
    public String readBase(){
        return "readBase";
    }
    @RequestMapping("readEnvironment")
    public String readEnvironment(){
        return "readEnvironment";
    }
}
