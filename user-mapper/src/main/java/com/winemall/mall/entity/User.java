package com.winemall.mall.entity;

import com.alibaba.fastjson.JSONObject;

import java.sql.Date;
import java.sql.Timestamp;

/**
 * @Author: Shinku
 * @Edition: V1.0
 * @CreateDate: 2021/7/20
 * @Description: This is a part of the training project
 */
public class User {
    String phone;
    String password;
    String name;
    Date birthday;
    String gender;
    Date reg_date;
    Timestamp last_login_date;
    String head_image_path;

    public String getPhone() {
        return phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String phone, String password, String name, Date birthday, String gender, Date reg_date, Timestamp last_login_date, String head_image_path) {
        this.phone = phone;
        this.password = password;
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.reg_date = reg_date;
        this.last_login_date = last_login_date;
        this.head_image_path = head_image_path;
    }

    public User() {
    }
    public String toJson(){
        JSONObject json = new JSONObject();
        json.put("phone",phone);
        json.put("password",password);
        json.put("name",name);
        json.put("birthday",birthday);
        json.put("gender",gender);
        json.put("reg_date",reg_date);
        json.put("last_login_date",last_login_date);
        json.put("head_image_path",head_image_path);
        return json.toJSONString();
    }

}
