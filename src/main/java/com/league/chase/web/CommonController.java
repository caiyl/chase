package com.league.chase.web;


import common.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {


    @Autowired
    private CommonService commonService;

    @GetMapping("/sayHello")
    public String sayHello() {
//        return commonService.sayHello();
        return "hello boot";
    }
}