package com.ra.mylist;

public class MyListImp implements MyList{
    private Object[] source;
    private int size;
    public MyListImp(){
        source = new Object[MIN_CAPACITY];
        size = 0;
    }
    @Override
    public void add(Object item) {
        if (size == source.length){
            Object[] newArray = new Object[size + MIN_CAPACITY];
            System.arraycopy(source,0,newArray,0,source.length);
            source = newArray;
        }
        source[size] = item;
        size++;
    }

    @Override
    public void remove(Object item) {
        int index = findIndex(item);
        if (index != -1){
            System.arraycopy(source,index + 1,source,index,size - index - 1);
            size--;
        } else {
            System.out.println("Khong thay phan tu \""+item+"\" trong mang");
        }
    }

    @Override
    public Object get(int index) {
        if (index <0||index >= size){
            System.out.println("Array has over");
            return null;
        }
        return source[index];
    }

    @Override
    public Object find(Object item) {
        for (int i = 0; i < size; i++) {
            if (source[i].equals(item)){
                return source[i];
            }
        }
        return null;
    }

    @Override
    public int findIndex(Object item) {
        for (int i = 0; i < size; i++) {
            if (source[i].equals(item)) return i;
        }
        return -1;
    }

    @Override
    public boolean contains(Object str) {
        for (int i = 0; i < size; i++) {
            if (source[i].equals(str)) return true;
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }
}
