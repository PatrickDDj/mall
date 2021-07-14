package com.winemall.mall;

import com.winemall.mall.mapper.CatagoryMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: Shinku
 * @Edition: V1.0
 * @CreateDate: 2021/7/14
 * @Description: This is a part of the training project
 */
@SpringBootTest(classes={CatagoryMapperApplication.class})
@RunWith(SpringRunner.class)
public class CatagoryMapperTest {
    @Autowired
    private CatagoryMapper mapper;
    @Test
    public void test(){
        System.out.println(mapper);
    }



}
