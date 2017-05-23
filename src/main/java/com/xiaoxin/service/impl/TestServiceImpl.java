package com.xiaoxin.service.impl;

import javax.annotation.Resource;
import javax.transaction.SystemException;
import javax.transaction.UserTransaction;

import com.xiaoxin.dao.TestMasterDao;
import com.xiaoxin.dao.TestSlaveDao;
import com.xiaoxin.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.jta.JtaTransactionManager;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

@Service
@Transactional
public class TestServiceImpl implements TestService {
    @Autowired
    private TestMasterDao testMasterDao;
    @Autowired
    private TestSlaveDao testSlaveDao;
    //声明式
    public String update(){
         testMasterDao.master();
        testSlaveDao.slave();
        return null;
    }


}