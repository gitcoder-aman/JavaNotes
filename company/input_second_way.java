package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner; // for first way input
//import java.io.*;  // all java io import

class input_second_way {
    public static void main(String[] args) throws IOException {

        int a, b, c;
        String d;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter any two number ");
        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());
        d = br.readLine();
        c = a + b;
        System.out.println("Sum = " + c);
        System.out.println(d);
    }
}
    class input_first_way {
        public static void main(String[] args) {

            System.out.println("Through Scanner  way and say that easy way ");
            int a1, b1, c1;
            Scanner sc = new Scanner(System.in);
            a1 = sc.nextInt();
            b1 = sc.nextInt();
            c1 = a1 + b1;
            System.out.format("Sum = %d", c1);
        }

    }