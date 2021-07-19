package com.winemall.mall.service;

import com.winemall.mall.pojo.TbCart;
import java.util.List;

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
