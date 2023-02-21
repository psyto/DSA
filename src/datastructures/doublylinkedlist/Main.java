package datastructures.doublylinkedlist;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList myDLL = new DoublyLinkedList(1);
        myDLL.append(2);
        myDLL.append(3);
        myDLL.removeLast();
        myDLL.prepend(10);
        myDLL.removeFirst();
        myDLL.printList();
    }

}
