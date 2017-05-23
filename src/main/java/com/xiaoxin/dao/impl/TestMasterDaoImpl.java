package com.xiaoxin.dao.impl;

import javax.annotation.Resource;

import com.xiaoxin.dao.TestMasterDao;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TestMasterDaoImpl implements TestMasterDao {

    @Resource(name="masterJdbcTemplate")
    JdbcTemplate masterJdbcTemplate;
    public String master() {
        masterJdbcTemplate.execute("update teacher set name='master233' where id=1");
        return "success";
    }

    public String update() {
        masterJdbcTemplate.execute("update teacher set name='8' where id=1");
        System.out.println("update");
        masterJdbcTemplate.execute("fff teacher set name=''6' where id=1");

        return null;
    }

}