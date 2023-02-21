package datastructures.linkedlist2;

public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(100);
        myLinkedList.prepend(3);
        myLinkedList.removeLast();
        myLinkedList.removeFirst();
        myLinkedList.set(0, 10);
        myLinkedList.insert(1, 20);
        myLinkedList.remove(1);
        myLinkedList.reverse();
        myLinkedList.printList();
        // System.out.println(myLinkedList.get(0).value);
    }
}