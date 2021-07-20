package com.winemall.mall.mapper;

import com.winemall.mall.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: Shinku
 * @Edition: V1.0
 * @CreateDate: 2021/7/20
 * @Description: This is a part of the training project
 */
@Mapper
public interface UserMapper {
    boolean insertUser(@Param("phone") String phone,@Param("password") String password);
    User login(@Param("phone") String phone,@Param("password") String password);
    User getUserAll(@Param("phone") String phone);
    boolean insertProfile(@Param("phone") String phone);
    boolean setProfile(User user);

}
