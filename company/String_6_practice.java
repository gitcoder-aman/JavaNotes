package com.company;

import java.util.Locale;

public class String_6_practice {
    public static void main(String[] args) {
        //Problem 1
        String name = "Jack Parker";
        name = name.toLowerCase();
        System.out.println(name);

        //Problem 2
        String text = "To  My      Friend";
        text =  text.replace(" ","_");
        System.out.println(text);

        //Problem 3
        String letter = "Dear <|name|>, Thanks a lot!";
        letter =  letter.replace("<|name|>","Aman");
        System.out.println(letter);

        //Problem 4
        //find index of double and triple space in string
        String myString = "This is contains  double and triple sapces";

        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        //Problem 5
        String myLetter = "Dear Aman,\n\t This Java Course is Nice.\n Thanks";
        System.out.println(myLetter);
    }
}
