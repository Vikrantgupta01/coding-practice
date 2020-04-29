package com.company.binarytree.problems;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthLargestElement {
    public static void main(String[] args) {
        method1();
        method2();
    }
    public static void method2(){
        MaxHeapImp maxHeapImp = new MaxHeapImp();
        int[] arr = new int[]{1,5,9,13,17,21,25};

        for (int i = 0; i < 2; i++) {
            maxHeapImp.insert(arr[i]);
        }

        for (int i = 2; i < arr.length; i++) {
            maxHeapImp.insert(arr[i]);
            System.out.println(maxHeapImp.top());
        }
    }
    public static void method1(){
        Comparator<Integer> integerComparator = (Integer i1, Integer i2) -> i2-i1;
        PriorityQueue<Integer> integerPriorityQueue = new PriorityQueue<>(integerComparator);
        int[] arr = new int[]{1,5,9,13,17,21,25};

        for (int i = 0; i < 2; i++) {
            integerPriorityQueue.add(arr[i]);
        }

        for (int i = 2; i < arr.length; i++) {
            integerPriorityQueue.add(arr[i]);
            System.out.println(integerPriorityQueue.poll());
        }
    }
}
