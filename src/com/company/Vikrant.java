package com.company;

import java.util.Calendar;
import java.util.PriorityQueue;

public class Vikrant {

    public static void main(String[] args) {

        System.out.println(System.currentTimeMillis()/1000);
        long i = System.currentTimeMillis()/1000;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(i);
        System.out.println(calendar);
        int mYear = calendar.get(Calendar.YEAR);
        int mMonth = calendar.get(Calendar.MONTH);
        int mDay = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(mDay +" of " +mMonth+ " of "+mYear);
        try {
            System.out.println(doStuff(args));
        }catch (Exception e){
            System.out.println("exec");
        }
        doStuff(args);

    }
    static int doStuff(String[] args){
        return Integer.parseInt(args[0]);
    }
}
