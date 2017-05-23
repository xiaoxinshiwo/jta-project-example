package com.xiaoxin.dao.impl;

import javax.annotation.Resource;

import com.xiaoxin.dao.TestSlaveDao;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TestSlaveDaoImpl implements TestSlaveDao {

    @Resource(name="slaveJdbcTemplate")
    JdbcTemplate slaveJdbcTemplate;

    public String slave() {
        slaveJdbcTemplate.execute("update student set name='slave233' where id=1");
        return "success";
    }   

}