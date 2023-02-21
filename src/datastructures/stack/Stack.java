package datastructures.stack;

public class Stack {
    private Node top;
    private int height;

    private class Node {
        private int value;
        private Node next;

        private Node(int value) {
            this.value = value;
        }
    }

    public Stack(int value) {
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }

    public void printStack() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void push(int value) {
        Node newNode = new Node(value);
        if (height == 0) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        height++;
    }

    public Node pop() {
        if (height == 0) {
            return null;
        }
        Node temp = top;
        if (height == 1) {
            top = null;
        } else {
            top = top.next;
            temp.next = null;
        }
        height--;
        return temp;
    }
}
