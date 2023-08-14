import java.util.Arrays;
import java.util.Scanner;

public class baiTap4 {
    public static void main(String[] args) {
        /**
         * Viết chương trình java, nhập vào mảng n số nguyên (n nhập từ bàn phím).
         * Hiển thị ra màn các phần từ từ mảng đã nhập, không hiển thị lại các phần từ đã trùng lặp.
         * VD:
         * Input: [1,3,5,7,9,3,2,3,6,4,2,7]
         * Output: [1,3,5,7,9,2,6,4]
         * goi y  cho 1 mang tam
         * */
        Scanner sc = new Scanner(System.in);
        System.out.println("nhao bao nhieu so");
        int n = Integer.parseInt(sc.nextLine());
        int[] inNumbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("phan tu thu: "+ i);
            inNumbers[i] = Integer.parseInt(sc.nextLine());
        }
//        System.out.println("mảng n số nguyên"+inNumbers);
        int[] temp = new int[n];
        int count = 0;
        boolean checkTemp ;
        for (int i = 0; i < inNumbers.length; i++) {
//            if (!temp.equals(inNumbers[i])){
            checkTemp = false;
            for (int j = 0; j < temp.length; j++) {
                if (temp[j] == inNumbers[i]) {
                    checkTemp = true;
                }
//            }
            }
            if (!checkTemp){
                temp[count] = inNumbers[i];
                count++;
//                System.out.print(checkTemp);
            }
            System.out.println();
        }
        for (int i = 0; i < count; i++) {
            System.out.print(temp[i]+"\t");
        }
    }
}
