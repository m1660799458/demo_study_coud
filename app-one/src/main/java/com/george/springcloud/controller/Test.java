package com.george.springcloud.controller;

import com.george.springcloud.feign.ShiroFeign;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.UUID;

@RestController
public class Test {

    @Value("${server.port}")
    private String port;

    @Value("${spring.application.name}")
    private String name;

    @Resource
    private ShiroFeign shiroFeign;

//    @GetMapping("/test")
//    public String test() {
//        return shiroFeign.test();
//    }

    @GetMapping("/test1")
    public String test1() {
        return UUID.randomUUID().toString() + "：：：：" + name + ":::" + port;
    }
}
