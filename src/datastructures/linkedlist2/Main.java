package datastructures.linkedlist2;

public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.removeLast();
        myLinkedList.printList();
    }
}
