package com.xiaoxin.service.impl;

import com.xiaoxin.bean.Student;
import com.xiaoxin.bean.Teacher;
import com.xiaoxin.dao.StudentDao;
import com.xiaoxin.dao.TeacherDao;
import com.xiaoxin.service.CommonService;
import com.xiaoxin.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

/**
 * Created by xiaoxin on 2017/5/11.
 */
@Service
@Transactional
public class PersonServiceImpl  implements PersonService {

    @Autowired
    private StudentDao studentDao;

    @Autowired
    private TeacherDao teacherDao;

    public void addOnePerson(String name) {

        Teacher teacher = new Teacher("teacher:"+name);
//        int i = 1/0;
        Student student = new Student("student:"+name);

        teacherDao.addOneTeacher(teacher);
        studentDao.addOneStudent(student);

    }
}
