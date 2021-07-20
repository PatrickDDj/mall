package com.winemall.mall.service.impl;

import com.winemall.mall.mapper.CartMapper;
import com.winemall.mall.pojo.Cart;
import com.winemall.mall.pojo.CartExample;
import com.winemall.mall.pojo.CartKey;
import com.winemall.mall.service.CartService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class CartServiceImp implements CartService {
    //自动装配一个CartMapper属性
    @Autowired
    private CartMapper cartMapper;
    @Override
    public boolean insertCart(Cart cart) {
        return cartMapper.insert(cart) > 0;
    }

    @Override
    public boolean deleteCart(CartKey cartKey) {
        return cartMapper.deleteByPrimaryKey(cartKey) > 0;
    }

    @Override
    public boolean updateCart(Cart cart) {
        return cartMapper.updateByPrimaryKeySelective(cart) > 0;
    }

    @Override
    public List<Cart> findCartsByPhone(String phone) {
        //创建一个查询example对象
        CartExample cartExample = new CartExample();
        cartExample.createCriteria().andPhoneEqualTo(phone);
        //查询
        List<Cart> carts = cartMapper.selectByExample(cartExample);
        return carts;
    }
}


