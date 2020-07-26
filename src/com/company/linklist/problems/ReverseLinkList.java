package com.company.linklist.problems;

import java.util.HashMap;
import java.util.Map;

public class ReverseLinkList {
    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        int[] arr = {33,2,3,5,11,55,23,11,89,24,21,34,56};
        for (int i : arr) {
            linkList.addNode(new Node(i));
        }


        Node prev = null;
        Node curr = linkList.getHead();
        Node next = null;
        while (curr != null){
            next = curr.nextNode;
            curr.nextNode = prev;
            prev = curr;
            curr = next;
        }
        linkList.setHead(prev);
        linkList.printList();
        int i = 2147483647;

        Map<Integer,Integer>   integerIntegerMap = new HashMap<>();
        integerIntegerMap.getOrDefault(1,0);
    }
}
