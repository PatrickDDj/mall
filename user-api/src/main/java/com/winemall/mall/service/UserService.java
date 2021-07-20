package com.winemall.mall.service;

import com.winemall.mall.entity.User;

/**
 * @Author: Shinku
 * @Edition: V1.0
 * @CreateDate: 2021/7/20
 * @Description: This is a part of the training project
 */
public interface UserService {
    boolean register(String phone,String password);
    boolean login(String phone,String password);
    User getUserInfo(String phone);
    boolean changeInfo(User user);
}
