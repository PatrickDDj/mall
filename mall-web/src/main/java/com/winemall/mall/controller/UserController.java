package com.winemall.mall.controller;

import com.winemall.mall.entity.User;
import com.winemall.mall.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.sql.Date;

/**
 * @Author: Shinku
 * @Edition: V1.0
 * @CreateDate: 2021/7/21
 * @Description: This is a part of the training project
 */
@RestController
public class UserController {

    @Reference
    private UserService userService;

    @RequestMapping(path = "/user/regist", method= RequestMethod.POST)
    public boolean register(@RequestParam("phone") String phone,
                            @RequestParam("password") String password){
        return userService.register(phone,password);
    }

    @RequestMapping(path = "/user/signin", method= RequestMethod.POST)
    public boolean login(@RequestParam("phone") String phone,
                         @RequestParam("password") String password){
        return userService.login(phone,password);
    }

    @RequestMapping(path = "/user/profile", method= RequestMethod.GET)
    public String userProfile(@RequestParam("phone") String phone){
        return userService.getUserInfo(phone).toJson();
    }

    @RequestMapping(path = "/user/profile", method= RequestMethod.POST)
    public boolean changeProfile(@RequestParam("phone") String phone,
                                 @RequestParam("name") String name,
                                 @RequestParam("birthday") Date birthday,
                                 @RequestParam("gender") String gender,
                                 @RequestParam("reg_date") Date reg_date,
                                 @RequestParam("head_image") MultipartFile head_image
                                 ){
        //TODO:通过图片服务api完成文件添加与地址返回，返回的地址为head_img_path。
        //String head_img_path=api(head_image);
        User newuser=new User(phone,null,name,birthday,gender,reg_date,null,head_img_path);
        return userService.changeInfo(newuser);
    }






}
