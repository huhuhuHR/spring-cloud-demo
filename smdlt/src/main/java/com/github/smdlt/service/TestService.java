package com.github.smdlt.service;

import com.github.smdlt.dao.TestDAO;
import com.github.smdlt.pojo.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author huorong
 */
@Service
public class TestService {
    @Autowired
    TestDAO testDAO;

    public Test queryTest(Integer id) {
        return testDAO.selectByPrimaryKey(id);
    }
    public List<Test> findTests() {
        return testDAO.findTests();
    }
}
