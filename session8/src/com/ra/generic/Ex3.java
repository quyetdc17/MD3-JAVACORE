package com.ra.generic;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true){
            System.out.println("1.Nhập thông tin cho sách");
            System.out.println("2.Hiển thị thông tin sách");
            System.out.println("3.Hiển thị thông tin cho sách theo giá giảm dần");
            System.out.println("4.Hiển thị thông tin cho sách theo giá tăng dần");
            System.out.println("5.Thoát");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:
                    System.out.print("số sách cần nhập \t");
                    int n = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < n; i++) {
                        Book book = new Book();
                        book.input();
                        books.add(book);
//                        System.out.print("Nhập mã số sách:\t");
//                        String id = sc.nextLine();
//                        System.out.print("Nhập tên sách:\t");
//                        String bookName = sc.nextLine();
//                        System.out.print("Nhập tên tác giả:\t");
//                        String author = sc.nextLine();
//                        System.out.print("Nhập tên nhà xuất bản:\t");
//                        String publisher = sc.nextLine();
//                        System.out.print("Nhập giá:\t");
//                        float price = Float.parseFloat(sc.nextLine());
                    }
                    break;
                case 2:
                    for (Book b: books) {
                        System.out.println(books);
                    }
//                    System.out.println(books);
                    break;
                case 3:
                    books.compareTo(books);
//                    books.getPrice()
//                    Arrays.sort(books.this.price());

                    for (Book b: books) {
                        System.out.println(books);
                    }
                    break;
                case 4:
                    break;
                case 5:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Lệnh không đúng");
                    break;
            }
        }
//        public void incrementP(){
//
//        }
//        public void decrementP(){}
    }
}
class Book<E>    {
    private String id;
    private String bookName;
    private String author;
    private String publisher;
    private float price;

    public Book() {
    }

    public Book(String id, String bookName, String author, String publisher, float price) {
        this.id = id;
        this.bookName = bookName;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã số sách:\t");
        id = sc.nextLine();
        System.out.print("Nhập tên sách:\t");
        bookName = sc.nextLine();
        System.out.print("Nhập tên tác giả:\t");
        author = sc.nextLine();
        System.out.print("Nhập tên nhà xuất bản:\t");
        publisher = sc.nextLine();
        System.out.print("Nhập giá:\t");
        price = Float.parseFloat(sc.nextLine());

    }
    public float compareTo(Book compareBook){
        float comparePrice = ((Book) compareBook).getPrice();
        return price - comparePrice;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", price=" + price +
                '}';
    }

}