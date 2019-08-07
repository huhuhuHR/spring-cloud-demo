package com.github.gateway.dao;


import com.github.gateway.pojo.TmpUser;
import org.springframework.stereotype.Repository;

/**
 * TmpUserDAO继承基类
 * @author huorong
 */
@Repository
public interface TmpUserDAO extends MyBatisBaseDao<TmpUser, String> {
}