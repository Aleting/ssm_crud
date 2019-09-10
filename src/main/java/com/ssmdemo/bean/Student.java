package com.ssmdemo.bean;

import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;

public class Student {
    private Integer stId;
    //使用JSR303数据校验
    @Pattern(regexp = "(^[a-z0-9_-]{3,16}$)|(^[\\u2E80-\\u9FFF]{2,5})",message = "必须是3-16位字母数字组合,或者2-5位汉字")
    private String stName;

    private String stSex;

    @Email(message = "邮箱格式不正确")
    private String stEmail;

    private Integer teId;

    private Teacher teacher;

    public Student(Integer stId,String stName, String stSex, String stEmail, Integer teId) {
        this.stId = stId;
        this.stName = stName;
        this.stSex = stSex;
        this.stEmail = stEmail;
        this.teId = teId;
    }

    public Student() {
    }

    public Integer getStId() {
        return stId;
    }

    public void setStId(Integer stId) {
        this.stId = stId;
    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }

    public String getStSex() {
        return stSex;
    }

    public void setStSex(String stSex) {
        this.stSex = stSex;
    }

    public String getStEmail() {
        return stEmail;
    }

    public void setStEmail(String stEmail) {
        this.stEmail = stEmail;
    }

    public Integer getTeId() {
        return teId;
    }

    public void setTeId(Integer teId) {
        this.teId = teId;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}