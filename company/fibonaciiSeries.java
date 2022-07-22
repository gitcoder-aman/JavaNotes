package com.company;

import java.util.Scanner;

public class fibonaciiSeries {

    static  int fibonaciiSeries(int n){
        // Base case
        if(n <= 1){
            return n;
        }
        //Recursive call
        return fibonaciiSeries(n - 1) + fibonaciiSeries(n-2);
    }
    public static void main(String[] args) {

       /* Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int n1 = 0, n2 = 1, n3;

        System.out.print(n1 + " ");
        System.out.print(n2 + " ");

        for (int i = 0; i < n; i++){
            n3 = n1+n2;
            System.out.print(n3 + " ");

            n1 = n2;
            n2 = n3;

        }*/
        int number =10;

        System.out.println("Fibonacii Series");
        for (int i = 0; i < number; i++){
            System.out.print(fibonaciiSeries(i) + " ");
        }

    }
}
