package com.company.linklist.problems;

public class KthLastElement {

    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        int[] arr = {33,2};
        for (int i : arr) {
            linkList.addNode(new Node(i));
        }


        int k = 3;

        Node node = linkList.getHead();
        for (int i = 0; i < k; i++) {
            node = node.nextNode;
            if(node ==null ){
                throw new RuntimeException("length of of item is not enough");
            }
        }
        //now node has kth position
        Node node1 = linkList.getHead();
        while(node!=null){
            node = node.nextNode;
            node1 = node1.nextNode;
        }

        System.out.println(node1.value);
        //linkList.printList();
    }
}
