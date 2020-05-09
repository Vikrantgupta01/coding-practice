package com.company.stackqueue;

import java.util.HashMap;
import java.util.Stack;

public class ParenthesisChecker {

    public static void main(String[] args) {

        String problem = "{([])";
        Stack<Character>  first = new Stack<>();
        Stack<Character>  second = new Stack<>();
        for (char c : problem.toCharArray()) {
            first.push(c);
        }

        HashMap<Character,Character> characterCharacterHashMap = new HashMap<>();
        characterCharacterHashMap.put('{','}');
        characterCharacterHashMap.put('[',']');
        characterCharacterHashMap.put('(',')');

        while (!first.isEmpty()){
            if(second.isEmpty() || characterCharacterHashMap.get(first.peek()) != second.peek()){
                second.push(first.pop());
            }else{
                first.pop();
                second.pop();
            }
        }
        if(second.isEmpty())
            System.out.println("balanced");
        else
            System.out.println("unbalanced");

    }
}
