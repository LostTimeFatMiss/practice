package com.example.practice.aop.controller;

import com.example.practice.aop.Log;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Song Yimin
 * @description:
 * @date: 2020/4/15
 */
@RestController
@RequestMapping("t")
public class TestController {

    @GetMapping("t")
    @Log(title = "dd",isSaveRequestData = false)
    public String t(String s){
        System.out.println(s);
        return s;
    }
}
