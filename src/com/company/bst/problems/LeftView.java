package com.company.bst.problems;

import java.util.Stack;

public class LeftView {

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = BinarySearchTree.getBinarySearchTree();

        Stack<Node> global = new Stack<>();
        Stack<Node> local = new Stack<>();
        global.push(binarySearchTree.getRoot());

        while (!global.isEmpty()){
            boolean isFirstElement = true;
            while (!global.isEmpty()){
                Node node = global.pop();
                if(isFirstElement){
                    System.out.print(node.getData()+"   ");
                    isFirstElement = false;
                }
                if(node.getRight()!=null){
                    local.push(node.getRight());
                }
                if(node.getLeft()!=null){
                    local.push(node.getLeft());
                }

            }

            while (!local.isEmpty()){
                global.push(local.pop());
            }



        }

    }
}
