package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class string_4_topic {
    public static void main(String[] args) {
       // String name = new String("Aman");
        String name = "Aman";
        System.out.print("The name is :");
        System.out.println(name);
        int a = 6;
        float b = 5.6454f;

        System.out.printf("The value of a is %d and Value of b is %8.2f",a,b);
        System.out.println("\n");
        System.out.format("The Value of a is %d and Value of b is %f ",a,b);

        //user input process
        System.out.println("\n");
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.println(st);


    }
}
