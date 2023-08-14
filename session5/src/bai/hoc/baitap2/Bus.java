package bai.hoc.baitap2;

import java.util.Scanner;

public class Bus {
    private  int currenSize;
    private Person[] customer;
    private String busNo;

//    tao doi tuong voi do rong cua xe bus
    public Bus(int size) {
        customer = new Person[size];
        currenSize= 0;
        busNo = "";
    }

    public int getCurrenSize() {
        return currenSize;
    }

    public void setCurrenSize(int currenSize) {
        this.currenSize = currenSize;
    }

    public Person[] getCustomer() {
        return customer;
    }

    public void setCustomer(Person[] customer) {
        this.customer = customer;
    }

    public String getBusNo() {
        return busNo;
    }

    public void setBusNo(String busNo) {
        this.busNo = busNo;
    }
    public boolean push(Person person){
//        kiem tra xem xe con cho khong
        if (currenSize < customer.length){
            customer[currenSize] = person;
            currenSize++;
            return true;
        }else {
            return false;
        }
    }

    public void report(){
        int countStudent = 0, countEmployee = 0;
        for (int i = 0; i < currenSize; i++) {
            if (customer[i] instanceof Student) countStudent++;
            if (customer[i] instanceof Employee) countEmployee++;
        }
        System.out.println("Students in bus:\t"+ countStudent);
        System.out.println("Employees in bus:\t"+ countEmployee);
    }
    Scanner sc = new Scanner(System.in);
    public void searchBySchool(String schoolName){
        System.out.print("search school name:\t");
        String search = sc.nextLine();
        for (int i = 0; i < currenSize; i++) {
            Student student = new Student();
            if (customer[i] instanceof Student){
                if (student.getSchoolName().equals(search)){
                    System.out.println(toString());
                }
            }
        }
    }
    public void searchByCompany(String companyName){
        String search = sc.nextLine();
        for (int i = 0; i < currenSize; i++) {
            Employee employee = new Employee();
            if (customer[i] instanceof Employee){
                if (employee.getCompanyName().equals(search)){
                    System.out.println(toString());
                }
            }
        }
    }
}
