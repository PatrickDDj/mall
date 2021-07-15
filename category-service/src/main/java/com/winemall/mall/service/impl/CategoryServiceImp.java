package com.winemall.mall.service.impl;

import com.winemall.mall.entity.GoodsSold;
import com.winemall.mall.mapper.CategoryMapper;
import com.winemall.mall.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @Author: Shinku
 * @Edition: V1.0
 * @CreateDate: 2021/7/15
 * @Description: This is a part of the training project
 */
public class CategoryServiceImp implements CategoryService {
    @Autowired
    private CategoryMapper mapper;
    @Override
    public List<GoodsSold> getRankedGoods(int daysAgo) {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy/MM/dd HH:mm");
        Calendar calendar=Calendar.getInstance();
        calendar.add(Calendar.DATE,-daysAgo);
        String time=simpleDateFormat.format(calendar.getTime());
        ArrayList<GoodsSold> l=new ArrayList<>(mapper.findGoodRankBySell(time));
        return l.subList(0,50);
    }

    @Override
    public List<GoodsSold> getRandomGoods() {
        return mapper.findAllGoods();
    }
}
