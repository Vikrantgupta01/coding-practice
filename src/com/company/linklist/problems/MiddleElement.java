package com.company.linklist.problems;

public class MiddleElement {
    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        int[] arr = {33,2,3,5,11,55,23,11,89,24,21};
        for (int i : arr) {
            linkList.addNode(new Node(i));
        }

        // first find the length
        // n/2 and delete
        Node node = linkList.getHead();
        int length = 0;
        while (node !=null){
            length++;
            node = node.nextNode;
        }
        System.out.println(length);
        System.out.println(length/2);
        int mid = length%2 ==0 ? length/2 -1 : length/2;
        Node prev = null;
        Node xyz = linkList.getHead();
        for (int i = 0; i < mid; i++) {
            prev = xyz;
            xyz = xyz.nextNode;
        }

        prev.nextNode =xyz.nextNode;

        linkList.printList();
    }
}
