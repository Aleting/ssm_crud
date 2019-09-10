package com.ssmdemo.bean;

import java.math.BigDecimal;

public class Teacher {
    private Integer teId;

    private String teName;

    private String teSex;

    private BigDecimal teSalary;

    public Integer getTeId() {
        return teId;
    }

    public Teacher(Integer teId, String teName, String teSex, BigDecimal teSalary) {
        this.teId = teId;
        this.teName = teName;
        this.teSex = teSex;
        this.teSalary = teSalary;
    }

    public Teacher(){

    }

    public void setTeId(Integer teId) {
        this.teId = teId;
    }

    public String getTeName() {
        return teName;
    }

    public void setTeName(String teName) {
        this.teName = teName == null ? null : teName.trim();
    }

    public String getTeSex() {
        return teSex;
    }

    public void setTeSex(String teSex) {
        this.teSex = teSex == null ? null : teSex.trim();
    }

    public BigDecimal getTeSalary() {
        return teSalary;
    }

    public void setTeSalary(BigDecimal teSalary) {
        this.teSalary = teSalary;
    }
}