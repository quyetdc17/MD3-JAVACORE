package opject.clas.thuchanh;

import java.util.Scanner;

public class Book {
    private String bookId;
    private String title;
    private String author;
    private double price;
    private int year;
    private boolean status;

//    constructor
    public Book(String bookId, String title, String author, double price, int year, boolean status) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
        this.year = year;
        this.status = status;
    }
    public Book() {
    }
//    get set
    public String getBookId() {
        return this.bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

//  khoi tao phuong thuc
    public void inputData(){
        Scanner sc = new Scanner(System.in);
        boolean checkInput = true;
        do {
            System.out.println("ma sach");
            String id = sc.nextLine();
            if (id.startsWith("SP")){
                this.bookId = id;
                checkInput = true;
            }else {
                checkInput = false;
                System.out.println(" ma sach bat dau bang \"SP\"");
            }
            this.bookId = sc.nextLine();
        }while (!checkInput);
        System.out.println("ten sach");
        this.title = sc.nextLine();
        System.out.println("tac gia sach");
        this.author = sc.nextLine();
        System.out.println("gia cua sach");
        this.price = Double.parseDouble(sc.nextLine());
        System.out.println("nam xuat ban sach");
        this.year = Integer.parseInt(sc.nextLine());
        System.out.println("trang thai sach");
        this.status = Boolean.parseBoolean(sc.nextLine());

    }
    public void outputData(){
        System.out.println("Ma sach \t"+this.bookId);
        System.out.println("Ten sach\t"+this.title);
        System.out.println("Gia sach\t"+this.price);
        System.out.println("Nam xuat ban sach\t"+this.year);
        System.out.println("trang thai"+this.status);
        System.out.println("tac gia sach"+this.author);
    }
}
