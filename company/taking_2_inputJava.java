package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;
public class taking_2_inputJava {
    public static void main(String[] args) {
        System.out.println("Taking input from user ");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number 2");
        int b  = sc.nextInt();
        sc.nextLine();  //  create buffer
//        System.out.println("Enter number 1");
//        // int a  = sc.nextInt();
//        float a = sc.nextFloat();

//        float b = sc.nextFloat();
//
//        float sum = a + b;
//        System.out.println("The sum of these number is ");
//        System.out.println(sum);

  //      boolean b1 = sc.hasNextInt();
  //      System.out.println(b1);

        //input string
        System.out.println("Enter a string");
        // String str = sc.next(); // not taking with space string
        String str = sc.nextLine(); //with space take string
        System.out.println(str);



    }
}
