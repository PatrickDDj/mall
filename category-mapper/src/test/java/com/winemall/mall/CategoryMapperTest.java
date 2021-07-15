package com.winemall.mall;

import com.winemall.mall.entity.GoodsSold;
import com.winemall.mall.mapper.CategoryMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Author: Shinku
 * @Edition: V1.0
 * @CreateDate: 2021/7/14
 * @Description: This is a part of the training project
 */
@SpringBootTest(classes={CategoryMapperApplication.class})
@RunWith(SpringRunner.class)
public class CategoryMapperTest {
    @Autowired
    private CategoryMapper mapper;
    @Test
    public void test(){
        List<GoodsSold> l=mapper.findGoodRankBySell("2021/6/23 0:00");
        l.sort(null);
        for(GoodsSold g:l){
            System.out.println(g);
        }

        for(GoodsSold g:mapper.findAllGoods()){
            System.out.println(g);
        }
    }



}
