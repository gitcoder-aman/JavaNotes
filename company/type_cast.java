package com.company;

import java.io.*;
/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;*/

public class type_cast {
    public static void main(String[] args) throws IOException {

        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in) );
        System.out.println("Enter Float Number");
        float t;
        t = Float.parseFloat(obj.readLine());
        System.out.println(t);
    }
}
