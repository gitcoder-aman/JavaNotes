package com.company;

import java.util.Scanner;
class MaxTriesExceeded extends Exception{
    @Override
    public String toString() {
        return "You have reached maximum limit !";
    }

    @Override
    public String getMessage() {
        return "Maximum limit reached:";
    }
}
public class _51_Practice_Try_Catch {
    public static void main(String[] args) throws MaxTriesExceeded{
        int arr[] = {11,22,33,44,55,66};

        Scanner sc = new Scanner(System.in);
        int index;
        int i = 0;
        while(i <= 5){
            try{
                System.out.println("Enter index: ");
                index = sc.nextInt();
                System.out.println("The value of marks at index "+ index + " is "+ arr[index]);
                break;
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println(" Exception ! Enter the valid Index");
            }

            i++;
        }
        if(i > 5){
            throw new MaxTriesExceeded();
        }
    }
}
