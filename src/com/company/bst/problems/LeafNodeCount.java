package com.company.bst.problems;

public class LeafNodeCount {

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = BinarySearchTree.getBinarySearchTree();
        System.out.println(getLeafNode(binarySearchTree.getRoot()));

    }

    public static int getLeafNode(Node node){
        if(node==null){
            return 0;
        }
        if(node.getRight() ==null && node.getLeft() == null){
            return 1;
        }else {
            return getLeafNode(node.getLeft()) + getLeafNode(node.getRight());
        }

    }
}
