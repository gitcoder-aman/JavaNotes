package com.company;

public class _12_Method_Overloading {

    //Method Overloading
    static void foo(){
        System.out.println("Hey, Good Morning bro ");
    }
    static  void foo(int a){
        System.out.println("Good Morning "+ a + " bro! ");
    }
    static void foo(int a,int b) {
        System.out.println("Good morning " + b + " bro! ");
    }  // method overloading end

    static  void change1(int a){  // call by value
        a = 70;
    }
    static void change(int [] mark){  // by reference passes
        mark[0] = 77;
    }
    public static void main(String[] args) {

       int x = 10;
       change1(x);
       System.out.println("The value of x after running change1 is "+x);

       int [] marks = {52,73,77,89,98,94};
       change(marks);
        System.out.println("The Value of marks after running change is "+marks[0]);

       //Method Overloading
       foo();
       foo(3000);
       foo(3000,4000);
    }
}
