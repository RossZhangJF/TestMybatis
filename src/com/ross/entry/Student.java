package com.ross.entry;


import java.io.Serializable;

public class Student implements Serializable {
    private Integer stuId;
    private String stuName;
    private String stuSex;
    private Integer stuAge;
    private Integer stuHeight;
    private Integer stuScroe;
    private Integer classId;

    public Student(Integer stuId, String stuName, String stuSex, Integer stuAge, Integer stuHeight, Integer stuScroe, Integer stuClassId) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.stuSex = stuSex;
        this.stuAge = stuAge;
        this.stuHeight = stuHeight;
        this.stuScroe = stuScroe;
        this.classId = stuClassId;
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex;
    }

    public Integer getStuAge() {
        return stuAge;
    }

    public void setStuAge(Integer stuAge) {
        this.stuAge = stuAge;
    }

    public Integer getStuHeight() {
        return stuHeight;
    }

    public void setStuHeight(Integer stuHeight) {
        this.stuHeight = stuHeight;
    }

    public Integer getStuScore() {
        return stuScroe;
    }

    public void setStuScore(Integer stuScore) {
        this.stuScroe = stuScore;
    }

    public Integer getStuClassId() {
        return classId;
    }

    public void setStuClassId(Integer stuClassId) {
        this.classId = stuClassId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                ", stuName='" + stuName + '\'' +
                ", stuSex='" + stuSex + '\'' +
                ", stuAge=" + stuAge +
                ", stuHeight=" + stuHeight +
                ", stuScroe=" + stuScroe +
                ", classId=" + classId +
                '}';
    }

    public Student() {
    }
}
