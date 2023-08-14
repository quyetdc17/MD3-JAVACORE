package opject.clas.thuchanh.baitap2;

import java.util.Arrays;
import java.util.Scanner;

public class baiTap2 {
    public static void main(String[] args) {
        /**

         *  Tạo các phương thức get, set cho các thuộc tính, thuộc tính markAvg, rank sẽ chỉ
         *  có phương thức get.
         *  Khai báo constructor không tham số và có tham số (trừ markAvg, rank) để khởi tạo
         *  đối tượng.
         *  Định nghĩa phương thức input() để nhập thông tin sinh viên và output() để hiển thị
         *  thông tin sinh viên.
         *  Định nghĩa phương phức calculatorMarkAvg() tính điểm trung các môn (markAvg) và
         *  xác định xếp loại (rank) (
         *      markAvg <= 5 => rank=TRUNG BÌNH,
         *      5 < markAvg < 8 => rank=KHÁ,
         *      markAvg >= 8 => rank=GIỎI
         *  )
         *
         *
         *  Viết chương trình Java thực hiện các yêu cầu sau:
         *  1. Nhập thông tin n sinh viên
         *  2. Hiển thị danh sách sinh viên
         *  3. Tính điểm và xếp loại tất cả sinh viên
         *  4. Sắp xếp danh sách sinh viên theo điểm trung bình giảm dần
         *  5. Tìm kiếm sinh viên theo tên (tìm tương đối)
         *  6. Thoát
         * */

        Scanner sc = new Scanner(System.in);
        Student[] students = null;
//        Student quyetdc = new Student("SV01","DO C","QUYET",9,9,9);
        while (true){
            System.out.println("1. Nhập thông tin n sinh viên");
            System.out.println("2. Hiển thị danh sách sinh viên");
            System.out.println("3. Tính điểm và xếp loại tất cả sinh viên");
            System.out.println("4. Sắp xếp danh sách sinh viên theo điểm trung bình giảm dần");
            System.out.println("5. Tìm kiếm sinh viên theo tên (tìm tương đối)");
            System.out.println("6. Thoát");
            int sentaku = Integer.parseInt(sc.nextLine());

            switch (sentaku){
                case 1:
                    System.out.println("Số sinh viên cần nhập");
                    int n = Integer.parseInt(sc.nextLine());
                    students = new Student[n];
                    for (int i = 0; i < n; i++) {
                        Student newStudent = new Student();
                        newStudent.inputInf();

                        students[i] = newStudent;
                    }
                    System.out.println("Tạo thành công");
                    break;
                case 2:
                    System.out.println("Danh sách sinh viên: ");
                    for (Student stu : students) {
//                        stu.calculatorMarkAvg();
                        stu.outputInf();
                        System.out.println("/**********/");
                    }
                    break;
                case 3:
                    System.out.println("điểm và xếp loại sinh viên: ");
                    for (Student st : students) {
                        st.calculatorMarkAvg();
                    }
                    break;
                case 4:
                    Arrays.sort(students,(st1,st2) -> Double.compare(st1.getMarkAvg(),st2.getMarkAvg()));
//                    });
//                    for (int i = 0; i < students.length; i++) {
//                        for (int j = 0; j < students.length; j++) {
//                            if (students[i].getMarkAvg() > students[j].getMarkAvg()){
//                                int temp = students[i];
//
//                            }
//                        }
//                    }
                case 5:
                    System.out.println("Nhập tên sinh viên");
                    String _name = sc.nextLine();
                    for (Student st: students) {
                        if (st.getFirstName().toLowerCase() == _name || st.getLastName().toLowerCase() == _name){
                            st.outputInf();
                        }
                    }
                    break;
                case 6:
                    System.out.println("Thoát chương trình...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chọn sai chức năng");
            }
        }
    }
}
