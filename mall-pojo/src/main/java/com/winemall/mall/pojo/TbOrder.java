package com.winemall.mall.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbOrder implements Serializable {
    private Long orderId;

    private Long outTradeNo;

    private String phone;

    private Date orderDate;

    private Long goodsId;

    private Integer ammount;

    private Double sumPrice;

    private Integer shipmentStatus;

    private Long receiveAddrId;

    private Boolean deleteTag;

    private Integer paymentStatus;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(Long outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getAmmount() {
        return ammount;
    }

    public void setAmmount(Integer ammount) {
        this.ammount = ammount;
    }

    public Double getSumPrice() {
        return sumPrice;
    }

    public void setSumPrice(Double sumPrice) {
        this.sumPrice = sumPrice;
    }

    public Integer getShipmentStatus() {
        return shipmentStatus;
    }

    public void setShipmentStatus(Integer shipmentStatus) {
        this.shipmentStatus = shipmentStatus;
    }

    public Long getReceiveAddrId() {
        return receiveAddrId;
    }

    public void setReceiveAddrId(Long receiveAddrId) {
        this.receiveAddrId = receiveAddrId;
    }

    public Boolean getDeleteTag() {
        return deleteTag;
    }

    public void setDeleteTag(Boolean deleteTag) {
        this.deleteTag = deleteTag;
    }

    public Integer getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(Integer paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}