package com.xiaoxin.service.impl;

import com.xiaoxin.dao.CommonDao;
import com.xiaoxin.service.CommonService;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by xiaoxin on 2017/5/11.
 */
public class CommonServiceImpl implements CommonService {

    @Autowired
    public SqlSessionTemplate slaveTemplate;
    @Autowired
    public SqlSessionTemplate masterTemplate;

    @Autowired
    private CommonDao commonDao;

    public boolean addOneObject(Object params, Class clazz) {
        return commonDao.addOneObject(params,clazz);
    }
}
