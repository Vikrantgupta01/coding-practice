package com.company.binarytree.problems;

public class MinHeapImp {

    private int[] arr = new int[100];
    private int pointer = -1;

    public int getSize(){
        return pointer+1;
    }
    public void insert(int i ){
       arr[++pointer] = i;
       int tempPointer = pointer;
       int parentPos = getParentPos(tempPointer);
       while( arr[parentPos] > arr[tempPointer] ){
           swapPosition(parentPos,tempPointer);
           tempPointer = parentPos;
           parentPos = getParentPos(tempPointer);
       }
    }

    private boolean isLeaf(int pos)
    {
        if (pos >= (pointer / 2) && pos <= pointer) {
            return true;
        }
        return false;
    }

    public int top(){
        return arr[0];
    }

    public int pop(){
        int top = arr[0];
        arr[0] = arr[pointer--];
        int tempPointer = 0;
        while (arr[tempPointer] > arr[getLeftPos(tempPointer)]
                || arr[tempPointer] > arr[getRightPos(tempPointer)]){

            if(arr[getLeftPos(tempPointer) ] < arr[getRightPos(tempPointer)] ){
                swapPosition(tempPointer,getLeftPos(tempPointer));
                tempPointer = getLeftPos(tempPointer);
            }else{
                swapPosition(tempPointer,getRightPos(tempPointer));
                tempPointer = getRightPos(tempPointer);
            }
            if(isLeaf(tempPointer))
                break;

        }
        return top;
    }


    private void swapPosition(int pos1, int pos2){
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }

    private int getLeftPos(int pos){
        return 2*pos + 1;
    }

    private int getRightPos(int pos){
        return 2*pos + 2;
    }

    private int getParentPos(int pos){
        return (pos - 1)/2;
    }

    public void print(){

        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i] + "   ");
        }
    }

    public boolean isEmpty(){
        return pointer==0;
    }
    public static void main(String[] args) {
        MinHeapImp maxHeap = new MinHeapImp();
        maxHeap.insert(5);
        maxHeap.insert(3);
        maxHeap.insert(17);
        maxHeap.insert(10);
        maxHeap.insert(84);
        maxHeap.insert(19);
        maxHeap.insert(6);
        maxHeap.insert(22);
        maxHeap.insert(9);

        while(!maxHeap.isEmpty()){
            System.out.println(maxHeap.pop());
        }
    }


}
