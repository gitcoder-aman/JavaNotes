package com.company;

public class _44_Try_Catch {
    public static void main(String[] args) {

        int a = 6000;
        int b = 0;
        //Without try
        /*int c = a/b;
        System.out.println(c);*/

        //With try
        try{
            int c = a/b;
            System.out.println("The Result is: " +c);
        }
        catch(Exception e){
            System.out.println("We failed to divide. Reason:");
            System.out.println(e); // Print the whatever exception throw
        }
        System.out.println("End of the Program");

    }
}
