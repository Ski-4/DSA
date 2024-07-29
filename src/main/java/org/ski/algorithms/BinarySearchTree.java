package org.ski.algorithms;

public class BinarySearchTree {


    Node root;

    public BinarySearchTree() {
        root = new Node();
    }

    public BinarySearchTree(Integer value) {
        root = new Node(value);
    }

    public Node insert(Integer value) {
        if(root.value == null) {
            return root = new Node(value);
        }
        return insertUtil(root,value);
    }

    private Node insertUtil(Node curr, Integer nodeValue) {
        if(curr == null) {
            return new Node(nodeValue);
        }

        if(curr.value<nodeValue) {
            curr.right = insertUtil(curr.right, nodeValue);
        }else if(curr.value>nodeValue) {
            curr.left = insertUtil(curr.left,nodeValue);
        }

        return curr;
    }

    public void inorder() {
        inorderUtil(root);
    }

    private void inorderUtil(Node node) {
        if(node == null) return;

        inorderUtil(node.left);
        System.out.println(node.value);
        inorderUtil(node.right);
    }

    public void preorder() {
        preorderUtil(root);
    }

    private void preorderUtil(Node node) {
        if(node == null) return;

        System.out.println(node.value);
        preorderUtil(node.left);
        preorderUtil(node.right);
    }

    public void postorder() {
        postorderUtil(root);
    }

    private void postorderUtil(Node node) {
        if(node == null) return;

        postorderUtil(node.left);
        postorderUtil(node.right);
        System.out.println(node.value);
    }
}
