package com.github.springcloud.serverA.dao;

import com.github.springcloud.serverA.pojo.TmpDept;
import org.springframework.stereotype.Repository;

/**
 * TmpDeptDAO继承基类
 * @author huorong
 */
@Repository
public interface TmpDeptDAO extends MyBatisBaseDao<TmpDept, String> {
}