package com.winemall.mall.controller;

import com.winemall.mall.dto.Result;
import com.winemall.mall.pojo.TbCategory;
import com.winemall.mall.pojo.TbGoodsWithBLOBs;
import com.winemall.mall.pojo.Category;
import com.winemall.mall.service.CacheService;
import com.winemall.mall.service.CategoryService;
import com.winemall.mall.service.GoodsService;
import org.apache.dubbo.common.json.JSON;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.apache.dubbo.config.annotation.Reference;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/index")
public class IndexController {
    //远程调度类型服务模块进行查询统计处理
    @Reference
    private CategoryService categoryService;
    //远程调度商品服务器模块查询
    @Reference
    private GoodsService goodsService;
    //通过dubbo引用缓存服务
    @Reference
    private CacheService cacheService;
}
