package com.winemall.mall.mapper;

import com.winemall.mall.pojo.TbTrade;
import com.winemall.mall.pojo.TbTradeExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface TbTradeMapper {
    int countByExample(TbTradeExample example);

    int deleteByExample(TbTradeExample example);

    int deleteByPrimaryKey(Long outTradeNo);

    int insert(TbTrade record);

    int insertSelective(TbTrade record);

    List<TbTrade> selectByExample(TbTradeExample example);

    TbTrade selectByPrimaryKey(Long outTradeNo);

    int updateByExampleSelective(@Param("record") TbTrade record, @Param("example") TbTradeExample example);

    int updateByExample(@Param("record") TbTrade record, @Param("example") TbTradeExample example);

    int updateByPrimaryKeySelective(TbTrade record);

    int updateByPrimaryKey(TbTrade record);
}