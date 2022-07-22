package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class _57_DateTimeFormatter {
    public static void main(String[] args) {

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("||dd-MM-yyyy|| -- E H:m a"); //create formatter
        String myDate = dt.format(df);
        System.out.println(myDate);
        //or
        DateTimeFormatter df1 = DateTimeFormatter.ISO_LOCAL_DATE;
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_TIME;
        String myDate1 = dt.format(df1);
        String myTime2 = dt.format(df2);

        System.out.println(myDate1);
        System.out.println(myTime2);


    }
}
