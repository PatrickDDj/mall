package com.winemall.mall.mapper;

import com.winemall.mall.pojo.TbBasic;
import com.winemall.mall.pojo.TbBasicExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TbBasicMapper {
    int countByExample(TbBasicExample example);

    int deleteByExample(TbBasicExample example);

    int deleteByPrimaryKey(String phone);

    int insert(TbBasic record);

    int insertSelective(TbBasic record);

    List<TbBasic> selectByExampleWithBLOBs(TbBasicExample example);

    List<TbBasic> selectByExample(TbBasicExample example);

    TbBasic selectByPrimaryKey(String phone);

    int updateByExampleSelective(@Param("record") TbBasic record, @Param("example") TbBasicExample example);

    int updateByExampleWithBLOBs(@Param("record") TbBasic record, @Param("example") TbBasicExample example);

    int updateByExample(@Param("record") TbBasic record, @Param("example") TbBasicExample example);

    int updateByPrimaryKeySelective(TbBasic record);

    int updateByPrimaryKeyWithBLOBs(TbBasic record);

    int updateByPrimaryKey(TbBasic record);
}