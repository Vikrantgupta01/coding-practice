package com.company.binarytree.problems;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKSortedList {

    public static void main(String[] args) {

        Comparator<ListNode> listNodeComparator = Comparator.comparingInt(ListNode::getHead);
        PriorityQueue<ListNode> listNodes = new PriorityQueue<>(listNodeComparator);
        listNodes.add(new ListNode(new int[]{1,5,9,13,17,21,25}));
        listNodes.add(new ListNode(new int[]{2,6,10,14,18,22,26}));
        listNodes.add(new ListNode(new int[]{3,7,11,15,19,23,27}));
        listNodes.add(new ListNode(new int[]{4,8,12,16,20,24,28}));

        while (!listNodes.isEmpty()){
            ListNode n = listNodes.poll();
            System.out.println(n.getTop());
            if(!n.isEmpty())
                listNodes.add(n);
        }

    }
}

class ListNode{

    private int[] arr;
    private int size;
    private int pointer =0;

    public ListNode(int[] arr) {
        this.arr = arr;
        this.size = arr.length;
    }

    public int getHead(){
        return arr[pointer];
    }
    public int getTop(){
        return arr[pointer++];
    }

    public boolean isEmpty(){
        return pointer==size;
    }
}
