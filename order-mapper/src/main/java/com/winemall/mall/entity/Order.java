package com.winemall.mall.entity;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Shinku
 * @Edition: V1.0
 * @CreateDate: 2021/7/19
 * @Description: This is a part of the training project
 */
public class Order {
    BigInteger order_id;
    String phone;
    Timestamp order_date;
    int status;
    BigInteger addr_id;
    List<GoodsInOrder> goods;
    String recv_name;
    Address address;
    public Order() {
    }

    /**
     *
     * @param detail 是否输出详细商品、地址信息
     * @return
     */
    public String toJson(boolean detail){
        JSONObject json = new JSONObject();
        json.put("order_id",order_id);
        json.put("order_date",order_date);
        json.put("status",status);
        json.put("phone",phone);
        json.put("recv_name",recv_name);
        if(detail){
            json.put("addr_info",address.toJson(false));
            json.put("goods_list", JSON.toJSONString(goods));
        }
        return json.toJSONString();
    }


}
