package com.xiaoxin.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

/**
 * Created by xiaoxin on 2017/5/11.
 */
public interface CommonDao {

    boolean addOneObject(Object params, Class clazz);
}
