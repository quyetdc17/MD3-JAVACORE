package cafebar.shop.model;

import java.io.Serializable;

public class Product implements Serializable {
    private static final long serialVersionUID = 1L;

    private String productId;
    private String productName;
    private String categoryId;
    private double price;
    private boolean status;

    public Product() {
    }

    public Product(String productId, String productName, String categoryId, double price, boolean status) {
        this.productId = productId;
        this.productName = productName;
        this.categoryId = categoryId;
        this.price = price;
        this.status = status;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", categoryId='" + categoryId + '\'' +
                ", price=" + price +
                ", status=" + status +
                '}';
    }
}
