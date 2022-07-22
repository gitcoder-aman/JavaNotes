package com.company;

import java.util.Calendar;
import java.util.TimeZone;

public class _54_Calender { // this is abstract class
    public static void main(String[] args) {
/*
        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType()); // Calender type daily wases use this calender
        System.out.println(c.getTimeZone());
        System.out.println(c.getTimeZone().getID());*/

        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());
        System.out.println(c.getTimeZone().getID());
    }
}
