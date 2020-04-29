package com.company.stack.problem;

public class StackImplClient {

    public static void main(String[] args) {
        StackImpl stack = new StackImpl();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);

        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
    }
}
