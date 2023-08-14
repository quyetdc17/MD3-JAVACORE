package com.shop.sevice.impl;

import com.shop.data.Database;
import com.shop.model.Order;
import com.shop.model.Product;
import com.shop.sevice.GenericService;
import com.shop.util.Predicate;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements GenericService<Product,String> {

    @Override
    public List<Product> findAll() {
        return Database.products;
    }

    @Override
    public List<Product> findBy(Predicate<Product> predicate) {
        List<Product> searchResult = new ArrayList<>();
        for (Product p : Database.products) {
            //if (p.getPrice() == 5000) {
            if (predicate.test(p)) {
                searchResult.add(p);
            }
        }
        return searchResult;
    }

    @Override
    public Product findId(String id) {
        return Database.products.stream()
                .filter(x -> x.getProductId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void add(Product item) {
        Database.products.add(item);
    }

    @Override
    public void edit(Product item) {
        Product p = findId(item.getProductId());
        p.setProductName(item.getProductName());
        p.setPrice(item.getPrice());
        p.setQuantity(item.getQuantity());
        p.setStatus(item.isStatus());
    }

    @Override
    public void remove(String id) {
        Product p = findId(id);
        Database.products.remove(p);
    }
}
