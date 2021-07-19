package com.winemall.mall.dto;

import java.io.Serializable;
import java.util.List;

public class Result<E,R> implements Serializable {
    private E entity;
    private R relateOne;
    private List<R> relateMany;

    public E getEntity() {
        return entity;
    }

    public void setEntity(E entity) {
        this.entity = entity;
    }

    public R getRelateOne() {
        return relateOne;
    }

    public void setRelateOne(R relateOne) {
        this.relateOne = relateOne;
    }

    public List<R> getRelateMany() {
        return relateMany;
    }

    public void setRelateMany(List<R> relateMany) {
        this.relateMany = relateMany;
    }
}
