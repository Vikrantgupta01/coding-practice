package com.company.intuit;

import java.util.Stack;

public class BP {


    public static void main(String[] args) {
        System.out.println(minimumSwaps("(()))("));
    }
    public static int minimumSwaps(String brackets) {
        // Write your code here

        char opening = '(';
        char closing = ')';
        int countO = 0;
        int countC = 0;
        Stack<Character> stack = new Stack<>();
        char[] arr = brackets.toCharArray();
        for(int i =0; i < arr.length ; i++){
            if(arr[i] == opening || arr[i] == closing){
                if(arr[i] == opening){
                    countO++;
                    stack.push(arr[i]);
                }else{
                    countC++;
                    if(stack.peek()==opening){
                        stack.pop();
                    }
                    stack.push(arr[i]);
                }
            }
        }

        if(countC!=countO){
            return -1;
        }else{
            return stack.size()/2;
        }


    }
}
