package com.company.linklist.problems;

public class LinkList {

    private  Node head;

    private int size;

    public int getSize() {
        return size;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void addNode(Node node){
        size++;
        if(head==null){
            setHead(node);
            return;
        }
        Node node1 = head;
        while (node1.nextNode !=null){
            node1 = node1.nextNode;
        }
        node1.nextNode = node;

    }

    public void deleteNode(Node node){
        if(head.value==node.value){
            head = null;
            return;
        }
        Node node1 = head.nextNode;
        Node prev = head;
        while (true){
            if(node1.value !=node.value){
                prev = node1;
                node1 = node1.nextNode;

            }else {
                prev.nextNode = node1.nextNode;
                break;
            }
        }
    }

    public void printList(){
        Node node = head;
        while (node !=null){
            System.out.print(node.value+ " > ");
            node = node.nextNode;
        }
    }
}
