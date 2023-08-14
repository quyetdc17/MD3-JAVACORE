package bai.hoc.baitap2;

import java.util.Scanner;

public class Person {
    protected String fullName;
    protected boolean gender;
    protected String address;

//    public Person(String fullName, boolean gender, String address) {
//        this.fullName = fullName;
//        this.gender = gender;
//        this.address = address;
//    }

    public Person() {
    }

    public Person(String fullName, boolean gender, String address) {
        this.fullName = fullName;
        this.gender = gender;
        this.address = address;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void input(Scanner sc){
        sc = new Scanner(System.in);
        System.out.print("Enter full name:\t");
        this.fullName = sc.nextLine();
        System.out.print("Enter gender:\t");
        this.gender = Boolean.parseBoolean(sc.nextLine());
        System.out.print("Enter address:\t");
        this.address = sc.nextLine();
    }
    public String toString(){
        return  "full name:\t"+ fullName +"\ngender:\t"+ gender +"\naddress:\t"+ address;
//        return MessageFormat.format("Full name: %s\nGender: %s\n Address: %s\n", fullName, gender, address)
    }

}
