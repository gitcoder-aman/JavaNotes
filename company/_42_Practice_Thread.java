package com.company;

class PracticeA extends Thread{
    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Good Morning");
        }
    }
}
class PracticeB extends Thread{
    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Welcome");
        }
    }
}
public class _42_Practice_Thread {
    public static void main(String[] args) {

        PracticeA p1 = new PracticeA();
       // p1.setPriority(6);
        PracticeB p2 = new PracticeB();
       // p2.setPriority(9);
        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());

        System.out.println(p2.getState());
        p1.start();
        p2.start();
        System.out.println(p2.getState());

        /*currentThread()
        Returns a reference to the currently executing thread object.*/
        System.out.println(Thread.currentThread().getState());
    }
}
