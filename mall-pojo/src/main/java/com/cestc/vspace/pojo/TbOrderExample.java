package com.winemall.mall.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbOrderExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbOrderExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Long value) {
            addCriterion("ORDER_ID =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Long value) {
            addCriterion("ORDER_ID <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Long value) {
            addCriterion("ORDER_ID >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ORDER_ID >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Long value) {
            addCriterion("ORDER_ID <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("ORDER_ID <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Long> values) {
            addCriterion("ORDER_ID in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Long> values) {
            addCriterion("ORDER_ID not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Long value1, Long value2) {
            addCriterion("ORDER_ID between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("ORDER_ID not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoIsNull() {
            addCriterion("OUT_TRADE_NO is null");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoIsNotNull() {
            addCriterion("OUT_TRADE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoEqualTo(Long value) {
            addCriterion("OUT_TRADE_NO =", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotEqualTo(Long value) {
            addCriterion("OUT_TRADE_NO <>", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoGreaterThan(Long value) {
            addCriterion("OUT_TRADE_NO >", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoGreaterThanOrEqualTo(Long value) {
            addCriterion("OUT_TRADE_NO >=", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoLessThan(Long value) {
            addCriterion("OUT_TRADE_NO <", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoLessThanOrEqualTo(Long value) {
            addCriterion("OUT_TRADE_NO <=", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoIn(List<Long> values) {
            addCriterion("OUT_TRADE_NO in", values, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotIn(List<Long> values) {
            addCriterion("OUT_TRADE_NO not in", values, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoBetween(Long value1, Long value2) {
            addCriterion("OUT_TRADE_NO between", value1, value2, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotBetween(Long value1, Long value2) {
            addCriterion("OUT_TRADE_NO not between", value1, value2, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("PHONE is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("PHONE =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("PHONE <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("PHONE >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("PHONE <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("PHONE <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("PHONE like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("PHONE not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("PHONE in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("PHONE not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("PHONE between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("PHONE not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andOrderDateIsNull() {
            addCriterion("ORDER_DATE is null");
            return (Criteria) this;
        }

        public Criteria andOrderDateIsNotNull() {
            addCriterion("ORDER_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDateEqualTo(Date value) {
            addCriterion("ORDER_DATE =", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotEqualTo(Date value) {
            addCriterion("ORDER_DATE <>", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateGreaterThan(Date value) {
            addCriterion("ORDER_DATE >", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ORDER_DATE >=", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateLessThan(Date value) {
            addCriterion("ORDER_DATE <", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateLessThanOrEqualTo(Date value) {
            addCriterion("ORDER_DATE <=", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateIn(List<Date> values) {
            addCriterion("ORDER_DATE in", values, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotIn(List<Date> values) {
            addCriterion("ORDER_DATE not in", values, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateBetween(Date value1, Date value2) {
            addCriterion("ORDER_DATE between", value1, value2, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotBetween(Date value1, Date value2) {
            addCriterion("ORDER_DATE not between", value1, value2, "orderDate");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("GOODS_ID is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("GOODS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Long value) {
            addCriterion("GOODS_ID =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Long value) {
            addCriterion("GOODS_ID <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Long value) {
            addCriterion("GOODS_ID >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("GOODS_ID >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Long value) {
            addCriterion("GOODS_ID <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Long value) {
            addCriterion("GOODS_ID <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Long> values) {
            addCriterion("GOODS_ID in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Long> values) {
            addCriterion("GOODS_ID not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Long value1, Long value2) {
            addCriterion("GOODS_ID between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Long value1, Long value2) {
            addCriterion("GOODS_ID not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andAmmountIsNull() {
            addCriterion("AMMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAmmountIsNotNull() {
            addCriterion("AMMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAmmountEqualTo(Integer value) {
            addCriterion("AMMOUNT =", value, "ammount");
            return (Criteria) this;
        }

        public Criteria andAmmountNotEqualTo(Integer value) {
            addCriterion("AMMOUNT <>", value, "ammount");
            return (Criteria) this;
        }

        public Criteria andAmmountGreaterThan(Integer value) {
            addCriterion("AMMOUNT >", value, "ammount");
            return (Criteria) this;
        }

        public Criteria andAmmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("AMMOUNT >=", value, "ammount");
            return (Criteria) this;
        }

        public Criteria andAmmountLessThan(Integer value) {
            addCriterion("AMMOUNT <", value, "ammount");
            return (Criteria) this;
        }

        public Criteria andAmmountLessThanOrEqualTo(Integer value) {
            addCriterion("AMMOUNT <=", value, "ammount");
            return (Criteria) this;
        }

        public Criteria andAmmountIn(List<Integer> values) {
            addCriterion("AMMOUNT in", values, "ammount");
            return (Criteria) this;
        }

        public Criteria andAmmountNotIn(List<Integer> values) {
            addCriterion("AMMOUNT not in", values, "ammount");
            return (Criteria) this;
        }

        public Criteria andAmmountBetween(Integer value1, Integer value2) {
            addCriterion("AMMOUNT between", value1, value2, "ammount");
            return (Criteria) this;
        }

        public Criteria andAmmountNotBetween(Integer value1, Integer value2) {
            addCriterion("AMMOUNT not between", value1, value2, "ammount");
            return (Criteria) this;
        }

        public Criteria andSumPriceIsNull() {
            addCriterion("SUM_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andSumPriceIsNotNull() {
            addCriterion("SUM_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andSumPriceEqualTo(Double value) {
            addCriterion("SUM_PRICE =", value, "sumPrice");
            return (Criteria) this;
        }

        public Criteria andSumPriceNotEqualTo(Double value) {
            addCriterion("SUM_PRICE <>", value, "sumPrice");
            return (Criteria) this;
        }

        public Criteria andSumPriceGreaterThan(Double value) {
            addCriterion("SUM_PRICE >", value, "sumPrice");
            return (Criteria) this;
        }

        public Criteria andSumPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("SUM_PRICE >=", value, "sumPrice");
            return (Criteria) this;
        }

        public Criteria andSumPriceLessThan(Double value) {
            addCriterion("SUM_PRICE <", value, "sumPrice");
            return (Criteria) this;
        }

        public Criteria andSumPriceLessThanOrEqualTo(Double value) {
            addCriterion("SUM_PRICE <=", value, "sumPrice");
            return (Criteria) this;
        }

        public Criteria andSumPriceIn(List<Double> values) {
            addCriterion("SUM_PRICE in", values, "sumPrice");
            return (Criteria) this;
        }

        public Criteria andSumPriceNotIn(List<Double> values) {
            addCriterion("SUM_PRICE not in", values, "sumPrice");
            return (Criteria) this;
        }

        public Criteria andSumPriceBetween(Double value1, Double value2) {
            addCriterion("SUM_PRICE between", value1, value2, "sumPrice");
            return (Criteria) this;
        }

        public Criteria andSumPriceNotBetween(Double value1, Double value2) {
            addCriterion("SUM_PRICE not between", value1, value2, "sumPrice");
            return (Criteria) this;
        }

        public Criteria andShipmentStatusIsNull() {
            addCriterion("SHIPMENT_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andShipmentStatusIsNotNull() {
            addCriterion("SHIPMENT_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andShipmentStatusEqualTo(Integer value) {
            addCriterion("SHIPMENT_STATUS =", value, "shipmentStatus");
            return (Criteria) this;
        }

        public Criteria andShipmentStatusNotEqualTo(Integer value) {
            addCriterion("SHIPMENT_STATUS <>", value, "shipmentStatus");
            return (Criteria) this;
        }

        public Criteria andShipmentStatusGreaterThan(Integer value) {
            addCriterion("SHIPMENT_STATUS >", value, "shipmentStatus");
            return (Criteria) this;
        }

        public Criteria andShipmentStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("SHIPMENT_STATUS >=", value, "shipmentStatus");
            return (Criteria) this;
        }

        public Criteria andShipmentStatusLessThan(Integer value) {
            addCriterion("SHIPMENT_STATUS <", value, "shipmentStatus");
            return (Criteria) this;
        }

        public Criteria andShipmentStatusLessThanOrEqualTo(Integer value) {
            addCriterion("SHIPMENT_STATUS <=", value, "shipmentStatus");
            return (Criteria) this;
        }

        public Criteria andShipmentStatusIn(List<Integer> values) {
            addCriterion("SHIPMENT_STATUS in", values, "shipmentStatus");
            return (Criteria) this;
        }

        public Criteria andShipmentStatusNotIn(List<Integer> values) {
            addCriterion("SHIPMENT_STATUS not in", values, "shipmentStatus");
            return (Criteria) this;
        }

        public Criteria andShipmentStatusBetween(Integer value1, Integer value2) {
            addCriterion("SHIPMENT_STATUS between", value1, value2, "shipmentStatus");
            return (Criteria) this;
        }

        public Criteria andShipmentStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("SHIPMENT_STATUS not between", value1, value2, "shipmentStatus");
            return (Criteria) this;
        }

        public Criteria andReceiveAddrIdIsNull() {
            addCriterion("RECEIVE_ADDR_ID is null");
            return (Criteria) this;
        }

        public Criteria andReceiveAddrIdIsNotNull() {
            addCriterion("RECEIVE_ADDR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveAddrIdEqualTo(Long value) {
            addCriterion("RECEIVE_ADDR_ID =", value, "receiveAddrId");
            return (Criteria) this;
        }

        public Criteria andReceiveAddrIdNotEqualTo(Long value) {
            addCriterion("RECEIVE_ADDR_ID <>", value, "receiveAddrId");
            return (Criteria) this;
        }

        public Criteria andReceiveAddrIdGreaterThan(Long value) {
            addCriterion("RECEIVE_ADDR_ID >", value, "receiveAddrId");
            return (Criteria) this;
        }

        public Criteria andReceiveAddrIdGreaterThanOrEqualTo(Long value) {
            addCriterion("RECEIVE_ADDR_ID >=", value, "receiveAddrId");
            return (Criteria) this;
        }

        public Criteria andReceiveAddrIdLessThan(Long value) {
            addCriterion("RECEIVE_ADDR_ID <", value, "receiveAddrId");
            return (Criteria) this;
        }

        public Criteria andReceiveAddrIdLessThanOrEqualTo(Long value) {
            addCriterion("RECEIVE_ADDR_ID <=", value, "receiveAddrId");
            return (Criteria) this;
        }

        public Criteria andReceiveAddrIdIn(List<Long> values) {
            addCriterion("RECEIVE_ADDR_ID in", values, "receiveAddrId");
            return (Criteria) this;
        }

        public Criteria andReceiveAddrIdNotIn(List<Long> values) {
            addCriterion("RECEIVE_ADDR_ID not in", values, "receiveAddrId");
            return (Criteria) this;
        }

        public Criteria andReceiveAddrIdBetween(Long value1, Long value2) {
            addCriterion("RECEIVE_ADDR_ID between", value1, value2, "receiveAddrId");
            return (Criteria) this;
        }

        public Criteria andReceiveAddrIdNotBetween(Long value1, Long value2) {
            addCriterion("RECEIVE_ADDR_ID not between", value1, value2, "receiveAddrId");
            return (Criteria) this;
        }

        public Criteria andDeleteTagIsNull() {
            addCriterion("DELETE_TAG is null");
            return (Criteria) this;
        }

        public Criteria andDeleteTagIsNotNull() {
            addCriterion("DELETE_TAG is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteTagEqualTo(Boolean value) {
            addCriterion("DELETE_TAG =", value, "deleteTag");
            return (Criteria) this;
        }

        public Criteria andDeleteTagNotEqualTo(Boolean value) {
            addCriterion("DELETE_TAG <>", value, "deleteTag");
            return (Criteria) this;
        }

        public Criteria andDeleteTagGreaterThan(Boolean value) {
            addCriterion("DELETE_TAG >", value, "deleteTag");
            return (Criteria) this;
        }

        public Criteria andDeleteTagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("DELETE_TAG >=", value, "deleteTag");
            return (Criteria) this;
        }

        public Criteria andDeleteTagLessThan(Boolean value) {
            addCriterion("DELETE_TAG <", value, "deleteTag");
            return (Criteria) this;
        }

        public Criteria andDeleteTagLessThanOrEqualTo(Boolean value) {
            addCriterion("DELETE_TAG <=", value, "deleteTag");
            return (Criteria) this;
        }

        public Criteria andDeleteTagIn(List<Boolean> values) {
            addCriterion("DELETE_TAG in", values, "deleteTag");
            return (Criteria) this;
        }

        public Criteria andDeleteTagNotIn(List<Boolean> values) {
            addCriterion("DELETE_TAG not in", values, "deleteTag");
            return (Criteria) this;
        }

        public Criteria andDeleteTagBetween(Boolean value1, Boolean value2) {
            addCriterion("DELETE_TAG between", value1, value2, "deleteTag");
            return (Criteria) this;
        }

        public Criteria andDeleteTagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("DELETE_TAG not between", value1, value2, "deleteTag");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusIsNull() {
            addCriterion("PAYMENT_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusIsNotNull() {
            addCriterion("PAYMENT_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusEqualTo(Integer value) {
            addCriterion("PAYMENT_STATUS =", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusNotEqualTo(Integer value) {
            addCriterion("PAYMENT_STATUS <>", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusGreaterThan(Integer value) {
            addCriterion("PAYMENT_STATUS >", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("PAYMENT_STATUS >=", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusLessThan(Integer value) {
            addCriterion("PAYMENT_STATUS <", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusLessThanOrEqualTo(Integer value) {
            addCriterion("PAYMENT_STATUS <=", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusIn(List<Integer> values) {
            addCriterion("PAYMENT_STATUS in", values, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusNotIn(List<Integer> values) {
            addCriterion("PAYMENT_STATUS not in", values, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusBetween(Integer value1, Integer value2) {
            addCriterion("PAYMENT_STATUS between", value1, value2, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("PAYMENT_STATUS not between", value1, value2, "paymentStatus");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}