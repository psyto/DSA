package datastructures.linkedlist2;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    // Node is an inner class to be used in LinkedList
    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    // Constructor
    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    // append
    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    // prepend
    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    // removeLast
    public Node removeLast() {
        if (length == 0) {
            return null;
        }
        Node temp = head;
        Node prev = head;
        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        tail = prev;
        tail.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }

    // removeFirst
    public Node removeFirst() {
        if (length == 0) {
            return null;
        }
        Node temp = head;
        head = temp.next;
        temp.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }

    // get
    public Node get(int index) {
        if (index < 0 || index >= length) {
            return null;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    // set
    public boolean set(int index, int value) {
        if (length == 0) {
            return false;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        temp.value = value;
        return true;
    }

    // insert
    public boolean insert(int index, int value) {
        if (index == 0) {
            prepend(value);
            return true;
        }
        if (index == length - 1) {
            append(value);
            return true;
        }
        Node prev = get(index - 1);
        Node temp = prev.next;
        Node newNode = new Node(value);
        prev.next = newNode;
        newNode.next = temp;
        length++;
        return false;
    }

    // remove
    public Node remove(int index) {
        if (index < 0 || index >= length) {
            return null;
        }
        if (index == 0) {
            return removeFirst();
        }
        if (index == length - 1) {
            return removeLast();
        }
        Node prev = get(index - 1);
        Node temp = prev.next;
        prev.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }

    // reverse
    public void reverse() {
        Node temp = head;
        head = tail;
        tail = temp;
        Node before = null;
        Node after = temp.next;
        for (int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }

    // printList is a helper method to print out the list items
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

}
