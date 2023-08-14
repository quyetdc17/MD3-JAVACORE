package com.ra.itf;

import com.ra.itf.Mylist;

public class thuchanh3 implements Mylist {
    private String[] source;
    private int size;
    private int index;
    public thuchanh3(){
        this.source = new String[MIN_CAPACITY];
        this.size = 0;
    }
    @Override
    public void add(String item) {
        if (size == source.length){
            String[] newArray = new String[this.size+MIN_CAPACITY];
            System.arraycopy(this.source,0,newArray,0,source.length);
            this.source = newArray;
        }
        source[size] = item;
        size++;
    }
    @Override
    public void remove(String item) {
        int index = findIndex(item);
        if (index != -1){
            System.arraycopy(source,index+1,source,index,size-index-1);
            size--;
        }else{
            System.out.println("not find index in: "+index);
        }

        
    }

    @Override
    public int size() {
        return size;
    }
    @Override
    public boolean contains(String str) {
        for (int i = 0; i < size; i++) {
            if (source[i].equals(str)) return true;
        }
        return false;
    }

    @Override
    public String get(int index) {
        if (index <0||index>size){
            System.out.println("Array over");
            return null;
        }
        return source[index];
    }

    private int findIndex(String item){
        for (int i = 0; i < size; i++) {
            if (source[i].equals(item)) return i;
        }
        return -1;
    }
}
