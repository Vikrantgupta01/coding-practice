package com.company.bst.problems;

import java.util.ArrayList;
import java.util.List;

public class PrintAllPath {

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = BinarySearchTree.getBinarySearchTree();
        Node node = binarySearchTree.getRoot();
        List<Node>  nodes = new ArrayList<>();
        inOrderTraversal(node, nodes );
    }

    public static void inOrderTraversal(Node node, List<Node> list) {
        if (node == null) {
            return;
        }
        list.add(node);
        inOrderTraversal(node.getLeft(),list);
        if (node.getLeft() == null && node.getRight() == null) {
            list.stream().forEach(m -> System.out.print("->" + m.getData()));
            System.out.println("");
        }

        inOrderTraversal(node.getRight(),list);
        list.remove(node);
    }
}
