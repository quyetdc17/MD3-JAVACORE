import java.util.Scanner;

public class baiTap {
    public static void main(String[] args) {
/**
 * Viết chương trình Java, nhập vào mảng n số nguyên (n nhập từ bàn phím).
 * Hiển thị ra màn hính số chữ số dương liên tiếp lớn nhất trong mảng
 * */
        Scanner sc = new Scanner(System.in);
        System.out.println("nhao so phan tu cua mang:");
        int n = Integer.parseInt(sc.nextLine());
        int[] numbers = new int[n];
//        int[] numbers = {};
//
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("nahp vao mang so");
            numbers[i] = Integer.parseInt(sc.nextLine());
        }
        int count =0, countMax = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]<0|| i== n-1){
                if (count > countMax){
                    countMax = count;
                }
                count= 0;
            }else {
                count ++;
            }
        }
        System.out.println("max length is"+ countMax);
    }
}
