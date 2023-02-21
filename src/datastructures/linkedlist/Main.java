package datastructures.linkedlist;

public class Main {

    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.removeLast();
        myLinkedList.prepend(4);
        myLinkedList.removeFirst();
        myLinkedList.set(0, 4);
        myLinkedList.insert(1, 5);

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        System.out.println("\nLinked List:");
        myLinkedList.printList();
        System.out.println("value of index 1: " + myLinkedList.get(1).value);

    }

}