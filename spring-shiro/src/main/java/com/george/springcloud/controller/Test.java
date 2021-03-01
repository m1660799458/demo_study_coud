package com.george.springcloud.controller;

import com.george.springcloud.Feign.ClusterFeign;
import feign.Feign;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.UUID;

@RestController
//@RefreshScope
public class Test {
    @Value("${server.port}")
    private String port;

    @Value("${spring.application.name}")
    private String name;

    @Resource
    private ClusterFeign clusterFeign;

    @GetMapping("/test")
    public String test() {
        return clusterFeign.test1();
    }

//    @GetMapping("/test1")
//    public String Test1() {
//        return UUID.randomUUID().toString() + "：：：：" + name + ":::" + port;
//    }
}
