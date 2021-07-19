package com.winemall.mall.pojo;

import java.io.Serializable;

/**
 * 用户实体类
 */
public class User implements Serializable {
    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User() {
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
}
