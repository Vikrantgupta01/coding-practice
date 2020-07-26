package com.company.leetcode.interview.array;

import java.util.*;

public class TestAnyThing {


    Map<String, String> phone = new HashMap<String, String>() {{
        put("2", "abc");
        put("3", "def");
        put("4", "ghi");
        put("5", "jkl");
        put("6", "mno");
        put("7", "pqrs");
        put("8", "tuv");
        put("9", "wxyz");
    }};

    List<String> output = new ArrayList<>();

    public void backtrack(String combination, String next_digits) {
        System.out.println(combination);
        if (next_digits.length() == 0) {
            output.add(combination);
            return;
        }
        String key = next_digits.substring(0, 1);
        String letters = phone.get(key);
        for (int i = 0; i < letters.length(); i++) {
            backtrack(combination+letters.substring(i,i+1),next_digits.substring(1));
        }

    }

    public void backtrack2(String digits) {

        Stack<String> stringList1 = new Stack<>();
        Stack<String> stringList2 = new Stack<>();
        stringList1.push("");
        for (int i = 0; i < digits.length(); i++) {
            String d = digits.substring(i,i+1);
            while (!stringList1.isEmpty()){
                String m = stringList1.pop();
                if(m.length()==i){
                    for(String s: phone.get(d).split("")){
                        stringList2.add(m+s);
                    }
                }
            }
            Stack<String> temp = stringList1;
            stringList1 = stringList2;
            stringList2 = temp;

        }

        System.out.println(stringList1);

    }

    public List<String> letterCombinations(String digits) {
        if (digits.length() != 0)
            backtrack("", digits);
        return output;
    }

    public static void main(String[] args) {
        new TestAnyThing().backtrack2("234");
        new TestAnyThing().letterCombinations("234");
    }
}
