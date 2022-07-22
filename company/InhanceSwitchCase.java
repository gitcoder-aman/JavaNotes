package com.company;

import java.util.Scanner;

public class InhanceSwitchCase {
    public static void main(String[] args) {
     String var = "Subham";
        //inhance Switch in Java
        switch (var) {

            case "Saurabh" ->{
                System.out.println("You are going to become an Adult1");
                System.out.println("You are going to become an Adult2");
            }
            case "Subham"-> System.out.println("You are going to join a Job");
            case "Vishakha"-> System.out.println("You are going to get retired");
            default ->System.out.println("Enjoy your life");
        }
//       int choose;
//        Scanner sc = new Scanner(System.in);
//        choose = sc.nextInt();
//        switch (choose){
//
//            case 1:
//                System.out.println("You are going to become an Adult");
//                break;
//            case 2:
//                System.out.println("You are going to join a Job!");
//                break;
//            case 3:
//                System.out.println("You are going to get retired");
//            default:
//                System.out.println("Enjoy your Life!");
//
//        }
    }
}
