package com.shop.sevice.impl;

import com.shop.data.Database;
import com.shop.model.Order;
import com.shop.model.OrderDetail;
import com.shop.sevice.GenericService;
import com.shop.util.Predicate;

import java.util.ArrayList;
import java.util.List;

public class OrderDetailServiceImpl implements GenericService<OrderDetail,String> {

    @Override
    public List<OrderDetail> findAll() {
        return Database.orderDetails;
    }

    @Override
    public List<OrderDetail> findBy(Predicate<OrderDetail> predicate) {
        List<OrderDetail> searchResult = new ArrayList<>();
        for (OrderDetail od : Database.orderDetails) {
            if (predicate.test(od)) {
                searchResult.add(od);
            }
        }
        return searchResult;
    }

    @Override
    public OrderDetail findId(String id) {
        return null;
    }

    @Override
    public void add(OrderDetail item) {
        Database.orderDetails.add(item);
    }

    @Override
    public void edit(OrderDetail item) {
        Predicate<OrderDetail> predicate = x -> x.getOrderId().equals(item.getOrderId()) && x.getProductId().equals(item.getProductId());
        OrderDetail odd = findBy(predicate).get(0);
        odd.setQuantity(item.getQuantity());
    }

    @Override
    public void remove(String id) {
        List<OrderDetail> odd = findBy(x -> x.getOrderId().equals(id));
        Database.orderDetails.removeAll(odd);
    }
}