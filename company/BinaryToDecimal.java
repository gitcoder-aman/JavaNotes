package com.company;

import java.util.Scanner;

import static java.lang.Math.pow;


public class BinaryToDecimal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int bin = sc.nextInt();

        int lastDigit = 0;
        int i = 0;
        int ans = 0;
        while (bin != 0){

            lastDigit = bin % 10;
              ans += lastDigit * pow(2,i);
              i++;
            bin /= 10;
        }
        System.out.println(ans);
    }
}
