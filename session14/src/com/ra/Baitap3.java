package com.ra;

public class Baitap3 {
    public static void main(String[] args) {
        ranTh t1 = new ranTh("random");
        oddTh t2 = new oddTh();
        t1.start();
        t2.start();
    }
}
class ranTh extends Thread{
    private String threadName;
    public ranTh(String threadName){
        this.threadName = threadName;
    }
    @Override
    public void run(){
        for (int i = 0; i < 20; i++) {
          int a =  (int) Math.random()*10;
            System.out.println(a);
        }
        super.run();
    }
}
class oddTh extends Thread{

    @Override
    public void run() {
    }

}