package com.github.springcloud.serverA.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huorong
 * @date 2019/8/5
 */
@RestController
public class ServerAController {
    @Value("${name}")
    String name;
    @GetMapping("/t1")
    public String sayHello() {
        return "hello world"+ name;
    }
}
