package com.company.leetcode.interview.array;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    DNode first = new DNode();
    DNode last = new DNode();
    int size = 0;
    int capacity = 0;
    Map<Integer, DNode> nodeMap = new HashMap<>();

    {
        first.next = last;
        last.prev = first;
    }

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        DNode dNode = nodeMap.get(key);
        int value = -6;
        if (dNode == null) {
            value = -1;
        } else {
            value = dNode.val;
            remove(dNode);
            insertFirst(dNode);
        }
        System.out.println("Return "+value);
        return value;
    }

    public void put(int key, int value) {

        DNode dNode = nodeMap.get(key);
        if (dNode == null) {
            dNode = new DNode();
            dNode.key = key;
        }else{
            remove(dNode);
        }
        dNode.val = value;
        nodeMap.put(key, dNode);
        if (this.capacity < size) {
            removeLast();
        }
        System.out.println("Insert "+key);
        insertFirst(dNode);
    }

    private void removeLast() {
        System.out.println("Evict "+last.prev.key);
        nodeMap.remove(last.prev.key);
        remove(last.prev);
    }

    private void remove(DNode dNode) {
        size--;
        DNode prev = dNode.prev;
        DNode next = dNode.next;
        prev.next = next;
        next.prev = prev;
    }

    private void insertFirst(DNode dNode) {
        size++;
        DNode next = first.next;
        dNode.next = next;
        next.prev = dNode;
        first.next = dNode;
        dNode.prev = first;

    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2 /* capacity */);

        cache.put(1, 1);
        cache.put(2, 2);
        cache.get(1);       // returns 1
        cache.put(3, 3);    // evicts key 2
        cache.get(2);       // returns -1 (not found)
        cache.put(4, 4);    // evicts key 1
        cache.get(1);       // returns -1 (not found)
        cache.get(3);       // returns 3
        cache.get(4);       // returns 4
    }


}
