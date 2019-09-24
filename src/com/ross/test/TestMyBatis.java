package com.ross.test;

import com.ross.dao.StudentDao;
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
            StudentDao stuDao=session.getMapper(StudentDao.class);
//            Student student= stuDao.getStudent(2);
//            Student student=stuDao.getStudentByIdAndClassId(2,1901);

            /*
            Map<String ,Object> map=new HashMap <>();
            map.put("stuID",1);
            map.put("stuSex","男");
            map.put("classID","1901");
            Student student=stuDao.getStudentByMap(map);
            System.out.println(student);
            */

           /*
           Student student=new Student(5,"张无忌","男",49,160,94,1901);
            boolean b=stuDao.addStudent(student);
            session.commit();  //提交
            System.out.println(b);
            */
           Student student=new Student(5,"包拯","男",18,180,99,1902);
           boolean b=stuDao.updateStudent(student);
           session.commit();
            System.out.println(b);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
