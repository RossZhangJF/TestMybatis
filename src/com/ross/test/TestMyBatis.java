package com.ross.test;

import com.ross.dao.MyClassDao;
import com.ross.dao.StudentDao;
import com.ross.entry.MyClass;
import com.ross.entry.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class TestMyBatis {
    public static void main(String[] args) {
        String resource = "mybatis-config.xml";
        InputStream inputStream=null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession session = sqlSessionFactory.openSession();
            MyClassDao claDao=session.getMapper(MyClassDao.class);
            /*
            MyClass myClass=claDao.getMyClass(1901);
            System.out.println(myClass);
           */
            MyClass myClass=claDao.getMyClassByClassIdGetStudent(1902);
            System.out.println(myClass);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
