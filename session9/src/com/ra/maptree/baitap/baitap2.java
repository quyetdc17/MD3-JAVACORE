package com.ra.maptree.baitap;

import java.util.*;

public class baitap2 {
    /***
     * Tạo class Provider gồm:
     *      - String providerId;
     *      - String providerName;
     *      - boolean status;
     * Tạo class Computer gồm:
     *      - String computerId;
     *      - String model;
     *      - double price;
     *      - Provider provider;
     *      - boolean status;
     * Tạo đầy đủ get/set constructor và các phương thức cần thiết cho 2 class trên.
     * Viết chương trình thực hiện các yêu cầu sau:
     * =================== MENU ===================
     *
     *
     *
     * Khi chọn chức năng 1, vào menu "Quản lý nhà cung cấp":
     * =========== Quản lý nhà cung cấp ===========
     *      1. Thêm nhà cung cấp
     *      2. Hiển thị danh sách nhà cung cấp (sắp xếp theo tên A-Z)
     *      3. Quay lại (quay về "MENU")
     * Khi chọn chức năng 2, vào menu "Quản lý sản phẩm":
     * ============= Quản lý sản phẩm =============
     *      1. Thêm sản phẩm (nhà cung cấp được chọn từ danh sách NCC đã thêm)
     *      2. Hiển thị danh sách sản phẩm theo model A-Z
     *      3. Cập nhật thông tin sản phẩm (tìm sp cập nhật theo mã)
     *      4. Xóa sản phẩm theo mã
     *      5. Quay lại (quay về "MENU")
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Provider> providers = new ArrayList<>();
        List<Computer> computers = new ArrayList<>();
        while(true){
            System.out.println("=====MENU====");
            System.out.println("1. Quản lý nhà cung cấp");
            System.out.println("2. Quản lý sản phẩm");
            System.out.println("3. Thoát");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:
                    providerMain(sc, providers);
                    break;
                case 2:
                    computerMain(sc,providers,computers);
                    break;
                case 3:
                    System.exit(0)
                    ;break;
                default:
                    System.out.println("EROS");
            }
        }
    }
    public static void providerMain(Scanner sc,List<Provider> providers ){
//        List<Provider> providers = new ArrayList<>();
        while (true) {
            System.out.println("1. Thêm nhà cung cấp");
            System.out.println("2. Hiển thị danh sách nhà cung cấp (sắp xếp theo tên A-Z)");
            System.out.println("3. Quay lại (quay về \"MENU\")");
            int choose1 = Integer.parseInt(sc.nextLine());
            switch (choose1){
                case 1:
                    System.out.println("Thêm bao nhieu nhà cung cấp");
                    int n = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < n; i++) {
                        Provider p = new Provider();
                        p.inputProvider();
                        providers.add(p);
                    }
                    break;
                case 2:
                    System.out.println("Danh sách nhà cung cấp");
                    Collections.sort(providers, Comparator.comparing(Provider::getProviderName));
                    for (Provider provider :
                            providers) {
                        System.out.println(provider);
                    }
                    break;
                case 3:
                    return;
                default:
                    System.out.println("ERROR");
            }
        }
    }
    public static void computerMain(Scanner sc, List<Provider> providers, List<Computer> computers)
    {
//        List<Computer> computers = new ArrayList<>();
        while(true){
            System.out.println("==========quan ly san pham===========");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Hiển thị danh sách sản phẩm ");
            System.out.println("3. Cập nhật thông tin sản phẩm)");
            System.out.println("4. Xóa sản phẩm theo mã");
            System.out.println("5. Quay lại (quay về \"MENU\")");
            int choose2 = Integer.parseInt(sc.nextLine());
            switch (choose2){
                case 1:
                    System.out.println("Thêm bao nhieu sản phẩm");
                    int n = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < n; i++) {
                        Computer c = new Computer();
                        System.out.print("Mã Computer:\t");
                        c.setComputerId(sc.nextLine());
                        System.out.print("Mẫu Computer:\t");
                        c.setModel(sc.nextLine());
                        System.out.print("Giá :\t");
                        c.setPrice(Double.parseDouble(sc.nextLine()));
                        System.out.print("Hãng Computer:\t");
                        String providerId = sc.nextLine();
                        Provider _provider = providers.stream().filter(x -> x.getProviderId().equals(providerId)).findFirst().orElse(null);
                        c.setProvider(_provider);
                        System.out.print("Trạng thái:\t");
                        c.setStatus(Boolean.parseBoolean(sc.nextLine()));
//                        c.inputComputer();
                        computers.add(c);
                    }
                    break;
                case 2:
                    System.out.println("Danh sách sản phẩm");
                    Collections.sort(computers,Comparator.comparing(Computer::getModel));
//                    computers.sort((o1,o2) -> o1.getModel().compareTo(o2.getModel()));
                    System.out.println(computers);
                    break;
                case 3:
                    System.out.print("Mã Computer:\t");
                    String cId = sc.nextLine();
                    for (Computer c: computers) {
                        if (cId == c.getComputerId()){
                            System.out.print("Mẫu Computer:\t");
                            c.setModel(sc.nextLine());
                            System.out.print("Giá :\t");
                            c.setPrice(Double.parseDouble(sc.nextLine()));
                            System.out.print("Hãng Computer:\t");
                            String providerId = sc.nextLine();
                            Provider _provider = providers.stream().filter(x -> x.getProviderId().equals(providerId)).findFirst().orElse(null);
                            c.setProvider(_provider);
                            System.out.print("Trạng thái:\t");
                            c.setStatus(Boolean.parseBoolean(sc.nextLine()));
                        }
                    }
                    break;
                case 4:
                    System.out.println("Mã sản phẩm Xóa");
                    String delId = sc.nextLine();
                    computers.removeAll(Arrays.asList(delId));
                    break;
                case 5:
                    return;
                default:
                    System.out.println("ERROR");
            }
        }
    }
}
