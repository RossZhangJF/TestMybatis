package com.ross.dao;

import com.ross.entry.Student;
import org.apache.ibatis.annotations.MapKey;

import java.util.List;
import java.util.Map;

public interface StudentDao {
    public Student getStudent(Integer stuId);
    public Student getStudentByIdAndClassId(Integer stuId,Integer classId);

    /**
     * 使用Map传参数
     * @param map
     * @return
     */
    public Student getStudentByMap(Map<String ,Object> map);

    public boolean addStudent(Student student);
    public boolean updateStudent(Student student);
    public boolean deleteStudent(Integer stuClassId);
    @MapKey("stu_id")
    public Map<Integer,String> getStudentMapByName();

    @MapKey("stu_id")
    public Map<Integer,Student> getStudentMapById(Integer id);
    @MapKey("stu_id")
    public Map<Integer,Student> getStudentMapAll();


    public List <Student> getStudentList();
    @MapKey("stuId")
    public List <Map<Integer,Student>> getStudentListOrMap();
    @MapKey("stu_id")
    public List <Map<Integer,List<String>>> getStudentListOrMapAndList();

    public List<Student> getStudentLike(String str);

    public Student getStudentAndClass(Integer stuId);
    public Student getStudentAndClassByClassId(Integer stuId);
    public Student getStudentOrClassId(Integer classId);
}
