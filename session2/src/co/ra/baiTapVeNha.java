package co.ra;
import java.util.Scanner;

public class baiTapVeNha {
    /**
     *  email.matches("^[\\w.]+@[\\w.-]+\\.[a-z]{2,4}$")
     *  phone.matches("^0[98765432][\\d]{8}$")
     * Các thông tin cần nhập đúng định dạng yêu cầu,
     * nếu nhập sai thông tin nào, yêu cầu nhập lại ngay
     * thông tin đó (đến khi đúng thì thôi)
     * rồi mới được nhập tiếp thông tin tiếp theo
     * */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        System.out.println("Họ và tên: (full name)");
//        String fullName = scan.nextLine();
//        boolean checkName = fullName.matches("[a-zA-Z]{10,16}");
//        System.out.println(checkName);
        String[] students = new String[5];
        for (int i = 0; i < students.length; i++) {
            System.out.println("Họ và tên: (full name) thu ");
            students[i] = scan.nextLine();
        }
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students.length; j++) {
                if (students[i].compareTo(students[j]) >0){
                    String temp  = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }

        }
        System.out.println();
//        if (checkName == true ){
//            System.out.println("ss");
//        }else {
//            while(checkName = false){
//                System.out.println("Họ và tên: (full name)");
//                fullName = scan.nextLine();
//            }
//        }
    }
}
