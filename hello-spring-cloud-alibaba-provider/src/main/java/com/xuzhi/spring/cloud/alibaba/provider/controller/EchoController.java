package com.xuzhi.spring.cloud.alibaba.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {

    @Value("${server.port}")
    private String port;

    @GetMapping(value = "/echo/{string}")
    public String hello(@PathVariable("string") String string){
        return "Hello Spring Cloud Provider:" + string;
    }

    @GetMapping(value = "/lb")
    public String lb(){
        return "hello Spring Cloud Fegin, I'am port is " + port;
    }
}
