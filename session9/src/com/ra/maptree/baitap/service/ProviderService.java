package com.ra.maptree.baitap.service;

import com.ra.maptree.baitap.Provider;

import java.util.List;

public interface ProviderService {
    List<Provider> findAll();
    Provider findId(String id);
    void add(Provider p);
    List<Provider> findOrderByProviderName();
}
