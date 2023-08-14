package com.ra.th;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Account acc = new Account(10000,"Quyet dc");
        Scanner sc = new Scanner(System.in);

        Thread t1 = new Thread(() ->{
            try {
                synchronized (acc) {
                    System.out.println("nhap so tien rut");
                    int money = Integer.parseInt(sc.nextLine());
                    System.out.println("Dang kiem tra so du...");
                    boolean check = acc.checkAccount(money);
                    double newBalance = acc.getBalance()-money;
                    Thread.sleep(3000);
                    if (check) {
                        System.out.println("Dang rut tien...");
                        acc.withdraw(money);
                        System.out.println("Da rut xong! luu y khong de quen tien");
                        System.out.println("So du con lai: "+ newBalance);
                    } else {
                        System.out.println("So du khong kha dung!");
                    }
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        });
        Thread t2 = new Thread(() ->{
            try {
                synchronized (acc) {
                    System.out.println("nhap so tien rut");
                    int money = Integer.parseInt(sc.nextLine());
                    System.out.println("Dang kiem tra so du...");
                    boolean check = acc.checkAccount(money);
                    double newBalance = acc.getBalance()-money;
                    Thread.sleep(3000);
                    if (check) {
                        System.out.println("Dang rut tien...");
                        acc.withdraw(money);
                        System.out.println("Da rut xong! luu y khong de quen tien");
                        System.out.println("So du con lai: "+ newBalance);
                    } else {
                        System.out.println("So du khong kha dung!");
                    }
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        });

        t1.start();
        t2.start();
    }
}
class Account{
    private double balance;
    private String accountName;

    public Account(double balance, String accountName) {
        this.balance = balance;
        this.accountName = accountName;
    }
    public boolean checkAccount(double amount){
        return this.balance - amount >= 0;
    }

    public void deposit(double money){
        double newBalance = this.balance+money;
        try {
            Thread.sleep(110);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        this.balance = newBalance;
    }

    public void withdraw(double amount){

        this.balance -= amount;
    }
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
}