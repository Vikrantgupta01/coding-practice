package com.company.bst.problems;


public class BinarySearchTree {

    private Node root;


    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }


    public void insert(Node node) {
        Node temp = root;
        if (this.root == null) {
            root = node;
        } else {

            while(true){
                if (node.getData() < temp.getData()) {
                    if( temp.getLeft() == null ){
                        temp.setLeft(node);
                        break;
                    }else {
                        temp = temp.getLeft();
                    }
                } else {
                    if(temp.getRight()==null){
                        temp.setRight(node);
                        break;
                    }else{
                        temp = temp.getRight();
                    }
                }
            }

        }
    }

    public void inOrderTraversal(Node node){
        if(node.getLeft()!=null){
            inOrderTraversal(node.getLeft());
        }
        System.out.println(node.getData());
        if(node.getRight()!=null){
            inOrderTraversal(node.getRight());
        }
    }

    public void preOrderTraversal(Node node){
        System.out.println(node.getData());
        if(node.getLeft()!=null){
            preOrderTraversal(node.getLeft());
        }
        if(node.getRight()!=null){
            preOrderTraversal(node.getRight());
        }
    }

    public void postOrderTraversal(Node node){
        if(node.getLeft()!=null){
            postOrderTraversal(node.getLeft());
        }
        if(node.getRight()!=null){
            postOrderTraversal(node.getRight());
        }
        System.out.println(node.getData());
    }

    public  static BinarySearchTree getBinarySearchTree(){
        BinarySearchTree binarySearch = new BinarySearchTree();
        binarySearch.insert(new Node(10));
        binarySearch.insert(new Node(5));
        binarySearch.insert(new Node(1));
        binarySearch.insert(new Node(8));
        binarySearch.insert(new Node(9));
        binarySearch.insert(new Node(20));
        binarySearch.insert(new Node(15));
        binarySearch.insert(new Node(25));
        binarySearch.insert(new Node(19));
        binarySearch.insert(new Node(14));

        return binarySearch;
    }

    public static void main(String[] args) {
        BinarySearchTree binarySearch = new BinarySearchTree();
        binarySearch.insert(new Node(10));
        binarySearch.insert(new Node(5));
        binarySearch.insert(new Node(1));
        binarySearch.insert(new Node(8));
        binarySearch.insert(new Node(20));
        binarySearch.insert(new Node(15));
        binarySearch.insert(new Node(25));

        //System.out.println(binarySearch);

        //binarySearch.inOrderTraversal(binarySearch.getRoot());
        //binarySearch.preOrderTraversal(binarySearch.getRoot());
        binarySearch.postOrderTraversal(binarySearch.getRoot());
    }
}
