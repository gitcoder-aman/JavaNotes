package com.company;

class MyThreadRunnable1 implements Runnable{

    @Override
    public void run() {
        int i = 1;
        while(i < 4000) {
            System.out.println("I am a thread 1 not a threat 1");
            i++;
        }
    }
}
class MyThreadRunnable2 implements Runnable{

    @Override
    public void run() {
        int i = 1;
        while(i < 4000) {
            System.out.println("I am a thread 2 not a threat 2");
            i++;
        }
    }
}
public class _37_Runnable_Interface_Thread {
    public static void main(String[] args) {

        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);

        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}
