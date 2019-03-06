package com.xpc.jenkinstest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class T {
    @RequestMapping("")
    public String t(){
        return "测试持续集成";
    }
}
