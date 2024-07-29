package org.ski.algorithms;

public class Node {
    Node left;
    Node right;
    Integer value;

    public Node() {
        left = null;
        right = null;
        value = null;
    }

    public Node(Integer value) {
        this.value = value;
    }
}
