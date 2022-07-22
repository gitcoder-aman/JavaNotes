package com.company;

import java.util.Scanner;

public class ifelseCheckWebsite {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String website = sc.next();
      //endWith function is return boolean type in java
        if(website.endsWith(".org")){
            System.out.println("This is Organizational website");
        }
        else if(website.endsWith(".com")){
            System.out.println("This is Commercial website");
        }
        else if (website.endsWith(".in")){
            System.out.println("This is an Indian website");
        }
    }
}
