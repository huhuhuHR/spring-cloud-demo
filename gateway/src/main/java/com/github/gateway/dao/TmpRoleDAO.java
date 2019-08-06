package com.github.gateway.dao;

import com.github.gateway.pojo.TmpRole;
import org.springframework.stereotype.Repository;

/**
 * TmpRoleDAO继承基类
 * @author huorong
 */
@Repository
public interface TmpRoleDAO extends MyBatisBaseDao<TmpRole, String> {
}