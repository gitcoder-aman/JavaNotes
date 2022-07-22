package com.company;

class MyThread5 extends Thread{
    @Override
    public void run() {
       /* try{  // going to dead Lock
            this.join(); // Represented by th1
        }
        catch(InterruptedException e){
            System.out.println(e);
        }*/
        for (int i = 1; i <= 5; i++){
            System.out.println(i + " " + Thread.currentThread().getName());
        }
    }
}
public class _41_part2_JoinMethod {
    public static void main(String[] args) throws InterruptedException{

        MyThread5 th1 = new MyThread5();
        th1.start();
        th1.join();// waiting main method when till Thread Method execution is completed.
        for (int i = 0; i <=5; i++){
            System.out.println(i + " " + Thread.currentThread().getName());
        }
    }
}
