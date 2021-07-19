package com.winemall.mall;

import com.winemall.mall.pojo.TbGoods;
import com.winemall.mall.pojo.TbGoodsExample;
import com.winemall.mall.pojo.TbGoodsWithBLOBs;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface TbGoodsMapper {
    //自定义mapper接口方法: 查询指定类型销量前8的商品
    List<TbGoodsWithBLOBs> findTop8GoodsByCategoryId(Integer categoryId);
    //自定义方法查询全网销售最好的三种商品
    List<TbGoodsWithBLOBs> findTop3();

    int countByExample(TbGoodsExample example);

    int deleteByExample(TbGoodsExample example);

    int deleteByPrimaryKey(Long goodsId);

    int insert(TbGoodsWithBLOBs record);

    int insertSelective(TbGoodsWithBLOBs record);

    List<TbGoodsWithBLOBs> selectByExampleWithBLOBs(TbGoodsExample example);

    List<TbGoods> selectByExample(TbGoodsExample example);

    TbGoodsWithBLOBs selectByPrimaryKey(Long goodsId);

    int updateByExampleSelective(@Param("record") TbGoodsWithBLOBs record, @Param("example") TbGoodsExample example);

    int updateByExampleWithBLOBs(@Param("record") TbGoodsWithBLOBs record, @Param("example") TbGoodsExample example);

    int updateByExample(@Param("record") TbGoods record, @Param("example") TbGoodsExample example);

    int updateByPrimaryKeySelective(TbGoodsWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TbGoodsWithBLOBs record);

    int updateByPrimaryKey(TbGoods record);
}