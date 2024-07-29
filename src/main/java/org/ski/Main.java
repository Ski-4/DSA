package org.ski;

import org.ski.algorithms.BinarySearchTree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();

        binarySearchTree.insert(5);
        binarySearchTree.insert(8);
        binarySearchTree.insert(6);
        binarySearchTree.insert(4);
        binarySearchTree.insert(9);

        binarySearchTree.inorder();
    }
}