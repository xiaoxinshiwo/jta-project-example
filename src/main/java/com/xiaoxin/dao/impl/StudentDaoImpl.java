package com.xiaoxin.dao.impl;

import com.xiaoxin.bean.Student;
import com.xiaoxin.dao.StudentDao;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

/**
 * Created by xiaoxin on 2017/5/11.
 */
public class StudentDaoImpl extends CommonDaoImpl implements StudentDao {

    public boolean addOneStudent(Student student) {

        return this.addOneObject(student,Student.class);
    }

}
