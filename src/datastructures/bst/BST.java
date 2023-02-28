package datastructures.bst;

public class BST {
    Node root;

    class Node {
        int value;
        Node right;
        Node left;

        private Node(int value) {
            this.value = value;
        }
    }

    public boolean insert(int value) {
        // create newNode
        Node newNode = new Node(value);
        // if root == null then root = newNode
        if (root == null) {
            root = newNode;
            return true;
        }
        // temp = root
        Node temp = root;
        // while loop
        while (true) {
            // if newNode == temp return false
            if (newNode.value == temp.value) {
                return false;
            }
            // if < left else > right
            if (newNode.value < temp.value) {
                // if null insert newNode else move to next
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                } else {
                    temp = temp.left;
                }
            } else if (newNode.value > temp.value) {
                // if null insert newNode else move to next
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                } else {
                    temp = temp.right;
                }
            }
        }
    }

    public boolean contains(int value) {
        Node temp = root;
        while (temp != null) {
            if (value == temp.value) {
                return true;
            }
            if (value < temp.value) {
                temp = temp.left;
            } else if (value > temp.value) {
                temp = temp.right;
            } else {
                return true;
            }
        }
        return false;
    }
}
