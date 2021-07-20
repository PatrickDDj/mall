package com.winemall.mall.service;

import com.winemall.mall.dto.Condition;
import com.winemall.mall.dto.PageResult;
import com.winemall.mall.pojo.TbGoods;
import com.winemall.mall.pojo.TbGoodsWithBLOBs;

import java.util.List;

/**
 * @Author: Stephen
 * @Edition: V1.0
 * @CreateDate: 2021/5/4 16:10
 * @Description: 商品业务接口
 */
public interface GoodsService {
    //根据商品编号查询商品信息
    TbGoodsWithBLOBs findByGoodsId(Long goodsId);

    //分页查询商品信息
    PageResult findPage(int pageNo,int pageSize);

    //更新商品信息
    boolean updateGoods(TbGoodsWithBLOBs goods);

    //查询指定一级类型中销量前8的商品信息
    List<TbGoodsWithBLOBs> findTop8GoodsByCategoryId(Integer categoryId);

    //查询全网销量最好的三种商品
    List<TbGoodsWithBLOBs> findTop3Goods();

    //根据商品编号查询商品信息
    TbGoodsWithBLOBs findGoodsById(long goodsId);

    //根据条件分页查询
    PageResult findPageByCondition(Condition condition);
}
