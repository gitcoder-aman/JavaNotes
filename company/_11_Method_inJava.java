package com.company;

//just like a function
public class _11_Method_inJava {
    static int logic(int x,int y){
        int z;
        if(x>y){
            z = x+y;
        }
        else{
            z = (x+y)*5;
        }
        return z;
    }
    public static void main(String[] args) {
       int a = 5;
       int b = 7;
       int c;
       //Method invocation using object creation
        //_11_Mehtod_inJava obj = new _11_Mehtod_inJava();
        //c = obj.logic(a,b);
       c = logic(a,b);
       System.out.println("Sum " +c);
    }
}
