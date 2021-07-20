package com.winemall.mall.mapper;

import com.winemall.mall.entity.GoodsSold;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: Shinku
 * @Edition: V1.0
 * @CreateDate: 2021/7/14
 * @Description: This is a part of the training project
 */
@Mapper
@Repository
public interface CategoryMapper {
    List<GoodsSold> findAllGoods();
    List<GoodsSold> findGoodRankBySell(@Param("timeString")String timeString);

}
