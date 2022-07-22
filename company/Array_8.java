package com.company;

public class Array_8 {

    public static void main(String[] args) {
        //int [] marks = {98,45,79,99,88};
        float [] marks = {98.5f,45.5f,79.5f,99.5f,80.5f};
        String [] students = {"Harry","Rohan","Subham","Lovish"};
        System.out.println(marks.length);
        System.out.println(students.length);

        // Displaying the Array (for loop)
        for (int i = 0; i<marks.length; i++){
            System.out.println(marks[i]);
        }

        //New version of java which name is for-each loop
        System.out.println("Printing using for-each loop");
        for (float element:marks)
        {
            System.out.println(element);
        }
    }
}
