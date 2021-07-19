package com.winemall.mall.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbBasic implements Serializable {
    private String phone;

    private String name;

    private String idCard;

    private Date birthday;

    private Date regDate;

    private Date lastLoginDate;

    private String headImages;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public String getHeadImages() {
        return headImages;
    }

    public void setHeadImages(String headImages) {
        this.headImages = headImages == null ? null : headImages.trim();
    }
}