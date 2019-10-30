package com.hekong.huatest.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    @JsonIgnore
    private String password;
    private String userName;
    private Integer age;
    @JsonFormat(pattern = "yyyy-mm-dd",locale = "zh",timezone = "GMT+8")
    private Date date;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String dev;

    public Integer getAge() {
        return age;
    }
    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDev() {
        return dev;
    }

    public void setDev(String dev) {
        this.dev = dev;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", userName=" + userName + ", age=" + age
                + "]";
    }
    public User() {

    }
}
