package com.company;

import javax.xml.crypto.Data;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class _58_Practice_AdvanceJava {
    public static void main(String[] args) {

        //PS 01

        ArrayList ar = new ArrayList();
        ar.add("Student 1");
        ar.add("Student 2");
        ar.add("Student 3");
        ar.add("Student 4");
        ar.add("Student 5");
        ar.add("Student 6");
        ar.add("Student 7");
        ar.add("Student 8");
        ar.add("Student 9");
        ar.add("Student 10");

        for (Object o : ar) {
            System.out.println(o);
        }
        //PS 02
// Duplicate value is not stored in set Data Structure
        HashSet<Integer>s = new HashSet();
        s.add(5);
        s.add(6);
        s.add(46);
        s.add(68);
        s.add(9);
        s.add(6);
        System.out.println(s);

        //PS 03
        Date d = new Date(); // show to time according 24 hours.
        System.out.println(d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());

        //PS 04
        Calendar c = Calendar.getInstance(); //use of HOUR show to time according 12 hours. use of HOUR_OF_DAY then show time according to 24 hours.
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));

        //PS 05
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("H:m:s a"); // "a" is a formatter of AM/PM
        String myDate = dt.format(df);
        System.out.println(myDate);
    }
}
