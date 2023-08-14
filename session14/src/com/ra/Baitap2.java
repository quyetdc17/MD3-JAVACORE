package com.ra;

public class Baitap2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new LazyPrimeFactorization());
        Thread t2 = new Thread(new OptimizedPrimeFactorization());
        t1.start();
        t2.start();
    }
}
class LazyPrimeFactorization implements Runnable {
    private int t1;
    @Override
    public void run(){
        for (int i = 2; i <100 ; i++) {
            int square = (int)Math.sqrt(i);
            for (int j = 2; j < square; j++) {
                if (i%2 !=0){
                    System.out.println(i);
                }try{
                    Thread.sleep(30);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}

class OptimizedPrimeFactorization implements Runnable{

    @Override
    public void run(){
        for (int i = 2; i <100 ; i++) {
            int square = (int)Math.sqrt(i);
            for (int j = 2; j < square; j++) {
                if (i%2 !=0){
                    System.out.println(i);
                }try{
                    Thread.sleep(10);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}
