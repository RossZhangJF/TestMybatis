package com.ross.dao;

import com.ross.entry.Student;

import java.util.Map;

public interface StudentDao {
    public Student getStudent(Integer stuId);
    public Student getStudentByIdAndClassId(Integer stuId,Integer classId);
    public Student getStudentByMap(Map<String ,Object> map);
    public boolean addStudent(Student student);
    public boolean updateStudent(Student student);
    public boolean deleteStudent(Integer stuClassId);

}
