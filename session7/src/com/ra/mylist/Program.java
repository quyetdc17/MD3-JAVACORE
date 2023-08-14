package com.ra.mylist;

public class Program {
    public static void main(String[] args) {
        MyList list = new MyListImp();
        list.add("abe");
        list.add("bec");

        System.out.println(list.contains("bec"));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
