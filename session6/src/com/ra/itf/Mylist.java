package com.ra.itf;

public interface Mylist {
    void add(String item);

    void remove(String item);

    int size();
    boolean contains(String str);
    int MIN_CAPACITY = 10;
    String[] INIT_DEFAULT = {};
    String get(int index);
}
