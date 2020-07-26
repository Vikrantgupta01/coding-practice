package com.company.linklist.problems;

public class ReverseLinkListKGroup {

    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i : arr) {
            linkList.addNode(new Node(i));
        }

        Node prev = null;
        Node curr = linkList.getHead();
        Node mem = curr;
        int counter = 0;
        while (curr != null) {
            Node next = curr.nextNode;
            curr.nextNode = prev;
            prev =curr;
            curr = next;
            counter++;
            if(counter%3==0){

            }
        }

        System.out.println(prev);

    }
}
