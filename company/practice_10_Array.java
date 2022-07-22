package com.company;

public class practice_10_Array {
    public static void main(String[] args) {

        //practice 1
       /* float [] marks = {45.7f,67.8f,63.4f,99.2f,100.0f};
        float sum = 0;
        for (float element:marks)
        {
            sum = sum + element;
        }
        System.out.println(sum);*/

        //practice 2
       /* float [] marks = {45.7f,67.8f,63.4f,99.2f,100.0f};
        float num = 45.7f;
        boolean isInArray = false;
        for (float element:marks)
        {
         if(num == element){
             isInArray = true;
             break;
         }
        }
        if(isInArray){
            System.out.println("This value is present in the array");
        }
        else{
            System.out.println("This is not present in the array");
        }*/

         //practice 3
       /* int [][] mat1 = {{1,2,3},
                         {4,5,6}};
        int [][] mat2 = {{2,6,13},
                         {3,7,1}};
        int [][] result = {{0,0,0},
                           {0,0,0}};

        for (int i = 0; i < mat1.length; i++){
            for (int j = 0; j < mat1[i].length; j++){
                System.out.format("Setting Value for i=%d and j=%d\n",i,j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        //Printing the elements of a 2D array
        for (int i = 0; i < mat1.length; i++){
            for (int j = 0; j < mat1[i].length; j++){
                System.out.print(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println(""); //print a new line
        }*/
        //practice 4
//        reverse the array

        int [] arr = {1,2,3,4,5,6,7,8,9};

        int s = 0;
        int e = arr.length-1;
        while (s <= e){
           int temp = arr[s];
           arr[s] = arr[e];
           arr[e] = temp;
           s++;
           e--;
        }
       for (int i = 0; i < arr.length; i++){
           System.out.print(arr[i] + " ");
       }
    }
}
