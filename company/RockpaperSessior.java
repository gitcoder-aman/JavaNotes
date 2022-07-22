package com.company;

import java.util.Random;
import java.util.Scanner;

public class RockpaperSessior {
    public static void main(String[] args) {
        System.out.println("Welcome to Rock:Paper:Sessior Game");
        System.out.println("enter 0 : ROCK \t1:PAPER\t 2:SESSIOR");
        Scanner sc=new Scanner(System.in); //for input from user
        Random rd=new Random(); // for input from computer
        int n=1;
        int count=0; // for count how many won are you ?
        while(n<=3){
            System.out.println("Your turn enter number");
            int user_input=sc.nextInt();

            //only message show who are you entered a number from a user
            switch (user_input) {
                case 0 -> {
                    System.out.println("You select Rock");
                }
                case 1 -> {
                    System.out.println("You select Paper");
                }
                case 2 -> {
                    System.out.println("You select Sessior");
                }
            }
            System.out.println("Computer's turn ");
            int comp_input=rd.nextInt(3); // computer takes a number < 5
            //only message show to user who entered a number from computer
            switch (comp_input) {
                case 0 -> {
                    System.out.println("Computer select Rock");
                }
                case 1 -> {
                    System.out.println("Computer select Paper");
                }
                case 2 -> {
                    System.out.println("Computer select Sessior");
                }
            }
            if(user_input==comp_input){
                System.out.println("Draw match");
            }
            else if((user_input==0&& comp_input==2)||(user_input==1 && comp_input==0)||(user_input==2 && comp_input==1))
            {
                System.out.println("Congratulations! You win the match");
                count++;
            }
            else {
                System.out.println("You not win,Better luck next time");
            }
            n++;
        }
        System.out.println("you won mathes "+count+ " times");
    }
}
