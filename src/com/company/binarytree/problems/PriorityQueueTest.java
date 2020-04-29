package com.company.binarytree.problems;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueTest {

    public static void main(String[] args) {
        Comparator<Emp> empComparator = ( Emp e1 ,Emp e2 ) -> e2.salary - e1.salary;
        PriorityQueue<Emp> maxHeap = new PriorityQueue<>(empComparator);
        maxHeap.add(new Emp("viks",200));
        maxHeap.add(new Emp("rt",300));
        maxHeap.add(new Emp("aadu",400));
        System.out.println(maxHeap.poll().name);

        PriorityQueue<Integer> maxHeap1 = new PriorityQueue<>();
        maxHeap1.add(1);
        maxHeap1.add(2);
        maxHeap1.add(3);
        System.out.println(maxHeap1.poll());
    }
}
