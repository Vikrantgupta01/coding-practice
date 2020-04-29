package com.company.binarytree.problems;

public class HeapSort {

    public static void main(String[] args) {
        int[] arr = {12,32,11,2,6,98,100,33,45,88};
        MaxHeapImp maxHeapImp = new MaxHeapImp();
        for (int i = 0; i < arr.length; i++) {
            maxHeapImp.insert(arr[i]);
        }



        System.out.println(maxHeapImp.sort());

    }
}
