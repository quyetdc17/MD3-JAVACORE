package bai.hoc.baitap2;

import java.text.MessageFormat;
import java.util.Scanner;

public class Student extends Person{
    private String schoolName;

    public Student() {
    }

    public Student(String fullName, boolean gender, String address, String schoolName) {
        super(fullName, gender, address);
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public void  input(Scanner sc){
        super.input(sc);
        System.out.println("Enter school name:\t");
        schoolName = sc.nextLine();
    }
    @Override
    public String toString() {
        return  "school :\t" + schoolName + '\''
//                + ", fullName='" + fullName + '\'' +
//                ", gender=" + gender +
//                ", address='" + address + '\''
                ;

//        return MessageFormat.format("%sTrường: %s\n", super.toString(), schoolName);
    }

}
