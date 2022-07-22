package com.company;

// Through extends
class MyThr extends  Thread{

    //Constructor
    public MyThr(String name){
        super(name);
    }

    @Override
    public void run() {
        int i = 1;

        while(true){
            System.out.println("I am a thread:");
            if(i == 34)
                break;
            i++;
        }
    }
}
public class _38_Thread_Constructor_Extends {
    public static void main(String[] args) {

        MyThr t1 = new MyThr("Aman");
       // MyThr t2 = new MyThr("Ram");
        t1.start();
       // t2.start();
        System.out.println("The id of the thread  t is : "+t1.getId());
        System.out.println("The id of the thread  t is : "+t1.getName());
        System.out.println("The id of the thread  t is : "+t1.getState());

        /*System.out.println("The id of the thread  t is : "+t2.getId());
        System.out.println("The id of the thread  t is : "+t2.getName());
        System.out.println("The id of the thread  t is : "+t2.getState());
        */
    }
}
