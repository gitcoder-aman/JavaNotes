package com.company;

class InvalidInputException extends Exception{

    @Override
    public String toString() {
        return "Cannot add 8 and 9";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}
class MaxInputException extends Exception{

    @Override
    public String toString() {
        return "Input cant be greater than 100000";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}
class CannotDivideByZeroException extends Exception{

    @Override
    public String toString() {
        return "Cannot divide by 0";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}
class CustomCalculator {
    double add(double a, double b) throws InvalidInputException,MaxInputException{
        if(a>100000 || b>100000){
            throw new MaxInputException();
        }
        if(a==8 || b==9)
            throw new InvalidInputException();
        return a+b;
    }
    double subtract(double a, double b) throws MaxInputException{
        if(a>100000 || b>100000){
            throw new MaxInputException();
        }
        return a-b;
    }
    double multiply(double a, double b) throws MaxInputException{
        if(a>100000 || b>100000){
            throw new MaxInputException();
        }
        return a*b;
    }
    double Divide(double a, double b) throws CannotDivideByZeroException,MaxInputException{
        if(a>100000 || b>100000){
            throw new MaxInputException();
        }
        if(b == 0){
            throw  new CannotDivideByZeroException();
        }
        return a/b;
    }
}
public class _52_harry_Calculator {
    public static void main(String[] args) throws InvalidInputException,CannotDivideByZeroException,MaxInputException{

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
        CustomCalculator c = new CustomCalculator();
        //c.add(8,9);
       // c.Divide(6,0);
        c.multiply(5,10000000);
    }
}
