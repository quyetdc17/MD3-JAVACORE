package opject.clas.thuchanh.baitap2;

import java.util.Scanner;

public class Student {
    String id;
    String firstName;
    String lastName;
    double markJS;
    double markHTML;
    double markCSS;
    double markAvg;
    String rank;

    public Student() {
    }

    public Student(String id, String firstName,
                   String lastname, double markJS,
                   double markHTML, double markCSS) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastname;
        this.markJS = markJS;
        this.markHTML = markHTML;
        this.markCSS = markCSS;
        this.markAvg = markAvg;
        this.rank = rank;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastname(String lastName) {
        this.lastName = lastName;
    }

    public double getMarkJS() {
        return markJS;
    }

    public void setMarkJS(double markJS) {
        this.markJS = markJS;
    }

    public double getMarkHTML() {
        return markHTML;
    }

    public void setMarkHTML(double markHTML) {
        this.markHTML = markHTML;
    }

    public double getMarkCSS() {
        return markCSS;
    }

    public void setMarkCSS(double markCSS) {
        this.markCSS = markCSS;
    }

    public double getMarkAvg() {
        return markAvg;
    }

    public String getRank() {
        return rank;
    }
    public void inputInf(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID Student: (SV?)");
        this.id = sc.nextLine();
        System.out.print("Enter firstName: ");
        this.firstName = sc.nextLine();
        System.out.print("Enter lastName: ");
        this.lastName = sc.nextLine();
        System.out.print("Enter him of mark JS: ");
        this.markJS = Double.parseDouble(sc.nextLine());
        System.out.print("Enter him of mark HTML: ");
        this.markHTML = Double.parseDouble(sc.nextLine());
        System.out.print("Enter him of mark CSS: ");
        this.markCSS = Double.parseDouble(sc.nextLine());
    }
    public void outputInf(){
        System.out.println("Student ID: "+ this.id);
        System.out.println("Student firstName: \t"+ this.firstName);
        System.out.println("Student lastName: \t"+ this.lastName);
        System.out.println("Student markJS:\t "+ this.markJS);
        System.out.println("Student markHTML: \t"+ this.markHTML);
        System.out.println("Student markCSS: \t"+ this.markCSS);
        System.out.println("Student markAvg: \t"+ this.markAvg);
        System.out.println("Student rank: \t"+ this.rank);
    }
    public void calculatorMarkAvg(){
//        for (int i = 0; i < ; i++) {
//
//        }
        this.markAvg = (this.markCSS+this.markJS+this.markHTML)/3;
        if (this.markAvg <= 5){
            rank= "TRUNG BÌNH";
        }else if (5 < this.markAvg && this.markAvg < 8){
            rank="KHÁ";
        }else if (this.markAvg >= 8){
            rank="GIỎI";
        }
        System.out.println("Student ID: "+ this.id);
        System.out.println("Student lastName: \t"+ this.lastName);
        System.out.println("Student markAvg: \t"+ this.markAvg);
        System.out.println("Student rank: \t"+ this.rank);
    }
}
