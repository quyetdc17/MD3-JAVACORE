package com.ra.maptree.baitap.service;

import com.ra.maptree.baitap.Computer;

import java.util.List;

public interface ComputerService {
    List<Computer> findAll();
    List<Computer> findOrderByModel();
    Computer findId(String id);
    void add(Computer c);
    void edit(Computer c);
    void remove(String id);
}
