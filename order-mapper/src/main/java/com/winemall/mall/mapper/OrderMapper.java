package com.winemall.mall.mapper;

import com.winemall.mall.entity.GoodsInOrder;
import com.winemall.mall.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigInteger;
import java.util.List;

/**
 * @Author: Shinku
 * @Edition: V1.0
 * @CreateDate: 2021/7/19
 * @Description: This is a part of the training project
 * 操作由Service搭配完成。
 * 生成订单：先insertGoodsOrder所有的商品，然后insertOrder
 * 查看订单详情：getOrder获得Order，然后getGoods赋值Order中的goods，用AddressMapper获取Address赋值Order中的address
 * 删除订单：delGoodsOrder，然后delOrder
 *
 * 所有实体类的toJson都写了
 */
@Mapper
public interface OrderMapper {
    boolean insertOrder(@Param("phone")String phone,
                        @Param("addr_id") BigInteger addr_id);
    boolean insertGoodsOrder(@Param("goods_id") BigInteger goods_id,
                             @Param("order_id") BigInteger order_id,
                             @Param("ammount") int ammount);
    List<Order> getAllOrder(@Param("phone")String phone);
    Order getOrder(@Param("order_id") BigInteger order_id);
    List<GoodsInOrder> getGoods(@Param("order_id") BigInteger order_id);
    boolean delOrder(@Param("order_id") BigInteger order_id);
    boolean delGoodsOrder(@Param("order_id") BigInteger order_id);
}
