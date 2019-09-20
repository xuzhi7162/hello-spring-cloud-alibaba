package com.xuzhi.spring.cloud.alibaba.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

    private final RestTemplate restTemplatel;

    @Autowired
    public TestController(RestTemplate restTemplatel) {
        this.restTemplatel = restTemplatel;
    }

    @GetMapping(value = "/echo/{string}")
    public String hello(@PathVariable("string") String string){
        return restTemplatel.getForObject("http://service-provider/echo/" + string, String.class);
    }
}
