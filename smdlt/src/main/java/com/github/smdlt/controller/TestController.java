package com.github.smdlt.controller;

import com.github.smdlt.pojo.Test;
import com.github.smdlt.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    @Autowired
    TestService testService;

    @GetMapping("queryTest")
    public Test queryTest(Integer id) {
        return testService.queryTest(id);
    }

    @GetMapping("findTests")
    public List<Test> findTests() {
        return testService.findTests();
    }
}
