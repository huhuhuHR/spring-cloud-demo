package com.github.springcloud.serverA.controller;

import com.github.springcloud.serverA.pojo.TmpDept;
import com.github.springcloud.serverA.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huorong
 * @date 2019/8/6
 */
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("queryTempDept")
    public TmpDept queryTempDept(String deptId) {
        return userService.queryById(deptId);
    }
}
