package com.company;

import java.util.Scanner;

public class _14_Recursion {

    static int factorial(int n) {

        if(n==0 || n==1){
            return 1;
        }
        else {
            return n * factorial(n-1);
        }
    }
   /* static void fibonacci(int n){
         int n1 = 0, n2 = 1, n3 = 0;
        if(n > 0){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;

            System.out.print(n3 + " ");
            fibonacci(n-1);
        }

    }*/
    static  int fib(int n){
        // Base case
        if(n <= 1){
            return n;
        }
        //Recursive call
        return fib(n - 1) + fib(n-2);
    }

    public static void main(String[] args) {

        int x = 4;
        int number =10;
        System.out.println("The Value of factorial x is: "+factorial(x));

        System.out.println("Fibonacii Series");
        for (int i = 0; i < number; i++){
            System.out.print(fib(i) + " ");
        }
//        fibonacci(number-2);
    }
}
