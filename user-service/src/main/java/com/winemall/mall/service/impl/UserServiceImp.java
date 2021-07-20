package com.winemall.mall.service.impl;

import com.winemall.mall.entity.User;
import com.winemall.mall.mapper.UserMapper;
import com.winemall.mall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: Shinku
 * @Edition: V1.0
 * @CreateDate: 2021/7/21
 * @Description: This is a part of the training project
 */
public class UserServiceImp implements UserService {
    @Autowired
    private UserMapper mapper;

    @Override
    public boolean register(String phone, String password) {
        try{
            mapper.insertUser(phone,password);
            mapper.insertProfile(phone);
        }catch (Exception e){
            return false;
        }
        return true;
    }

    @Override
    public boolean login(String phone, String password) {
        User user=mapper.login(phone,password);
        return user!=null;
    }

    @Override
    public User getUserInfo(String phone) {
        return mapper.getUserAll(phone);
    }

    @Override
    public boolean changeInfo(User user) {
        try{
            mapper.setProfile(user);
        }catch (Exception e){
            return false;
        }
        return true;
    }
}
