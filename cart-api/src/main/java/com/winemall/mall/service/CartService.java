package com.winemall.mall.service;

import com.winemall.mall.pojo.Cart;
import com.winemall.mall.pojo.CartKey;

import java.util.List;

public interface CartService {
    //添加购物车记录
    boolean insertCart(Cart cart);

    //删除购物车记录
    boolean deleteCart(CartKey cartKey);

    //修改购物记录
    boolean updateCart(Cart cart);

    //查询当前用户的所有购物车信息
    List<Cart> findCartsByPhone(String phone);
}
