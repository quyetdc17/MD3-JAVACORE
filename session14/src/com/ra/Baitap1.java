package com.ra;

public class Baitap1 {
    public static void main(String[] args) {

        EvenThread t2 = new EvenThread();//khai bao t2 truoc code chay tu tren xuong duoi
        OddThread t1 = new OddThread(t2);

        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Complete!");
    }
}

class OddThread extends Thread{
    private Thread evenThread;

    public OddThread(Thread evenThread) {
        this.evenThread = evenThread;
    }

    @Override
    public void run() {
        try {
            evenThread.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        for (int i = 1; i < 10; i++) {
            if (i%2!=0){
                System.out.println("odd thread "+i);
                try {
                    Thread.sleep(10);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }

    }
}
class EvenThread extends Thread{
    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            if (i%2==0){
                System.out.println("even thread "+i);
                try {
                    Thread.sleep(15);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }

    }
}
