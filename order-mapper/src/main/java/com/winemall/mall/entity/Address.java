package com.winemall.mall.entity;

import java.math.BigInteger;
import com.alibaba.fastjson.JSONObject;

/**
 * @Author: Shinku
 * @Edition: V1.0
 * @CreateDate: 2021/7/19
 * @Description: This is a part of the training project
 */
public class Address {
    BigInteger addr_id;
    String name;
    String province;
    String city;
    String section;
    String address;
    String phone;
    int is_default;

    public BigInteger getAddr_id() {
        return addr_id;
    }

    public Address(BigInteger addr_id, String name, String province, String city, String section, String address, String phone, int is_default) {
        this.addr_id = addr_id;
        this.name = name;
        this.province = province;
        this.city = city;
        this.section = section;
        this.address = address;
        this.phone = phone;
        this.is_default = is_default;
    }

    public Address(){};

    @Override
    public String toString() {
        return "Address{" +
                "addr_id=" + addr_id +
                ", name='" + name + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", section='" + section + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", is_default=" + is_default +
                '}';
    }

    /**
     *
     * @param ifId 是否把id放在json中
     * @return
     */
    public String toJson(boolean ifId){
        JSONObject json = new JSONObject();
        if(ifId) json.put("addr_id",addr_id);
        json.put("name",name);
        json.put("province",province);
        json.put("city",city);
        json.put("section",section);
        json.put("address",address);
        json.put("phone",phone);
        json.put("is_default",is_default);
        return json.toJSONString();
    }

    public String getPhone() {
        return phone;
    }
}
