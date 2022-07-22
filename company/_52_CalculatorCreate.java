package com.company;


import java.util.Scanner;

class divideByZero extends Exception{
    @Override
    public String toString() {
        return "Error: The divisor given is zero";
    }
    @Override
    public String getMessage() {
        return "Suggestion:Please Select any other number(Except zero)";
    }
}
class ValueLimitReached extends Exception{
    @Override
    public String toString() {
        return "Error: Value cannot be larger than 100000";
    }
    @Override
    public String getMessage() {
        return "Suggestion:Please Enter the value less than 100000";
    }
}
class MultiplyLimitReached extends Exception{
    @Override
    public String toString() {
        return "Error: Value cannot be larger than 7000";
    }
    @Override
    public String getMessage() {
        return "Suggestion:Please Enter the value less than 7000";
    }
}
class InvalidInput extends  Exception{
    @Override
    public String toString() {
        return "Error: Invalid option Entered";
    }
    @Override
    public String getMessage() {
        return "Suggestion:Please Choose option among-> \n - \n + \n * \n /";
    }
}
public class _52_CalculatorCreate {

    public static void main(String[] args) {

        /*
        You have to create a custom calculator with following operations:
        1. + -> Addition
        2. - -> Subtraction
        3. * -> Multiply
        4. / -> Division

       Which throws the following exceptions:
       1. Invalid input Exception ex: 8 & 9
       2. Cannot divide by 0 Exception
       3. Max Input Exception if any of the input is greater than 100000
       4. Max Multiplier Reached Exception - Don't allow any multiplication input to be greater than 7000
        */
        System.out.println("What do you want to operation in this Calculator");
        System.out.println("+) Addition -) Subtraction *) Multiply /) Division");
        Scanner sc = new Scanner(System.in);

        //function
        System.out.println("Enter the option");
        String option = sc.next();

        System.out.println("Enter the number 1");
        int num1 = sc.nextInt();
        System.out.println("Enter the number 2");
        int num2 = sc.nextInt();

                switch (option) {
                    case "/" -> {
                        if(num2 == 0){
                            try{
                                throw new divideByZero();
                             }
                            catch(Exception e){
                                System.out.println(e.toString());
                                System.out.println(e.getMessage());
                            }
                        }
                        else{
                            System.out.println("The Result is "+ (num1/num2));
                        }

                    }
               case "+" ->{
                        if(num1 >= 100000 || num2  >= 100000){
                            try{
                                 throw new ValueLimitReached();
                            }
                            catch (Exception e){
                                System.out.println(e.toString());
                                System.out.println(e.getMessage());
                            }
                        }
                        else{
                            System.out.println("The Result is " + (num1+num2));
                        }
                    }
                    case "-" ->{
                        if(num1 >= 100000 || num2 >= 100000) {
                         try{
                             throw new ValueLimitReached();
                         }
                         catch(Exception e){
                             System.out.println(e.toString());
                             System.out.println(e.getMessage());
                         }
                        }
                        else{
                            System.out.println("The Result is "+ (num1-num2));
                        }
                    }
                    case "*" ->{
                        if (num1 >= 7000 || num2 >= 7000){
                            try{
                                throw new MultiplyLimitReached();
                            }
                            catch(Exception e){
                                System.out.println(e.toString());
                                System.out.println(e.getMessage());
                            }
                        }
                        else{
                            System.out.println("The Result is "+ (num1 * num2));
                        }
                    }
                    default -> {
                        try{
                            throw new InvalidInput();
                        }
                        catch (Exception e){
                            System.out.println(e.toString());
                            System.out.println(e.getMessage());
                        }
                    }
                }
         }
}
