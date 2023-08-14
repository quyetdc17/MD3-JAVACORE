package com.ra.baitapNC.model;

import java.util.Date;

public class Order {
    protected String orderId;
    protected String customerName;
    protected String phone;
    protected Date created;

    public Order() {
    }

    public Order(String orderId, String customerName, String phone, Date created) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.phone = phone;
        this.created = created;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
