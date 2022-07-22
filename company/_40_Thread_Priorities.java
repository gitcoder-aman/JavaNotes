package com.company;

class MyThre1 extends Thread{
    public MyThre1(String name){
        super(name);
    }

    @Override
    public void run() {
        int i = 1;
        while(true) {
            System.out.println("Thank u " + this.getName());
            //i++;
        }
    }
}
public class _40_Thread_Priorities {
    public static void main(String[] args) {

        //Ready Queue: T1 T2 T3 T4 T5
        MyThre1 t1 = new MyThre1("Aman1");
        MyThre1 t2 = new MyThre1("Aman2");
        MyThre1 t3 = new MyThre1("Aman3");
        MyThre1 t4 = new MyThre1("Aman4");
        MyThre1 t5 = new MyThre1("Aman5 (most Important)");

        // This is all Methods
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
