package com.winemall.mall.service;

<<<<<<< HEAD
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
=======
import com.winemall.mall.pojo.TbBasic;
import com.winemall.mall.pojo.TbUser;
import com.winemall.mall.pojo.User;

/**
 * 用户业务接口
 */
public interface UserService {
    //根据编号查询用户: 用于测试springboot + dubbo + zookeeper 没有连接底层数据库
    User findUserById(int id);

    //根据手机号码查询用户信息: 服务层一个module, mapper层一个module 各自实现分模块单元测试
    //也可以整合服务 + mapper两个module综合运行,通过dubbo-admin进行服务功能测试
    TbUser findById(String phone);

    //用户注册: 插入一个用户数据的同时,生成一条基本信息插入到数据库
    boolean register(TbUser user);

    //用户登录
    boolean login(TbUser user);

    //根据手机号码查询基本信息
    TbBasic findByPhone(String phone);

    //修改密码
    boolean updatePassword(TbUser user);

    //修改基本信息
    boolean updateBasic(TbBasic basic);

    //...
>>>>>>> origin/master
}
