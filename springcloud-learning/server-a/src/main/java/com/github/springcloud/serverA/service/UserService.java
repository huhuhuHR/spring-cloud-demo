package com.github.springcloud.serverA.service;


import com.github.springcloud.serverA.dao.TmpDeptDAO;
import com.github.springcloud.serverA.pojo.TmpDept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author huorong
 * @date 2019/8/6
 */
@Service
public class UserService {
    @Autowired
    TmpDeptDAO tmpDeptDAO;

    public TmpDept queryById(String deptId) {
        return tmpDeptDAO.selectByPrimaryKey(deptId);
    }
}
