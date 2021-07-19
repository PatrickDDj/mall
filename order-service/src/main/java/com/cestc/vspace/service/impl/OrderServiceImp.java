package com.winemall.mall.service.impl;

import com.winemall.mall.mapper.TbOrderMapper;
import com.winemall.mall.mapper.TbTradeMapper;
import com.winemall.mall.pojo.TbOrder;
import com.winemall.mall.pojo.TbOrderExample;
import com.winemall.mall.pojo.TbTrade;
import com.winemall.mall.service.OrderService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class OrderServiceImp implements OrderService {
    //自动装配一个OrderMapper
    @Autowired
    private TbOrderMapper orderMapper;
    //自动装配一个TraceMapper
    @Autowired
    private TbTradeMapper tradeMapper;
    @Override
    public List<TbOrder> findOrdersByPhone(String phone) {
        //创建一个TbOrderExample对象
        TbOrderExample orderExample = new TbOrderExample();
        //设置查询条件
        orderExample.createCriteria().andPhoneEqualTo(phone).andDeleteTagEqualTo(true);
        //调用orderMapper接口的方法查询订单
        List<TbOrder> tbOrders = orderMapper.selectByExample(orderExample);
        return tbOrders;
    }

    @Override
    public boolean deleteOrderById(TbOrder order) {
        //调用orderMapper接口方法进行数据删除("修改")操作
        int i = orderMapper.updateByPrimaryKeySelective(order);
        if (i > 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean insertOrders(List<TbOrder> orders) {
        //循环插入数据
        for (TbOrder order : orders) {
            orderMapper.insert(order);
        }
        return true;
    }

    @Override
    public boolean updateOrder(TbOrder order) {
        TbOrderExample example = new TbOrderExample();
        example.createCriteria().andOutTradeNoEqualTo(order.getOutTradeNo());
        int i = orderMapper.updateByExampleSelective(order, example);
        return i > 0;
    }

    @Override
    public boolean insertTradeInfo(TbTrade trade) {
        return tradeMapper.insertSelective(trade) > 0;
    }

    @Override
    public boolean updateTradeInfo(TbTrade trade) {
        return tradeMapper.updateByPrimaryKeySelective(trade) > 0;
    }

    @Override
    public TbOrder findOrderByOrderId_OutTradeNo(TbOrder order) {
        TbOrderExample orderExample = new TbOrderExample();
        orderExample.createCriteria().andOutTradeNoEqualTo(order.getOutTradeNo())
                .andOrderIdEqualTo(order.getOrderId());
        List<TbOrder> tbOrders = orderMapper.selectByExample(orderExample);
        return tbOrders.get(0);
    }

    @Override
    public boolean updateOrderById(TbOrder order) {
        return orderMapper.updateByPrimaryKeySelective(order) > 0;
    }
}
