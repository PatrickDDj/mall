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
    @RequestMapping("/findTop4Category")
    public List<Category> findTop4Category(){
        List<TbCategory> top4Categories = null;
        //①: 从缓存中查询数据
        String data = cacheService.getDataByKey("top4Categories");
        //②: 判断从缓存获取出来的数据是否为null
        if (data == null) {
            //添加同步代码块
            synchronized (this){
                //再次从缓存中获取数据
                if (cacheService.getDataByKey("top4Categories") == null) {
                    //②: 如果缓存中没有相关数据才调用类型服务进行查询
                    top4Categories = categoryService.findTop4Category();
                    //③: 将从数据库查询到的数据保存到缓存中
                    cacheService.insertCache("top4Categories", JSONObject.toJSON(top4Categories).toString());
                }
            }
        }else{
            //将从缓存查询到的数据转化成目标数据再返回给调用者
            top4Categories = JSON.parseArray(data, TbCategory.class);
        }
        return top4Categories;
    }

    @RequestMapping("/findAllFirstLevelCategory")
    public List<TbCategory> findAllFirstLevelCategory(){
        return categoryService.findAllFirstLevelCategory();
    }

    @RequestMapping("/findTop8GoodsByCategoryId")
    public List<TbGoodsWithBLOBs> findTop8GoodsByCategoryId(Integer categoryId){
        List<TbGoodsWithBLOBs> top8Goods = null;
        //①: 从缓存中查询数据
        String data = cacheService.getDataByKey("top8Goods_" + categoryId);
        //②: 判断从缓存获取出来的数据是否为null
        if (data == null) {
            //添加同步代码块
            synchronized (this){
                //再次从缓存中获取数据
                if (cacheService.getDataByKey("top8Goods_" + categoryId) == null) {
                    //②: 如果缓存中没有相关数据才调用商品服务进行查询
                    top8Goods = goodsService.findTop8GoodsByCategoryId(categoryId);
                    //③: 将从数据库查询到的数据保存到缓存中
                    cacheService.insertCache("top8Goods_" + categoryId, JSONObject.toJSON(top8Goods).toString());
                }
            }
        }else{
            //将从缓存查询到的数据转化成目标数据再返回给调用者
            top8Goods = JSON.parseArray(data, TbGoodsWithBLOBs.class);
        }
        return top8Goods;
    }

    @RequestMapping("/findTop3Goods")
    public List<Result> findTop3Goods(){
        List results = null;
        //①: 从缓存中查询数据
        String data = cacheService.getDataByKey("top3Goods");
        //②: 判断从缓存获取出来的数据是否为null
        if (data == null) {
            //添加同步代码块
            synchronized (this){
                //再次从缓存中获取数据
                if (cacheService.getDataByKey("top3Goods") == null) {
                    //②: 如果缓存中没有相关数据才调用商品服务进行查询
                    List<TbGoodsWithBLOBs> goods = goodsService.findTop3Goods();
                    //查出排行前三的商品的二级类型
                    results = new ArrayList<Result<TbGoodsWithBLOBs, TbCategory>>();
                    for (TbGoodsWithBLOBs g: goods) {
                        Result result = new Result<>();
                        result.setEntity(g);
                        result.setRelateOne(categoryService.findCategoryBySecondLevelCategoryId(g.getCategoryId()));
                        results.add(result);
                    }
                    //③: 将从数据库查询到的数据保存到缓存中
                    cacheService.insertCache("top3Goods", JSONObject.toJSON(results).toString());
                }
            }
        }else{
            //将从缓存查询到的数据转化成目标数据再返回给调用者
            results = JSON.parseArray(data,Result.class);
        }

        return results;
    }

    @RequestMapping("/findGoodsById")
    public TbGoodsWithBLOBs findGoodsById(long goodsId){
        return goodsService.findByGoodsId(goodsId);
    }
}
