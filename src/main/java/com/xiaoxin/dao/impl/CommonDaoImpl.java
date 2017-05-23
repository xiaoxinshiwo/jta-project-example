package com.xiaoxin.dao.impl;

import com.xiaoxin.dao.CommonDao;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by xiaoxin on 2017/5/11.
 */
@Repository
public class CommonDaoImpl extends SqlSessionDaoSupport implements CommonDao {

    private String statment(Class clazz) {
        StackTraceElement element = new Throwable().getStackTrace()[1];
        String name = new StringBuffer().append(clazz.getSimpleName()).append(".")
                .append(element.getMethodName()).toString();
        System.out.println("MyBatisName="+name);
        return name;
    }

    public boolean addOneObject(Object params, Class clazz) {

        return getSqlSession().insert(this.statment(clazz),params)>0;
    }

}
