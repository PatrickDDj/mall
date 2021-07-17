package com.winemall.mall.service;

import com.winemall.mall.pojo.TbOrder;
import com.winemall.mall.pojo.TbTrade;

import java.util.List;

/**
 * @Author: Stephen
 * @Edition: V1.0
 * @CreateDate: 2021/5/4 11:38
 * @Description: 订单业务接口
 */
public interface OrderService {
    //创建方法根据用户手机号码查询用户订单信息
    List<TbOrder> findOrdersByPhone(String phone);

    //创建方法根据订单编号删除订单(本质是修改,并不真正删除订单数据)
    boolean deleteOrderById(TbOrder order);

    //增加订单
    boolean insertOrders(List<TbOrder> orders);

    //更新订单: 根据商户交易订单编号修改子订单的状态
    boolean updateOrder(TbOrder order);

    //增加交易记录
    boolean insertTradeInfo(TbTrade trade);

    //更新交易状态
    boolean updateTradeInfo(TbTrade trade);

    //根据order_id 和 out_trade_no查询订单子项  此处也可以直接根据orderId进行查询
    TbOrder findOrderByOrderId_OutTradeNo(TbOrder order);

    //根据订单编号修改订单信息
    boolean updateOrderById(TbOrder order);
}
