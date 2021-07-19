package com.winemall.mall.pojo;

import java.io.Serializable;

public class TbUser  implements Serializable {
    private String phone;

    private String password;

    private String checkCode;

    //添加一个属性用于表示是否记住密码: 在用户登录的时候使用
    private boolean rememberMe;

    //添加一个属性用于修改密码时候的新密码
    private String newPwd;

    public String getNewPwd() {
        return newPwd;
    }

    public void setNewPwd(String newPwd) {
        this.newPwd = newPwd;
    }

    public boolean isRememberMe() {
        return rememberMe;
    }

    public void setRememberMe(boolean rememberMe) {
        this.rememberMe = rememberMe;
    }

    @Override
    public String toString() {
        return "TbUser{" +
                "phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", checkCode='" + checkCode + '\'' +
                ", rememberMe=" + rememberMe +
                ", newPwd='" + newPwd + '\'' +
                '}';
    }

    public String getCheckCode() {
        return checkCode;
    }

    public void setCheckCode(String checkCode) {
        this.checkCode = checkCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}