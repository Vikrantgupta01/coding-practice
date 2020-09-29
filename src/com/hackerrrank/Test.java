package com.hackerrrank;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class Test {

    public static void main(String[] args) {
        System.out.println(getDateInString(new Date(),"yyyy-MM-dd"));
    }

    public static String getDateInString(Date date, String format) {
        DateFormat dateFormat = new SimpleDateFormat(format);
        return dateFormat.format(date);
    }

}
