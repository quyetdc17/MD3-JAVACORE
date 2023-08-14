package cafebar.shop.data;

import cafebar.shop.model.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DataContext implements Serializable {
    private static final long serialVersionUID = 1L;
    private List<Order> orders;
    private List<OrderDetail> orderDetails;
    private List<Category> categories;
    private List<Product> products;
    private List<Employee> employees;
    private List<Table> tables;
    transient private String pathContext;
    public DataContext(String pathContext){
        this.pathContext = pathContext;
        this.orders = new ArrayList<>();
        this.orderDetails = new ArrayList<>();
        this.categories = new ArrayList<>(List.of(
                new Category("C01", "Smoothie", true),
                new Category("C02", "Juice", true),
                new Category("C03", "Coffee", false)
        ));
        this.products = new ArrayList<>(List.of(
                new Product("P01", "Sinh tố bơ", "C01", 20000, true),
                new Product("P02", "Sinh tố xoài", "C01", 35000, true),
                new Product("P08", "Sinh tố Na", "C01", 35000, true),
                new Product("P03", "Nước ép táo", "C02", 30000, true),
                new Product("P04", "Nước ép ổi", "C02", 30000, true),
                new Product("P07", "Nước ép Cam", "C02", 30000, true),
                new Product("P05", "Đen đá", "C03", 40000, true),
                new Product("P06", "Nâu đá", "C03", 40000, true)
        ));
        this.employees = new ArrayList<>(List.of(
                new Employee("NV01","Quyet DC","quyet@email.com","q123","0980876565","Tokyo",true),
                new Employee("NV02","Meo","meo@email.com","m123","0980876565","Tokyo",false),
                new Employee("NV03","Hoa Pham","hoa@email.com","h123","0980876565","Tokyo",true),
                new Employee("NV04","Nam","nam@email.com","n123","0980876565","Tokyo",true),
                new Employee("NV05","Miu Miu","mium@email.com","miu123","0980876565","Tokyo",true)
                ));
        this.tables = new ArrayList<>(List.of(
                new Table("B01",true),
                new Table("B02",true),
                new Table("B03",true),
                new Table("B04",false),
                new Table("B05",true),
                new Table("B06",false),
                new Table("B07",false),
                new Table("B08",true)
        ));
    }

    public List<Order> getOrders() {
        return orders;
    }

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public List<Product> getProducts() {
        return products;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public List<Table> getTables() {
        return tables;
    }

    public void save(){}
}
