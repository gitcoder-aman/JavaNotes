package com.company;

import java.util.Date;

public class _53_Date_Time {
    public static void main(String[] args) {

        System.out.println("Long Datatype Capacity: "+Long.MAX_VALUE);
        System.out.println("Nos of miliSecond: "+System.currentTimeMillis());
        System.out.println("Nos of Second: "+ System.currentTimeMillis()/1000);
        System.out.println("Nos of Minutes: "+ System.currentTimeMillis()/1000/3600);
        System.out.println("Nos of days: "+ System.currentTimeMillis()/1000/3600/24);
        System.out.println("Nos of years: "+ System.currentTimeMillis()/1000/3600/24/365);

        //Deprecated all the methods.
        Date d = new Date();

        System.out.println(d);
        System.out.println(d.getDate());
        System.out.println(d.getSeconds());
        System.out.println(d.getYear());
        System.out.println(d.getMonth());
    }
}
