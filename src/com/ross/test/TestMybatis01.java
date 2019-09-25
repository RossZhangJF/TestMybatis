package com.ross.test;

import com.ross.dao.MyClassDao;
import com.ross.dao.StudentDao;
import com.ross.entry.MyClass;
import com.ross.entry.Student;
import com.ross.util.MybatisSession;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

public class TestMybatis01 {
    public static void main(String[] args) {
        SqlSession session=MybatisSession.getSqlSession();
        StudentDao stuDao= session.getMapper(StudentDao.class);
        /*
        Student student=stuDao.getStudent(2);
        System.out.println(student);
        */
       /*
        Map <Integer,Student> map= stuDao.getStudentMapById(2);
        System.out.println(map);
        */
        /*
        Map <Integer,Student> map= stuDao.getStudentMapAll();
        System.out.println(map);
        */
       /*
       List<Student> list=stuDao.getStudentList();
        System.out.println(list);
        */
       /*
       List<Map<Integer,Student>> list=stuDao.getStudentListOrMap();
        System.out.println(list);
        */
        /*
        List <Map<Integer,List<String>>> list=stuDao.getStudentListOrMapAndList();
        System.out.println(list);
        */
        /*
        Student student=stuDao.getStudentAndClass(4);
        System.out.println(student);
        */
        Student student=stuDao.getStudentAndClassByClassId(2);
        System.out.println(student);
    }
}
