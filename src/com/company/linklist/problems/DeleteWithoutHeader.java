package com.company.linklist.problems;

public class DeleteWithoutHeader {

    public static void main(String[] args) {
        LinkList linkList1 = new LinkList();
        int[] arr = {33,2,3,5,11,55,23,11,89,22};
        for (int i : arr) {
            linkList1.addNode(new Node(i));
        }

        Node node = linkList1.findNode(55);
        System.out.println(node.value);

        Node prev = null;
        while (node.nextNode!=null){
            node.value = node.nextNode.value;
            prev = node;
            node = node.nextNode;
        }
        prev.nextNode=null;

        linkList1.printList();
    }
}
