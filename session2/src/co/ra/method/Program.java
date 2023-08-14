package co.ra.method;

public class Program {
    public static void main(String[] args) {
        hehe("QuyetDC");
        double s = sum(5,6);
        System.out.println("sum is: "+ s);

        int[] numbers = {1,2,3,4,5,6,7,8,9,0};
        int max = findMax(numbers);
        System.out.println("max is:  "+ max);
    }
    public static void hehe(String name){
        System.out.println("hehe hehe hee! "+ name);
    }
    public static double sum(double a, double b){
        return a + b;
    }
    public static int findMax(int[] numbers){
        int max = numbers[0];
        for (int i = 1;i< numbers.length; i++){
            if (numbers[i] > max){
                max = numbers[i];
            }
        }
        return max;
    }
}
