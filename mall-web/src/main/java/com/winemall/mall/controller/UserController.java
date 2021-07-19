package com.winemall.mall.controller;

import com.winemall.mall.pojo.*;
//import com.winemall.mall.pojo.TbReceiveAddr;
import com.winemall.mall.dto.Result;
import com.winemall.mall.service.GoodsService;
import com.winemall.mall.service.OrderService;
//import com.winemall.mall.service.ReceiveAddrService;
import com.winemall.mall.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * 控制器
 */
@RestController
@RequestMapping("/user")
public class UserController {
    //使用dubbo注解远程调用user-service
    @Reference
    private UserService userService;
    //使用dubbo远程调度order-service
    @Reference
    private OrderService orderService;
    //使用dubbo远程调度goods-service
    @Reference
    private GoodsService goodsService;
    //使用dubbo远程调度receiveAddrService
    @Reference
//    private ReceiveAddrService receiveAddrService;
    @RequestMapping("/id")
    public User getUserById(){
        return  userService.findUserById(1);
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public boolean login(@RequestBody TbUser user, HttpServletResponse response){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~" + user.getPhone() + "------" + user.getPassword());
        //调用服务模块中的方法进行登录验证
        boolean login = userService.login(user);
        return login;
    }

    @RequestMapping("/register")
    public  boolean register(@RequestBody TbUser user){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~" + user);
        return userService.register(user);
    }

    @RequestMapping("/findByPhone")
    public TbBasic findBasicByPhone(String phone){
        TbBasic basic = userService.findByPhone(phone);
        return  basic;
    }

    @RequestMapping("/updatePassword")
    public  boolean updatePassword(@RequestBody TbUser user){
        System.out.println("================" + user);
        //验证用户输入的当前密码是否正确
        boolean login = userService.login(user);
        if (login) {
            //如果账户密码正确,则将将用户的新密码设置给password属性
            user.setPassword(user.getNewPwd());
            //调用maper接口修改
            boolean update = userService.updatePassword(user);
            if (update) {
                return  true;
            }
        }
        return false;
    }

    @RequestMapping("/findOrdersByPhone")
    public List<Result<TbOrder, TbGoods>> findOrdersByPhone(String phone){
        //调用orderService进行查询
        List<TbOrder> orders = orderService.findOrdersByPhone(phone);
        //创建一个集合用于封装返回的数据
        List<Result<TbOrder, TbGoods>> results = new ArrayList<>();
        //循环调用goodsService服务的方法查询每个订单中关联的商品信息
        for (TbOrder order : orders) {
            Result<TbOrder, TbGoods> result = new Result<>();
            result.setEntity(order);
            result.setRelateOne(goodsService.findByGoodsId(order.getGoodsId()));
            results.add(result);
        }
        return  results;
    }

    @RequestMapping("/deleteOrderById")
    public boolean deleteOrderById(Long orderId){
        //调用orderService服务的方法删除订单(本质是进行修改)
        //创建一TbOrder对象,只需要具备订单编号和DeleteTage两个属性即可
        TbOrder order = new TbOrder();
        order.setOrderId(orderId);
        order.setDeleteTag(false);
        boolean tag = orderService.deleteOrderById(order);//本质是修改,所以传递一个order对象
        return tag;
    }

//    @RequestMapping("/findReceiveAddrByPhone")
//    public List<TbReceiveAddr> findReceiveAddrByPhone(String phone){
//        List<TbReceiveAddr> receiveAddrs = receiveAddrService.findReceiveAddrsByPhone(phone);
//        return  receiveAddrs;
//    }
//
//    @RequestMapping("/findReceiveAddrById")
//    public TbReceiveAddr findReceiveAddrById(Long addrId){
//        TbReceiveAddr addr = receiveAddrService.findReceiveAddrById(addrId);
//        return addr;
//    }
//
//    @RequestMapping("/updateReceiveAddr")
//    public boolean updateReceiveAddr(@RequestBody TbReceiveAddr addr){
//        return  receiveAddrService.updateReceiveAddr(addr);
//    }
//
//    @RequestMapping("/insertReceiveAddr")
//    public boolean insertReceiveAddr(@RequestBody TbReceiveAddr addr){
//        System.out.println(addr);
//        return  receiveAddrService.insertReceiveAddr(addr);
//    }
//
//    @RequestMapping("/deleteReceiveAddrById")
//    public boolean deleteReceiveAddrById(Long addrId){
//        return receiveAddrService.deleteReceiveAddrById(addrId);
//    }
//
//    @RequestMapping("/setDefautlAddr")
//    public  boolean setDefautlAddr(@RequestBody TbReceiveAddr addr){
//        return receiveAddrService.setDefautlAddr(addr);
//    }
}
