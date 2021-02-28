package com.george.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class test {

    @GetMapping("/test")
    public String test() {
        return UUID.randomUUID().toString();
    }

}
