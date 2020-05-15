package com.company.array.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SOrtByFrequency {

    public static void main(String[] args) {
        int[] arr = {5, 5, 4, 6, 4};

        Arrays.sort(arr);
        int prev = -1;
        ArrayList<Node> nodes = new ArrayList<>();
        Node node = null;
        for (int i : arr) {
            if (i != prev) {
                node = new Node(i, 1);
                nodes.add(node);
                prev = i;
            } else {
                node.incFreq();
            }
        }
        Comparator<Node>  nodeComparator = (n1,n2)-> {
            if(n1.frequency < n2.frequency)
                return 1;
            else if(n1.frequency > n2.frequency)
                return -1;
             else{
                if(n1.value > n2.value)
                    return 1;
                else
                    return -1;

            }

        };
        Collections.sort(nodes, nodeComparator);
        for (Node node1: nodes) {
            for (int i = 0; i < node1.frequency; i++) {
                System.out.print(node1.value+ " ");
            }
        }
    }


}

class Node {
    int value;
    int frequency;

    public Node(int value, int frequency) {
        this.value = value;
        this.frequency = frequency;
    }

    public void incFreq() {
        frequency++;
    }
}