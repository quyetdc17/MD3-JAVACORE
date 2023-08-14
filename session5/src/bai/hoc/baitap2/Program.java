package bai.hoc.baitap2;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        Bus[] bus = null;
        while (true){
            System.out.println("1. Nhập số lượng");
            System.out.println("2. Thêm hành khách lên xe");
            System.out.println("3. Thống kê số hành khách đang có trên xe");
            System.out.println("4. Tìm kiếm các hành khách là employee làm cùng cty");
            System.out.println("5. Tìm kiếm các hành khách là student học cùng trường");
            System.out.println("6. Hiển thị thông tin các hành khách trên xe");
            System.out.println("7. Thoát");
            System.out.print("Chọn tính năng (1->7): ");
            int choose = Integer.parseInt(sc.nextLine());

            switch (choose) {
                case 1:
                    System.out.print("1. Nhập số lượng ghe");
                    int n = Integer.parseInt(sc.nextLine());
                    bus = new Bus[n];
    //                for (int i = 0; i < n; i++) {
    //                    Bus newBus = new Bus();
    //                    newBus.getBusNo()
    //                }
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    System.out.println("Thoát chương trình...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chọn sai chức năng");
           }
        }
    }
}
