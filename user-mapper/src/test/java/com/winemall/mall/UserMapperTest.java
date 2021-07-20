package com.winemall.mall;

import com.winemall.mall.entity.User;
import com.winemall.mall.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: Shinku
 * @Edition: V1.0
 * @CreateDate: 2021/7/20
 * @Description: This is a part of the training project
 */
@SpringBootTest(classes={UserMapperApplication.class})
@RunWith(SpringRunner.class)
public class UserMapperTest {
    @Autowired
    private UserMapper mapper;
    @Test
    public void test(){
        User usernew=new User("TEST2","JAVAATEST","TESTN",null,"M",
                null,null,"NOPATH");
        System.out.println("new user:");
        System.out.println(mapper.insertUser(usernew.getPhone(),usernew.getPassword()));
        mapper.insertProfile(usernew.getPhone());
        mapper.setProfile(usernew);
        System.out.println("new user2:");
        try{
            System.out.println(mapper.insertUser(usernew.getPhone(),usernew.getPassword()));
        }catch(Exception e){
            System.out.println("has such user");
        }
        System.out.println("user login:");
        System.out.println(mapper.login("12345678910","123450").toJson());
        System.out.println("user login2:");
        System.out.println(mapper.login("12345678910","123451"));
        System.out.println("user profile:");
        System.out.println(mapper.getUserAll(usernew.getPhone()).toJson());



    }
}
