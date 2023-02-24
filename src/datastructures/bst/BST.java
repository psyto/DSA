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
}
