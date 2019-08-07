package com.github.gateway.controller;

import com.github.gateway.pojo.TmpDept;
import com.github.gateway.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huorong
 * @date 2019/8/6
 */
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("queryTempDept")
    public TmpDept queryTempDept(String deptId) {
        return userService.queryById(deptId);
    }
}
