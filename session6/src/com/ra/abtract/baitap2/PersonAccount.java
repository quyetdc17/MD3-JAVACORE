package com.ra.abtract.baitap2;

import java.util.Scanner;

public class PersonAccount extends Account{
    double fee;

    public PersonAccount(){

    }
    public PersonAccount(String accountNo, String customerName, double balance, double fee) {
        super(accountNo, customerName, balance);
        this.fee = fee;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
    Scanner sc = new Scanner(System.in);
    public void withDraw(double amount){
        System.out.println("enter take");
//        double with = Double.parseDouble(sc.nextLine());
        if (balance>= amount){
            balance = balance-amount;
        }
    }
    public void deposite(double amount){
        System.out.println("enter depots");
//        double depo = Double.parseDouble(sc.nextLine());
        balance = balance+ amount;
    }
}
