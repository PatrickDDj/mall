package com.winemall.mall.controller;

import com.winemall.mall.pojo.Cart;
import com.winemall.mall.pojo.CartKey;
import com.winemall.mall.service.CartService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {
    //使用dubbo注解远程调用cart-service
    @Reference
    private CartService cartService;

    // 添加购物车
    @RequestMapping("/insertCart")
    public boolean insertCart(@RequestBody Cart cart){
        return cartService.insertCart(cart);
    }
    // 删除购物车
    @RequestMapping("/deleteCart")
    public boolean deleteCart(@RequestBody CartKey cartKey){
        return cartService.deleteCart(cartKey);
    }
    // 修改购物记录
    @RequestMapping("/updateCart")
    public boolean updateCart(@RequestBody Cart cart){
        return cartService.updateCart(cart);
    }
    // 查询当前用户的所有购物车信息
    @RequestMapping("/findCartsByPhone")
    public List<Cart> findCartsByPhone(String phone){
        //调用方法查询当前用户的所有购物车信息
        return cartService.findCartsByPhone(phone);
//        List<Cart> carts = cartService.findCartsByPhone(phone);
//        //创建一个集合
//        List<Result<Cart, TbGoodsWithBLOBs>> results = new ArrayList<>();
//        for (Cart cart : carts) {
//            TbGoodsWithBLOBs goods = goodsService.findByGoodsId(cart.getGoodsId());
//            Result<Cart, TbGoodsWithBLOBs> re = new Result<>();
//            re.setEntity(cart);
//            re.setRelateOne(goods);
//            results.add(re);
//        }
//        return results;
    }

}
