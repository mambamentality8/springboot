package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;

public class User {
    private int age;
    private String phone;
    private Date createTime;

    public User() {
    }

    public User(int age, String pwd, String phone, Date createTime) {
        this.age = age;
        this.phone = phone;
        this.createTime = createTime;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
