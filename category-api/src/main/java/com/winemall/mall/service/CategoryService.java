package com.winemall.mall.service;

import com.winemall.mall.entity.GoodsSold;

import java.util.List;

/**
 * @Author: Shinku
 * @Edition: V1.0
 * @CreateDate: 2021/7/14
 * @Description: This is a part of the training project
 */
public interface CategoryService {
    /**
     * 返回天数以内销量排行的畅销商品
     * @param daysAgo 多少天内
     */
    List<GoodsSold> getRankedGoods(int daysAgo);

    /**
     * 返回默认的商品
     */
    List<GoodsSold> getRandomGoods();
}
