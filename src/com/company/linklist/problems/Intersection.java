package com.company.linklist.problems;

public class Intersection {
    public static void main(String[] args) {
        LinkList linkList1 = new LinkList();
        int[] arr = {33,2,3,5,11,55,23,11,89,22};
        for (int i : arr) {
            linkList1.addNode(new Node(i));
        }

        LinkList linkList2 = new LinkList();
        int[] arr2 = {1,2,3,55,23,11,89,22};
        for (int i : arr2) {
            linkList2.addNode(new Node(i));
        }

        System.out.println(linkList1.getSize());
        System.out.println(linkList2.getSize());

        int diff =  Math.abs(linkList1.getSize()-linkList2.getSize());
        System.out.println(diff);
        Node node1 = linkList1.getHead();
        Node node2 = linkList2.getHead();
        if(linkList1.getSize() > linkList2.getSize()){
            for (int i = 0; i < diff; i++) {
                node1 = node1.nextNode;
            }
        }else{
            for (int i = 0; i < diff; i++) {
                node2 = node2.nextNode;
            }
        }


        while (node1.value!=node2.value){
            node1 = node1.nextNode;
            node2 = node2.nextNode;
        }

        System.out.println(node1.value);

    }
}
