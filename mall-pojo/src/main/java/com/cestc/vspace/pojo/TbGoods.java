package com.winemall.mall.pojo;

import org.apache.solr.client.solrj.beans.Field;

import java.io.Serializable;
import java.util.Date;

public class TbGoods implements Serializable {
    @Field("goods_id")
    private Long goodsId;

    @Field("goods_title")
    private String goodsTitle;

    @Field("goods_price")
    private Double price;

    @Field("goods_discount")
    private Double discount;

    @Field("goods_specification")
    private String specification;

    @Field("goods_category_id")
    private Integer categoryId;

    @Field("goods_ammount")
    private Integer ammount;

    private Date upDate;

    private Date downDate;

    @Field("goods_update_date")
    private Date updateDate;

    @Override
    public String toString() {
        return "TbGoods{" +
                "goodsId=" + goodsId +
                ", goodsTitle='" + goodsTitle + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", specification='" + specification + '\'' +
                ", categoryId=" + categoryId +
                ", ammount=" + ammount +
                '}';
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsTitle() {
        return goodsTitle;
    }

    public void setGoodsTitle(String goodsTitle) {
        this.goodsTitle = goodsTitle == null ? null : goodsTitle.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification == null ? null : specification.trim();
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getAmmount() {
        return ammount;
    }

    public void setAmmount(Integer ammount) {
        this.ammount = ammount;
    }

    public Date getUpDate() {
        return upDate;
    }

    public void setUpDate(Date upDate) {
        this.upDate = upDate;
    }

    public Date getDownDate() {
        return downDate;
    }

    public void setDownDate(Date downDate) {
        this.downDate = downDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}