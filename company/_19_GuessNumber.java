package com.company;

import java.util.Random;
import java.util.Scanner;


class Game{
    int RandomNumber;
    int UserNumber;
    int noOfGuesses = 0;

    //constructor for generating random value...
         Game(){
            Random obj = new Random();
            int RandNum = obj.nextInt(100);
            this.RandomNumber = RandNum;
            System.out.println("Random number is generated inside the memory !");
        }
    public String TakeUserInput(){
        Scanner user = new Scanner(System.in);
        System.out.println("Guess The Number");
        int UserNum = user.nextInt();
        this.UserNumber = UserNum;
        System.out.println("Reading..."+UserNumber);
       // user.close();// Closing the object by the .close() method.
        return "Process Terminated";
    }
    public void isCorrectNumber() {
        boolean[] ConditionArray = {true,false};
        noOfGuesses += 1;//updating the value while calling this function inside the loop.

        if(this.UserNumber == this.RandomNumber)
        {
            System.out.println("Congratulations !! Your guess got Correct !");
            System.out.println("Your Number is "+ ConditionArray[0]);

            //Input
            Scanner User = new Scanner(System.in);
            System.out.println("Do you want to watch your number of guess[1-YES],[2-NO]");
            int UserChoice = User.nextInt();

            if(UserChoice == 1){
                System.out.println("Number of Guesses " +noOfGuesses);
            }
            else if (UserChoice == 2){
                System.out.println("Terminated the game");
            }
            else{
                System.out.println("Invalid input provided by the user");
            }
            System.out.println("--------------------------");
            System.exit(0);//succesfully terminating the function
        }// ending the if Condition
      else if(this.UserNumber < this.RandomNumber){
            System.out.println("Guessed number is smaller than Random Number...");
            System.out.println("Your Number is "+ConditionArray[1]);
            System.out.println("----------------------");
        }
      else if (this.UserNumber > this.RandomNumber){
            System.out.println("Guessed Number is greater than Random Number");
            System.out.println("Your Number is "+ConditionArray[1]);
            System.out.println("---------------------------");
        }
    }// isCorrectNumber funtion is closed

    //This is the main method...
    public String MainMethod(){

        int counter = 0;
        while(counter <= 100){
            //Two most important functions..
            TakeUserInput();
            isCorrectNumber();
            counter++;
        }
        return "Process Terminated";
    }
}
public class _19_GuessNumber {
    public static void main(String[] args) {

       /* create a class Game, which allows a user to play "Guess the Number"
                game once.Game should have the following methods:
                1. Constructor to generate the random number
                2. takeUserInput() to take a user input of number
                3. isCorrectNumber() to detect weather the number entered by the user is true
                4. getter and setter for noOfGuesses
                   use properties such as noOfGuesses(int), etc to get this task done!

                */
        System.out.println("----------Guess the number----------");

        Game obj =  new Game();
        obj.MainMethod();
        System.out.println("--------------------------------------");
    }
}
