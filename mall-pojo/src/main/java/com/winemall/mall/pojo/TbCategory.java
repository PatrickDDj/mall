package com.winemall.mall.pojo;

import java.io.Serializable;

public class TbCategory implements Serializable {
    private Integer categoryId;

    private Integer categoryLevel;

    private String categoryName;

    private Integer parentId;

    private String categoryImg;

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getCategoryLevel() {
        return categoryLevel;
    }

    public void setCategoryLevel(Integer categoryLevel) {
        this.categoryLevel = categoryLevel;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getCategoryImg() {
        return categoryImg;
    }

    public void setCategoryImg(String categoryImg) {
        this.categoryImg = categoryImg == null ? null : categoryImg.trim();
    }

    @Override
    public String toString() {
        return "TbCategory{" +
                "categoryId=" + categoryId +
                ", categoryLevel=" + categoryLevel +
                ", categoryName='" + categoryName + '\'' +
                ", parentId=" + parentId +
                ", categoryImg='" + categoryImg + '\'' +
                '}';
    }
}