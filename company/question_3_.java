package com.company;
import java.util.Scanner;
public class question_3_ {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first marks of subject");
        float s1 = sc.nextFloat();
        System.out.println("Enter second marks of subject");
        float s2 = sc.nextFloat();
        System.out.println("Enter third marks of subject");
        float s3 = sc.nextFloat();
        System.out.println("Enter fourth marks of subject");
        float s4 = sc.nextFloat();
        System.out.println("Enter fifth marks of subject");
        float s5 = sc.nextFloat();

        float percentage = ((s1+s2+s3+s4+s5)/500)*100;
        System.out.println("show percentage of all subjects marks");
        System.out.println(percentage + "%");
    }
}
