package com.ross.entry;

public class MyClass {
    private Integer classId;
    private String className;
    private String classHandth;

    public MyClass() {
    }

    public MyClass(Integer classId, String className, String classHandth) {
        this.classId = classId;
        this.className = className;
        this.classHandth = classHandth;
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
                '}';
    }
}
