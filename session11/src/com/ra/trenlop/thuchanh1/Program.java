package com.ra.trenlop.thuchanh1;

import com.ra.trenlop.thuchanh1.IdNullException;
import com.ra.trenlop.thuchanh1.Student;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {
        Student st = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("them hoc sinh");
        int n ;
//        for (int i = 0; i < n; i++) {
//
//            System.out.print("nhap id");
//            st.setId(sc.nextLine());
//            System.out.print("nhap ten");
//            st.setName(sc.nextLine());
//        }
        try {
            System.out.println("nhap so nguyen n");
            n = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException ex) {
            System.err.println("nhap sai noi dung"+ ex.getMessage());
            n = 0;
        } catch (Exception ex){
            System.err.println("co loi xay ra: " + ex.getMessage());
            n = 0;
        } finally {
            System.out.println("chay ca khi co loi");
        }

        while (true){
            try {
                System.out.print("nhap masinh vien");
                st.setId(sc.nextLine());
                break;
            } catch (Exception ex){
                System.out.println(ex.getMessage());
            }
        }
    }
}
