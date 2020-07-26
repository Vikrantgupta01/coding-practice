package com.company.bst.problems;

import java.util.*;

public class VerticalPrint {

    public static void main(String[] args) {
        Comparator<Position> integerComparator = Comparator.comparingInt(Position::getX);
        BinarySearchTree binarySearchTree = BinarySearchTree.getBinarySearchTree();
        TreeMap<Position, List<Pair>> map = new TreeMap<>(integerComparator);
        getPositionMapping(binarySearchTree.getRoot(), new Position(0, 0), map);
        Comparator<Pair> xxx = Comparator.comparingInt(Pair::getRow);
        for (Position pos : map.keySet()) {
            List<Pair> pairs = map.get(pos);
            Collections.sort(pairs, xxx);
            pairs.stream().forEach(m-> System.out.print(m.getNode().getData()+"\t"));
            System.out.println();
        }
    }

    public static void getPositionMapping(Node node, Position currtPos, TreeMap<Position, List<Pair>> map) {
        if (node != null) {
            List<Pair> list = map.getOrDefault(currtPos, new ArrayList<>());
            list.add(new Pair(currtPos.getY(), node));
            map.put(currtPos, list);
            getPositionMapping(node.getLeft(), new Position(currtPos.getX() - 1, currtPos.getY() + 1), map);
            getPositionMapping(node.getRight(), new Position(currtPos.getX() + 1, currtPos.getY() + 1), map);
        }

    }


}

class Pair {
    int row;
    Node node;

    public Pair(int row, Node node) {
        this.row = row;
        this.node = node;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }
}