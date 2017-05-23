package com.xiaoxin.service;

import org.mybatis.spring.SqlSessionTemplate;

/**
 * Created by xiaoxin on 2017/5/11.
 */
public interface CommonService {

    boolean addOneObject(Object params, Class clazz);

}
