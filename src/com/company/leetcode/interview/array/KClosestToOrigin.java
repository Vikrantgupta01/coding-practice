package com.company.leetcode.interview.array;

import java.util.PriorityQueue;

public class KClosestToOrigin {

    public static void main(String[] args) {
        int[][] arr = new int[][]{{3, 3}, {5, -1}, {-2, 4}};

        PriorityQueue<Node> nodes = new PriorityQueue<>((n1, n2) -> {
            return n2.dist - n1.dist;
        });
        for (int[] it : arr) {
            int dist = it[0] * it[0] + it[1] * it[1];

            nodes.add(new Node(it, dist));
        }

        while (!nodes.isEmpty()) {
            Node n = nodes.poll();
            System.out.println("{" + n.cordinates[0] + "," + n.cordinates[1] + "}" + n.dist);
        }

    }

}

