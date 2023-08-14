import java.util.Scanner;

public class baiTap3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhao so phan tu ma tran:");
        int n = Integer.parseInt(sc.nextLine());
        int m= n;
        int[][] matran = new int[n][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                System.out.printf("number[%d,%d]=",i,j);
                matran[i][j] = Integer.parseInt(sc.nextLine());

            }System.out.println(" ");
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n; j++) {
                System.out.print( matran[i][j]+ " ");
            }System.out.println(" ");
        }
//        System.out.println(matran);
        int sBorder;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n; j++) {
                if (i==0||j==0||i==n-1||j==n-1){
                    sBorder = matran[i][j];
                }
            }System.out.println(" ");
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n; j++) {
                System.out.print( matran[i][j]+ " ");
            }System.out.println(" ");
        }

    }
}
