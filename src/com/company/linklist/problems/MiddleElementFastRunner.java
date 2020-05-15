package com.company.linklist.problems;

public class MiddleElementFastRunner {
    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        int[] arr = {33,2,3,5,11,55,23,11,89,24,21,34,56};
        for (int i : arr) {
            linkList.addNode(new Node(i));
        }

        // first find the length
        // n/2 and delete
        Node node = linkList.getHead();
        Node fast = node;
        Node slow = node;
        while (fast != null){
            fast = fast.nextNode ;
            if( fast != null ){
                fast = fast.nextNode ;
                slow = slow.nextNode;
            }
        }
        System.out.println(slow.value);
    }
}
