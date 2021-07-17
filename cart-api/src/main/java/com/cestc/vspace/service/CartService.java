package com.winemall.mall.service;

import com.winemall.mall.pojo.TbCart;

import java.util.List;

/**
 * @Author: Stephen
 * @Edition: V1.0
 * @CreateDate: 2021/5/24 9:46
 * @Description: 购物车服务接口
 */
public interface CartService {
    //添加购物车记录
    boolean insertCart(TbCart cart);

    //删除购物车记录
    boolean deleteCart(long cartId);

    //修改购物记录
    boolean updateCart(TbCart cart);

    //查询当前用户的所有购物车信息
    List<TbCart> findCartsByPhone(String phone);

    //批量删除购物车
    boolean deleteBatchCart(List<Long> cartIdList);

}
