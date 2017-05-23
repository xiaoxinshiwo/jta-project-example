package com.xiaoxin.dao.impl;

import com.xiaoxin.bean.Teacher;
import com.xiaoxin.dao.TeacherDao;

/**
 * Created by xiaoxin on 2017/5/11.
 */
public class TeacherDaoImpl extends CommonDaoImpl implements TeacherDao {

    public boolean addOneTeacher(Teacher teacher) {
        return this.addOneObject(teacher,Teacher.class);
    }
}
