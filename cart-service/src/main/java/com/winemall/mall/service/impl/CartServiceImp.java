package com.winemall.mall.service.impl;

import com.winemall.mall.mapper.TbCartMapper;
import com.winemall.mall.pojo.TbCart;
import com.winemall.mall.pojo.TbCartExample;
import com.winemall.mall.service.CartService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class CartServiceImp implements CartService {
    //自动装配一个CartMapper属性
    @Autowired
    private TbCartMapper cartMapper;
    @Override
    public boolean insertCart(TbCart cart) {
        return cartMapper.insert(cart) > 0;
    }

    @Override
    public boolean deleteCart(long cartId) {
        return cartMapper.deleteByPrimaryKey(cartId) > 0;
    }

    @Override
    public boolean updateCart(TbCart cart) {
        return cartMapper.updateByPrimaryKeySelective(cart) > 0;
    }

    @Override
    public List<TbCart> findCartsByPhone(String phone) {
        //创建一个查询example对象
        TbCartExample tbCartExample = new TbCartExample();
        tbCartExample.createCriteria().andPhoneEqualTo(phone);
        //查询
        List<TbCart> tbCarts = cartMapper.selectByExample(tbCartExample);
        return tbCarts;
    }

    @Override
    public boolean deleteBatchCart(List<Long> cartIdList) {
        TbCartExample example = new TbCartExample();
        example.createCriteria().andCartIdIn(cartIdList);
        cartMapper.deleteByExample(example);
        return true;
    }
}
