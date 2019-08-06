package com.github.gateway.dao;

import com.github.gateway.pojo.TmpDept;
import org.springframework.stereotype.Repository;

/**
 * TmpDeptDAO继承基类
 */
@Repository
public interface TmpDeptDAO extends MyBatisBaseDao<TmpDept, String> {
}