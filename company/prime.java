package com.company;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int count = 0;
        a = sc.nextInt();

        for (int i = 2; i <= a; i++){
            if(a % i == 0)
             count++;
        }
        if(count != 1){
            System.out.println("Not a prime Number");
        }
        else {
            System.out.println("Prime Number");
        }
    }
}
