package com.ross.entry;

import java.util.List;

public class MyClass {
    private Integer classId;
    private String className;
    private String classHandth;
    private List<Student> students;
    public MyClass() {
    }

    public MyClass(Integer classId, String className, String classHandth, List <Student> students) {
        this.classId = classId;
        this.className = className;
        this.classHandth = classHandth;
        this.students = students;
    }

    public List <Student> getStudents() {
        return students;
    }

    public void setStudents(List <Student> students) {
        this.students = students;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassHandth() {
        return classHandth;
    }

    public void setClassHandth(String classHandth) {
        this.classHandth = classHandth;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "classId=" + classId +
                ", className='" + className + '\'' +
                ", classHandth='" + classHandth + '\'' +
                ", students=" + students +
                '}';
    }
}
