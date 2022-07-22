package com.company;

import java.util.Scanner;

class MyException extends Exception{

    @Override
    public String toString() {
        return super.toString() + " I am toString()";
    }

    @Override
    public String getMessage() {
        return super.getMessage() + " I am getMessage()";
    }
}
public class _47_Exception_Class {
    public static void main(String[] args) {

        int a ;

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if(a < 99){
            try {
              //  throw new MyException();
                throw new ArithmeticException("This is an Exception");
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                //System.out.println(e); //Run toString
                e.printStackTrace();
                System.out.println("Finished");
            }
            System.out.println("Yes Finished");
        }
    }
}
