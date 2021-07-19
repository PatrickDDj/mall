package com.winemall.mall.pojo;

import java.io.Serializable;

public class TbReceiveAddr implements Serializable {
    private Long addrId;

    private String prov;

    private String city;

    private String section;

    private String detail;

    private String receiveName;

    private String receivePhone;

    private String ownUserPhone;

    private Boolean isDefault;

    @Override
    public String toString() {
        return "TbReceiveAddr{" +
                "addrId=" + addrId +
                ", prov='" + prov + '\'' +
                ", city='" + city + '\'' +
                ", section='" + section + '\'' +
                ", detail='" + detail + '\'' +
                ", receiveName='" + receiveName + '\'' +
                ", receivePhone='" + receivePhone + '\'' +
                ", ownUserPhone='" + ownUserPhone + '\'' +
                ", isDefault=" + isDefault +
                '}';
    }

    public Long getAddrId() {
        return addrId;
    }

    public void setAddrId(Long addrId) {
        this.addrId = addrId;
    }

    public String getProv() {
        return prov;
    }

    public void setProv(String prov) {
        this.prov = prov == null ? null : prov.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section == null ? null : section.trim();
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    public String getReceiveName() {
        return receiveName;
    }

    public void setReceiveName(String receiveName) {
        this.receiveName = receiveName == null ? null : receiveName.trim();
    }

    public String getReceivePhone() {
        return receivePhone;
    }

    public void setReceivePhone(String receivePhone) {
        this.receivePhone = receivePhone == null ? null : receivePhone.trim();
    }

    public String getOwnUserPhone() {
        return ownUserPhone;
    }

    public void setOwnUserPhone(String ownUserPhone) {
        this.ownUserPhone = ownUserPhone == null ? null : ownUserPhone.trim();
    }

    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }
}