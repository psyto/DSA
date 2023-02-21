package datastructures.doublylinkedlist;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList myDLL = new DoublyLinkedList(1);
        myDLL.append(2);
        myDLL.append(3);
        myDLL.removeLast();
        myDLL.prepend(10);
        myDLL.removeFirst();
        myDLL.set(1, 20);
        myDLL.insert(1, 30);
        myDLL.printList();
        System.out.println("value of index 1: " + myDLL.get(1).value);
    }

}
