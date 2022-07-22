package com.company;

class  MyThreadRunnable extends Thread implements Runnable{

    //Constructor
    public MyThreadRunnable(int i,String name){
        super(name);
    }
    @Override
    public void run() {
        int i = 1;
        while (i < 35){
            System.out.println("I am a Thread of Runnable Interface :");
            i++;
        }
    }
}
public class _39_Thread_Constructor_Runnable {
    public static void main(String[] args) {

        //Creating an object of the MyThreadRunnable class
        MyThreadRunnable bullet = new MyThreadRunnable(23,"Ankit");

        //Creating an object of class thread
        Thread gun = new Thread(bullet);

        gun.start();

        System.out.println("The name of the thread is: "+bullet.getName());
        System.out.println("The id of Thread is : "+ gun.getId());
        System.out.println("Find the state Processing of Thread: "+gun.getState());
    }
}
