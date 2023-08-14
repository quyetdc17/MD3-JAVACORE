package com.ra.trenlop.thuchanh2;

import com.ra.trenlop.thuchanh2.service.ClassService;
import com.ra.trenlop.thuchanh2.service.StudentService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        /**
         * Tạo class Class
         *      // Không bỏ trống,bắt đầu bằng "C", 3 kí tự
         *      private String id;
         *      // Không bỏ trống, IN HOA, từ 12-16 kí tự
         *      private String name;
         * Tạo class Student
         *     // Không bỏ trống,bắt đầu bằng SV, tối đa 4 kí tự
         *     private String id;
         *     // Không bỏ trống, viết IN HOA không dấu
         *     private String name;
         *     // Không bỏ trống, đúng định dạng email
         *     private String email;
         *     // Không bỏ trống,đúng định dạng SĐT
         *     private String phone;
         *     // Không bỏ trống, phải tồn tại trong list classes đã lưu
         *     private String class
         *     // Không bỏ trống, phải tồn tại trong list classes đã lưu
         *     private String classId;
         *     // Không bỏ trống, phải nhập true/false
         *     private boolean status;
         * Viết chương trình Java thực hiện các menu chức năng sau:
         *      1. Quản lý lớp
         *      2. Quản lý sinh viên
         *      3. Thoát
         * ============ Quản lý lớp ============
         *      1. Thêm lớp
         *      2. Sửa lớp
         *      3. Xóa lớp (Không xóa lớp có sinh viên)
         *      4. Xem danh sách lớp sắp xếp theo tên A-Z (gồm Mã lớp, Tên lớp, Tổng số sv)
         *      5. Quay lại
         * ========= Quản lý sinh viên =========
         *      1. Thêm sinh viên
         *      2. Sửa sinh viên
         *      3. Tìm kiếm sinh viên theo tên lớp hoặc tên sinh viên (1 trong 2 điều kiện)
         *      4. Quay lại
         * */

        List<Class> classes = new ArrayList<>();
        List<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        ClassService classService = new ClassService();
        StudentService studentService = new StudentService();

        Class newClass = new Class(studentService);
        newClass.input();

        classService.add(newClass);
        Class newClass1 = new Class(studentService);
        newClass1.input();

        classService.add(newClass1);

        while(true){
            System.out.println("1. Quản lý lớp");
            System.out.println("2. Quản lý sinh viên");
            System.out.println("3. Thoát");
            System.out.println("Chon chuc nang");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:
                    mainClass(sc,classService);
                    break;
                case 2:
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("sai chuc nang");
            }
        }

    }
    public static void mainClass(Scanner sc, ClassService cs){
        while (true) {
            System.out.println("=========== Quản lý lớp ===========");
            System.out.println("1. Thêm lớp");
            System.out.println("2. Sửa lớp");
            System.out.println("3. Xóa lớp");
            System.out.println("4. Hiển thị danh sách lớp (sắp xếp theo tên A-Z)");
            System.out.println("5. Quay lại");
            System.out.print("Chọn chức năng (1-5): ");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    System.out.print("Nhập số lớp cần thêm: ");
                    int n = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < n; i++) {
                        Class c = new Class();
                        c.input();
                        cs.add(c);
                    }
                    break;
                case 2:
                    System.out.print("Nhập ma lớp cần sửa: ");
                    String classId = sc.nextLine();
                    for (Class c: cs.findAll()) {
                        if (classId.equals(c.getId()))
                        cs.edit(c);
                    }

                    break;
                case 3:
                    System.out.print("Nhập lớp cần xóa: ");
                    String delCl = sc.nextLine();
                    for (Class c: cs.findAll()) {
                        if (delCl.equals(c.getId()))
                            cs.remove(c);
                    }
                    break;
                case 4:
                    System.out.println("Danh sách lớp sắp xếp theo tên A-Z");
//                    providers.sort(new Comparator<Provider>() {
//                        @Override
//                        public int compare(Provider o1, Provider o2) {
//                            return o1.getProviderName().compareTo(o2.getProviderName());
//                        }
//                    });
                    //providers.sort((o1, o2) -> o1.getProviderName().compareTo(o2.getProviderName()));
                    for (Class c : cs.findAll()) {
                        c.output();
                    }
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Sai chức năng!");
                    break;
            }
        }
    }
    public static void mainStudent(Scanner sc,StudentService st, ClassService cs){
        while (true) {
            System.out.println("=========== Quản lý lớp ===========");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Sửa sinh viên");
            System.out.println("3. Tìm kiếm sinh viên theo tên lớp hoặc tên sinh viên (1 trong 2 điều kiện)");
            System.out.println("4. Quay lại");
            System.out.print("Chọn chức năng (1-5): ");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    System.out.print("Nhập số lớp cần thêm: ");
                    int n = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < n; i++) {
                        Student newStudent = new Student();
                        newStudent.input();
                        st.add(newStudent);
                    }
                    break;
                case 2:
                    System.out.print("Nhập ma sinh viên cần sửa: ");
                    String stId = sc.nextLine();
                    for (Student c: st.findAll()) {
                        if (stId.equals(c.getId()))
                            st.edit(c);
                    }

                    break;
                case 3:
                    System.out.print("Nhập tên cần tìm kiếm: ");
                    String find = sc.nextLine();
                    for (Student c: st.findAll()) {
                        if (find.toUpperCase().equals(c.getName().toUpperCase()))
                            System.out.println(c);
                    }
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Sai chức năng!");
                    break;
            }
        }
    }
}


