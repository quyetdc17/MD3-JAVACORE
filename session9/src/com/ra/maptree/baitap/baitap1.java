package com.ra.maptree.baitap;

import java.util.HashMap;
import java.util.Scanner;

public class baitap1  {
    /**
     * 3.	Bài thực hành 3 - Xây dựng ứng dụng Java sử dụng Map interface <Integer,String> thực hiện các chức năng theo menu:
     *
     *       *********************MENU*************************
     *      1.	Nhập danh sách gồm n quốc gia với Key tăng 1-n (Mã – Tên – Trạng thái)
     *      2.	Hiển thị danh sách quốc gia ra màn hình
     *      3.	Hiển thị danh sách sắp xếp tăng dần theo tên
     *      4.	Thoát
     * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,String> country = new HashMap<>();
//        country.put(84,"VietNam");
//        country.put(81,"JaPan");
//        country.put(86,"Venela");
//        country.put(89,"Laos");
//        country.put(10,"Angola");
        while (true){
            System.out.print("1.Nhập danh sách  quốc gia");
            System.out.print("1.Hiển thị danh sách quốc gia ra màn hình");
            System.out.print("1.Hiển thị danh sách sắp xếp tăng dần theo tên");
            System.out.print("1.Thoát");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:
                    System.out.println("Nhập gồm ? bao nhieu quốc gia: \t");
                    int n = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < n; i++) {
                        System.out.print("ma quoc gia: \t");
                        int id = Integer.parseInt(sc.nextLine());
                        System.out.print("ten quoc gia: \t");
                        String name = sc.nextLine();
                        System.out.print("trang thai: \t");
                        Boolean status = Boolean.parseBoolean(sc.nextLine());
                        country.put(id,name);
                    }
                    break;
                case 2:break;
                case 3:break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Eros");
            }
        }
    }

}
