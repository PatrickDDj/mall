package com.winemall.mall.pojo;

import java.util.Date;

public class Cart extends CartKey {
    private Integer ammount;

    private Date joinDate;

    public Integer getAmmount() {
        return ammount;
    }

    public void setAmmount(Integer ammount) {
        this.ammount = ammount;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }
}