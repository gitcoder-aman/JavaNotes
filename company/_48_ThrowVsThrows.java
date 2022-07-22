package com.company;

class NegativeRadiusException extends Exception{ //Custom Exception
    @Override
    public String toString() {
        return "Radius cannot be negative!";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}
public class _48_ThrowVsThrows {

    public static double area(int r) throws NegativeRadiusException{
        if (r < 0){
            throw new NegativeRadiusException();
        }
        double result = Math.PI *r *r;
        return result;
    }
    public static int divide(int a,int b) throws ArithmeticException{

        //Made By Harry
        int result = a/b;
        return result;
    }

    public static void main(String[] args) {

        //Shivam - user divide function created by Harry
        try{
            /*int c = divide(6,0);
            System.out.println(c);*/
            double ar = area(8);
            System.out.println(ar);
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
