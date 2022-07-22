package com.company;

class MyNewThre1 extends  Thread{

    @Override
    public void run() {
        int i = 1;
        while(true){
            System.out.println("I am a thread");
            try {
                Thread.sleep(50); // sleep Method is static method (1 sec = 1000 mili sec)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}
class MyNewThre2 extends Thread{

    @Override
    public void run() {
        int i = 0;
        while(i < 50){
            System.out.println("Thank you :");
            i++;
        }
    }
}
public class _41_Thread_Method {
    public static void main(String[] args) {

        MyNewThre1 t1 = new MyNewThre1();
        MyNewThre2 t2 = new MyNewThre2();

        /*t1.start();
        try{
            t1.join(); // Join Method
        }
        catch (Exception e){
            System.out.println(e);
        }// t2 will not be started when till t1 execution end.
        t2.start();*/

        t1.start();
        t2.start();
    }
}
