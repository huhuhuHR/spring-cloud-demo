package com.github.gateway.service;

import com.github.gateway.dao.TmpDeptDAO;
import com.github.gateway.pojo.TmpDept;
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
