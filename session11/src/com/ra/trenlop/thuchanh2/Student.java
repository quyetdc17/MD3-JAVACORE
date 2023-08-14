package com.ra.trenlop.thuchanh2;

import java.io.Serializable;
import java.text.MessageFormat;
import java.util.Scanner;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    // Không bỏ trống,bắt đầu bằng SV, tối đa 4 kí tự
    private String id;
     // Không bỏ trống, viết IN HOA không dấu
    private String name;
     // Không bỏ trống, đúng định dạng email
    private String email;
     // Không bỏ trống,đúng định dạng SĐT
    private String phone;
     // Không bỏ trống, phải tồn tại trong list classes đã lưu
    private String className;
     // Không bỏ trống, phải tồn tại trong list classes đã lưu
   private String classId;
     // Không bỏ trống, phải nhập true/false
   private boolean status;

    public Student() {
    }

    public Student(String id, String name, String email,
                   String phone, String className,
                   boolean status) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.className = className;
        this.classId = classId;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) throws Exception{
        if (id== null||id.length()==0)
            throw new Exception("Ma so hoc sinh khong duoc bo trong");
        if (!id.startsWith("SV"))
            throw new Exception("Ma phai bat dau bang SV");
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception{
        if (id== null||id.length()==0)
            throw new Exception("Ten khong duoc bo trong");
        if (!name.matches("^[A-Z\\d]+$"))
            throw new Exception("Tên phải viết IN HOA!");
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) throws Exception{
        if (email== null||email.length()==0)
            throw new Exception("Email khong duoc bo trong");
//        dung dinh dang email
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) throws Exception{
        if (phone == null||phone.length()==0)
            throw new Exception("So dien thoai khong duoc bo trong");
//        dung dinh dang sdt
        this.phone = phone;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) throws Exception{
        if (className== null||className.length()==0)
            throw new Exception("Ten lop khong duoc bo trong");
        this.className = className;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) throws Exception{
        if (classId== null||classId.length()==0)
            throw new Exception("ID lop khong duoc bo trong");
        this.classId = classId;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) throws Exception{
        if (id.length()==0)
            throw new Exception("trang thai khong duoc bo trong");
        this.status = status;
    }
    public void input() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Nhập mã So sinh vien: ");
                setId(sc.nextLine());
                break;
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            }
        }
        while (true) {
            try {
                System.out.print("Nhập tên Sinh Vien: ");
                setName(sc.nextLine());
                break;
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            }
        }
        while (true) {
            try {
                System.out.print("Nhập email Sinh Vien: ");
                setEmail(sc.nextLine());
                break;
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            }
        }
        while (true) {
            try {
                System.out.print("Nhập So dien thoai SV: ");
                setPhone(sc.nextLine());
                break;
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            }
        }
        while (true) {
            try {
                System.out.print("Nhập tên lop Sinh Vien: ");
                setClassName(sc.nextLine());
                break;
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            }
        }
        while (true) {
            try {
                System.out.print("Nhập ma lop Sinh Vien: ");
                setClassId(sc.nextLine());
                break;
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            }
        }
        while (true) {
            try {
                System.out.print("Nhập trang thai Sinh Vien: ");
                setStatus(Boolean.parseBoolean(sc.nextLine()));
                break;
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            }
        }
        System.out.println("__________");
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=' " + id + '\'' +
                ", name=' " + name + '\'' +
                ", email=' " + email + '\'' +
                ", phone=' " + phone + '\'' +
                ", className=' " + className + '\'' +
                ", classId=' " + classId + '\'' +
                ", status= " + status +
                '}'+ "\n";
    }
}
