package com.winemall.mall.pojo;

import org.apache.solr.client.solrj.beans.Field;

public class TbGoodsWithBLOBs extends TbGoods {
    @Field("goods_description")
    private String description;

    @Field("goods_image_url")
    private String imageUrl;

    @Override
    public String toString() {
        return "TbGoodsWithBLOBs{" +
                "description='" + description + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                "} " + super.toString();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl == null ? null : imageUrl.trim();
    }
}