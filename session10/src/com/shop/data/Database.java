package com.shop.data;

import com.shop.model.Order;
import com.shop.model.OrderDetail;
import com.shop.model.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Database {
    public static List<Product> products = new ArrayList<>(List.of(
            new Product("SP01", "Tivi", 5000, 20, true),
            new Product("SP02", "Quạt", 750, 20, true),
            new Product("SP03", "Điều hòa", 3500, 20, true),
            new Product("SP04", "Máy giặt", 4500, 20, true),
            new Product("SP05", "Loa", 350, 20, true)
    ));
    public static List<Order> orders = new ArrayList<>();
    public static List<OrderDetail> orderDetails = new ArrayList<>();
}
