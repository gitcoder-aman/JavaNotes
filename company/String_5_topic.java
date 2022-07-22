package com.company;

import java.util.Locale;

public class String_5_topic {
    public static void main(String[] args) {

        String name = "AmAn KumAr"; // immutable

        //Length of String
        int value = name.length();
        System.out.println(value);

        //String Upper and Lower Case
        String lstring = name.toLowerCase();
        System.out.println(lstring);
        String Ustring = name.toUpperCase();
        System.out.println(Ustring);

        //String Trim
        String nonTrimmedString = "       Aman      ";
        System.out.println(nonTrimmedString);
        System.out.println(nonTrimmedString.trim());

        //String SubString
        System.out.println(name.substring(1));

        //String SubString with position
        System.out.println(name.substring(1,3));

        //String replace method
        //only take character for replace
        System.out.println(name.replace('A','k'));

        //take string for replace
        System.out.println(name.replace("Am","da"));

        //Return boolean type
        System.out.println(name.startsWith("Am"));
        System.out.println(name.endsWith("pod"));

        //What character of given position
        System.out.println(name.charAt(1));

        //Return index of string
        System.out.println(name.indexOf("An"));

        String modifiedName = "Harryrryrry";
        System.out.println(modifiedName.indexOf("rry",4));

        //Last index of string found
        System.out.println(modifiedName.lastIndexOf("rry"));
        System.out.println(modifiedName.lastIndexOf("rry",7));

        //String Equals
        System.out.println(name.equals("AmAn KumAr"));

        //upper and lower case ignore
        System.out.println(name.equalsIgnoreCase("aman kumar"));

        //Escape sequence character
        System.out.println("I am escape sequence \" double quote");

    }
}
