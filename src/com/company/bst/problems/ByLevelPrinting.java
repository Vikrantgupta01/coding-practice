package com.company.bst.problems;

import java.util.Stack;

public class ByLevelPrinting {

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = BinarySearchTree.getBinarySearchTree();


        Stack<Node> global = new Stack<>();
        Stack<Node> local = new Stack<>();
        local.push(binarySearchTree.getRoot());

        Node node;
        while (!local.isEmpty()){
            while (!local.isEmpty()){
                global.push(local.pop());
            }
            while (!global.isEmpty()){
                node = global.pop();
                System.out.print(node.getData()+" ");
                if(node.getLeft() != null){
                    local.push(node.getLeft());
                }
                if(node.getRight() != null){
                    local.push(node.getRight());
                }
            }
        }

    }
}
