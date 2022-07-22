package com.company;

class Mythread extends Thread{

    @Override
    public void run() {

        Thread th = Thread.currentThread();
        String ThreadName = th.getName();

        for (int i = 1; i <= 10; i++){
            System.out.println(i + " "+ ThreadName);

            try{
                Thread.sleep(250); //Thread go to block state through sleep method
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
public class _42_Practice2_CurrentThread {
    public static void main(String[] args) {

        Mythread th1 = new Mythread(); // Born State
        th1.start();  // Runnable State

        Thread th = Thread.currentThread();
         String ThreadName = th.getName();
        for (int i = 1; i<=10; i++){

            System.out.println(i + " "+ ThreadName);

            try{
                Thread.sleep(500); // Block State
            }
            catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
