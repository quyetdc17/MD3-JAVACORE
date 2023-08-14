package bai.hoc.baitap2;

import java.util.Scanner;

public class Employee extends Person{
    private String companyName;
    public Employee(){

    }

    public Employee(String fullName,boolean gender,String address,String companyName) {
        super(fullName, gender, address);
        this.companyName = companyName;
    }

    public Object getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public void input(Scanner sc){
        super.input(sc);
        System.out.print("company name:\t");
        companyName = sc.nextLine();
    }
    @Override
    public String toString() {
        super.toString();
        return "company of Name=" + companyName;
    }
}
