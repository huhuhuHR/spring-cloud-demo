package com.github.springcloud.serverA.dao;


import com.github.springcloud.serverA.pojo.TmpUser;
import org.springframework.stereotype.Repository;

/**
 * TmpUserDAO继承基类
 * @author huorong
 */
@Repository
public interface TmpUserDAO extends MyBatisBaseDao<TmpUser, String> {
}