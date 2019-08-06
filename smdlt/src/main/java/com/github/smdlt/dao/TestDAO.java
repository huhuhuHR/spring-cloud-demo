package com.github.smdlt.dao;

import com.github.smdlt.pojo.Test;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * TestDAO继承基类
 *
 * @author huorong
 */
@Repository
public interface TestDAO extends MyBatisBaseDao<Test, Integer> {
    @Select("select id,name,age from test")
    List<Test> findTests();
}