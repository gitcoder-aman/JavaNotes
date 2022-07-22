package com.company;

class MyThreadRunnable3 implements Runnable{

    //Constructor
    MyThreadRunnable3(){
        new Thread(this).start();
    }
    @Override
    public void run() {
        for (int i = 0; i <=10; i++){
            System.out.println(i);
        }
    }
}
public class _39_part2_Thread_Constructor_Runnable {
    public static void main(String[] args) {

        MyThreadRunnable3 th = new MyThreadRunnable3();
    }
}
