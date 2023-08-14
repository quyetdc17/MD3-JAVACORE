package cafebar.shop;

import cafebar.shop.data.DataContext;
import cafebar.shop.model.*;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BarCoffee {
    private static Employee currentUser;
    public static void main(String[] args) {
        /**
         * Sau khi đăng nhập
         * Xin chào [Tên NV đã đăng nhập]
         * 1. Hiển thị danh sách bàn
         * 2. Đặt bàn
         * 3. Thanh toán
         * 4. Đăng xuất
         * */
        List<Employee> e = new ArrayList<>();
        List<Product> products = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        DataContext dtc = new DataContext("");
        while (true){
            System.out.println("1. Đăng nhập");
            System.out.println("2. Thoát");
            System.out.print("Tính năng: ");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:
                    System.out.print("Email:\t");
                    String email = sc.nextLine();
                    System.out.print("Password:\t");
                    String password = sc.nextLine();
                    Employee emp = dtc.getEmployees().stream().filter(x -> x.getEmployeeEmail().equals(email)&&
                            x.getEmployeePassWord().equals(password)).findFirst().orElse(null);
                    if (emp != null){
                        currentUser = emp;
                        loggedMenu(sc,dtc);
                    }else {
                        System.err.println("Sai tài khoản hoặc mật khẩu");
                    }
                    break;
                case 2:
                    currentUser = null;
                    System.exit(0);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Không có chức năng!");
                    break;
            }
        }

    }
    public static void loggedMenu(Scanner sc, DataContext dtc) {
        while (currentUser != null) {
            System.out.println("Xin chào " + currentUser.getEmployeeName() + "!");
            System.out.println("1. Check bàn");
            System.out.println("2. Đặt bàn");
            System.out.println("3. Chuyển bàn");
            System.out.println("4. Thanh toán");
            System.out.println("5. Đăng xuất");
            System.out.print("Chọn chức năng: ");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("DANH SÁCH BÀN");
                    for (Table t : dtc.getTables()) {
                        System.out.println(MessageFormat.format("[{0} ({1})]", t.getTableId(), (t.isStatus() ? "Trống" : "Đã đặt")));
                    }
                    break;
                case 2:

                    System.out.println("DANH SÁCH BÀN");
                    for (Table t : dtc.getTables()) {
                        if (t.isStatus())
                            System.out.println(MessageFormat.format("[{0} ({1})]", t.getTableId(), (t.isStatus() ? "Trống" : "Đã đặt")));
                    }
                    System.out.println("Nhập mã bàn: ");
                    String tableId = sc.nextLine();
                    Table table = dtc.getTables().stream().filter(x -> x.getTableId().equals(tableId)).findFirst().orElse(null);
                    table.setStatus(true); //truong hop goi them
                    // Hiển thị menu chọn
                    System.out.println("====== MENU ======");
                    for (Category c : dtc.getCategories()) {
                        if (c.isStatus()) {
                            System.out.println(c.getCategoryName());
                            for (Product p : dtc.getProducts()) {
                                if (p.getCategoryId().equals(c.getCategoryId())) {
                                    System.out.println(MessageFormat.format(
                                            "\t({0}){1} | {2}", p.getProductId(), p.getProductName(), p.getPrice()));
                                }
                            }
                        }
                    }
                    // Chọn đồ uống
                    while (true) {
                        System.out.println("ORDERS");
                        for (OrderDetail item : table.getOrders()) {
                            System.out.println(MessageFormat.format("{0}\t{1}\t{2}\t{3}\t{4}",
                                    item.getProductId(), item.getProductName(), item.getQuantity(), item.getPrice(), (item.getPrice() * item.getQuantity())));
                        }
                        System.out.println("****************");
                        System.out.print("Mã đồ uống: ");
                        String proId = sc.nextLine();
                        if (proId.equals("exit"))break;
                        else if (proId.equals("cancel")){
                            table.removeAll();
                            break;
                        }
                        Product pro = dtc.getProducts().stream().filter(x -> x.getProductId().equals(proId)).findFirst().orElse(null);
                        System.out.print("Số lượng : ");
                        int qty = Integer.parseInt(sc.nextLine());
                        OrderDetail itemOrder = new OrderDetail();
                        itemOrder.setProductId(pro.getProductId());
                        itemOrder.setProductName(pro.getProductName());
                        itemOrder.setPrice(pro.getPrice());
                        itemOrder.setQuantity(qty);
                        table.setStatus(false);
                        table.addOrder(itemOrder);
                    }
                    break;
                case 3:
//                    Nhập mã bàn/ check bàn trống hay không?
                    for (Table t : dtc.getTables()) {
                        if (!t.isStatus()) {
                            System.out.println("Mã bàn: " + t.getTableId() + (t.isStatus() ? " Trống" : " Có Khách"));
                        }
                    }
                    System.out.print("Nhập mã bàn muốn chuyển đi:  ");
                    String outTableId = sc.nextLine();
                    Table outTable = dtc.getTables().stream().filter(x -> x.getTableId().equals(outTableId) && x.isStatus()).findFirst().orElse(null);
                    System.out.println(outTable.getOrders());
                    if (outTable != null) {
//                        Hiển thị danh sách bàn trống
                        for (Table t : dtc.getTables()) {
                            if (t.isStatus()) {
                                System.out.println("Mã bàn: " + t.getTableId() + (t.isStatus() ? " Trống" : " Có Khách"));
                            }
                        }
                        System.out.println("Nhập mã bàn muốn chuyển đến:");
                        String cTableId = sc.nextLine();
                        Table cTable = dtc.getTables().stream().filter(x -> x.getTableId().equals(cTableId) && x.isStatus()).findFirst().orElse(null);
                        if (cTable != null){
                            System.out.println("Khách chuyển đến bàn: "+ cTable);
                            List<OrderDetail> orderDetails = new ArrayList<>(outTable.getOrders());
                            cTable.setStatus(false);
                            cTable.getOrders().addAll(orderDetails);
                            outTable.getOrders().clear();//update bàn gốc
                            outTable.setStatus(true);
                        }else {
                            System.out.println("Bàn"+ cTableId+"????!");
                        }
                    }else {
                        System.err.println("Nhập sai bàn");
                    }
//                    -> chuyển orders sang bàn mới -> update trạng thái bàn cũ và mới)
                    break;
                case 4:
                    // Nhập mã bàn cần thanh toán
                    for (Table t : dtc.getTables()) {
                        if (!t.isStatus()) {
                            System.out.println("Mã bàn: " + t.getTableId() + (t.isStatus() ? " Trống" : " Có Khách"));
                        }
                    }
                    System.out.print("Bàn cần thanh toán: ");
                    String b = sc.nextLine();
                    Table creTable = dtc.getTables().stream()
                            .filter(x -> x.getTableId().equals(b) && x.isStatus()).findFirst().orElse(null);
                    // Hiển thị orders
                    if (creTable != null) {
                        double pay = 0;
                        for (OrderDetail item : creTable.getOrders()) {
                            System.out.println(MessageFormat.format("{0}\t{1}\t{2}\t{3}\t{4}",
                                    item.getProductId(), item.getProductName(), item.getQuantity(),
                                    item.getPrice(), (item.getPrice() * item.getQuantity())));
                             pay = pay+ (item.getPrice() * item.getQuantity());
                        }
                        // Xác nhận thanh toán
                        System.out.print("Số tiền khách trả:  ");
                        int amount = Integer.parseInt(sc.nextLine());
                        if (amount >pay){
                            double mnBack = amount-pay;
                            System.out.println("Trả lại cho khách: " + mnBack);
                            System.out.println("Thanh toán thành công");
                            System.out.println("***************");
                            break;
                        }else if (amount< pay){
                            pay = amount - pay;
                            System.out.println("Còn thiếu: "+ pay);
                            System.out.println("Số tiền khách trả");
                            amount = Integer.parseInt(sc.nextLine());
                            if (amount >pay){
                                double mnBack = amount-pay;
                                System.out.println("Trả lại cho khách: " + mnBack);
                                System.out.println("Thanh toán thành công");
                                System.out.println("***************");
                                break;
                            };
                        }
                    }
                    // Lưu thông tin gồm (Order, OrderDetail)
                    break;
                case 5:
                    currentUser = null;
                    return;
                default:
                    System.out.println("Sai chức năng!");
                    break;
            }
        }
    }
}
