package com.company;

import java.util.Scanner;

public class _43_Errors {
    public static void main(String[] args) {

        //SYNTAX ERROR DEMO
            //int a = 5  // ERROR : no semicolon
            // b = 8; // ERROR: b not declared !
            // System.out.println(a);

        //LOGICAL ERROR DEMO
        //Write a program to print all prime numbers b/w 1 to 10

        System.out.println(2);
        for (int i = 1; i < 5; i++){
            System.out.println(2*i+1); // 9 is not prime number.
        }

        //RUNTIME ERROR (EXCEPTION)
            int k;
            Scanner sc = new Scanner(System.in);
            k = sc.nextInt();
            System.out.println("Integer part 100 divided by k is "+ 1000/k);
     // when user input 0 number than throw exception . This type of error is Runtime error.
    }
}
