package com.github.springcloud.serverA.dao;

import com.github.springcloud.serverA.pojo.TmpRole;
import org.springframework.stereotype.Repository;

/**
 * TmpRoleDAO继承基类
 * @author huorong
 */
@Repository
public interface TmpRoleDAO extends MyBatisBaseDao<TmpRole, String> {
}