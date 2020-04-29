package com.company.stack.problem;

import java.util.Stack;

public class SortStackByAnotherStack {

    public static void main(String[] args) {

        StackImpl  stack = new StackImpl();
        stack.push(32);
        stack.push(1);
        stack.push(19);
        stack.push(31);
        stack.push(90);
        stack.push(98);
        stack.push(12);


        StackImpl tempStack = new StackImpl();

        int temp;
        while (!stack.isEmpty()){
            temp = stack.pop();
            if(!tempStack.isEmpty()){
                if(tempStack.peek() < temp){
                    tempStack.push(temp);
                }else {
                    stack.push(tempStack.pop());
                    stack.push(temp);
                }
            }else {
                tempStack.push(temp);
            }
        }

        while (!tempStack.isEmpty()){
            System.out.println(tempStack.pop());
        }
    }
}
