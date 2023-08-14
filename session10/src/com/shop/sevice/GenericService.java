package com.shop.sevice;

import com.shop.model.Order;
import com.shop.util.Predicate;

import java.util.List;

public interface GenericService<T,K> {
    List<T> findAll();
    List<T> findBy(Predicate<T> predicate);
    T findId(K id);
    void add(T item);
    void edit(T item);

    void remove(K id);
}
