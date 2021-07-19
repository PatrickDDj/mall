package com.winemall.mall.mapper;

import com.winemall.mall.entity.Address;
import org.apache.commons.math3.analysis.function.Add;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigInteger;
import java.util.List;

/**
 * @Author: Shinku
 * @Edition: V1.0
 * @CreateDate: 2021/7/19
 * @Description: This is a part of the training project
 */
@Mapper
public interface AddressMapper {
    List<Address> getAllAddress(@Param("phone") String phone);
    boolean delAddress(@Param("addr_id") Integer addr_id);
    boolean updateAddress(Address address);
    void insertAddress(Address address);
    boolean clearDefault(@Param("addr_id")Integer addr_id,@Param("phone")String phone);
    boolean setDefault(@Param("addr_id")Integer addr_id,@Param("phone")String phone);
    Address getDefault(@Param("phone")String phone);
}
