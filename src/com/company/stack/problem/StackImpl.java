package com.company.stack.problem;

public class StackImpl {


    private int[] arr = new int[100];
    private int lastElementIndex = -1;

    public void push(int i){
        arr[++lastElementIndex] = i;
    }

    public int peek(){
        return arr[lastElementIndex];
    }

    public int pop(){
        return arr[lastElementIndex--];
    }

    public boolean isEmpty(){
        return lastElementIndex == -1;
    }
}
