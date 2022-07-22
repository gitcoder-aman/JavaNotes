package com.company;

import java.util.Random;
import java.util.Scanner;

public class RandomFunctioncall {
    public static void main(String[] args) {

        Random rd = new Random();
        int computer = rd.nextInt(5); //computer take a number < 5

        System.out.println("Let computer selected number = "+computer);
    }
}
