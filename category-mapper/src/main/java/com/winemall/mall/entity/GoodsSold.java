package com.winemall.mall.entity;

import java.math.BigInteger;

/**
 * @Author: Shinku
 * @Edition: V1.0
 * @CreateDate: 2021/7/14
 * @Description: This is a part of the training project
 */
public class GoodsSold implements Comparable<GoodsSold>{
    BigInteger goods_id;
    String goods_title;
    double price;
    double discount;
    int size;
    double alcohol;
    double rating;
    String description;
    int ammount;
    String imageUrl;
    int total;

    public GoodsSold() {
    }


    @Override
    public String toString() {
        return "GoodsSold{" +
                "goods_id=" + goods_id +
                ", goods_title='" + goods_title + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", size=" + size +
                ", alcohol=" + alcohol +
                ", rating=" + rating +
                ", description='" + description + '\'' +
                ", ammount=" + ammount +
                ", imageUrl='" + imageUrl + '\'' +
                ", total=" + total +
                '}';
    }

    @Override
    public int compareTo(GoodsSold o) {
        return this.total-o.total;
    }
}
