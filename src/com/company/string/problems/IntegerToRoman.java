package com.company.string.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

public class IntegerToRoman {
    static Map<Integer, Character> integerMap = new TreeMap<>();

    static {
        integerMap.put(1, 'I');
        integerMap.put(5, 'V');
        integerMap.put(10, 'X');
        integerMap.put(50, 'L');
        integerMap.put(100, 'C');
        integerMap.put(500, 'D');
        integerMap.put(1000, 'M');
    }

    static int getSome(int counter){
        int i = 1;
        while (counter-->0){
            i = i*10;
        }
        return i;
    }
    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer();

        int i = 367;
        Stack<Integer> list = new Stack<>();
        int counter = 0 ;
        while (i>0){
            list.push(i%10 * getSome(counter++));
            i = i/10;
        }
        while (!list.isEmpty()) {
            i =  list.pop();
            while (i>0){
                if(integerMap.get(i)==null){
                    int lowerKey = getLowerKey(i);
                    int lowerAdjKey = getLowerAdjKey(i);
                    int upperKey = getUpperKey(i);
                    if ((upperKey - lowerKey) == i) {
                        stringBuffer.append(integerMap.get(lowerKey));
                        stringBuffer.append(integerMap.get(upperKey));
                        i = i - i;
                    } else {
                        stringBuffer.append(integerMap.get(lowerAdjKey));
                        i = i - lowerAdjKey;
                    }
                }else{
                    stringBuffer.append(integerMap.get(i));
                    i = i - i;
                }

            }
        }
        System.out.println(stringBuffer.toString());
    }

    static int getLowerKey(int i) {
        if(i >0 && i <=10)
            return 1;
        if(i >10 && i <=100)
            return 10;
         return 100;
    }

    static int getLowerAdjKey(int i) {
        int prev = Integer.MIN_VALUE;
        for (Integer integer : integerMap.keySet()) {
            if (integer <= i && integer > prev) {
                prev = integer;
            }
        }
        return prev;
    }

    static int getUpperKey(int i) {
        int prev = Integer.MAX_VALUE;
        for (Integer integer : integerMap.keySet()) {
            if (integer >= i && integer < prev) {
                prev = integer;
            }
        }
        return prev;
    }
}
