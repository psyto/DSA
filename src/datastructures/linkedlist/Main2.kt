package datastructures.linkedlist

object Main2 {
    @JvmStatic
    fun main(args: Array<String>) {
        val myLinkedList = LinkedList2(1)
        myLinkedList.append(2)
        myLinkedList.append(3)
        myLinkedList.removeLast()
        myLinkedList.prepend(4)
        myLinkedList.removeFirst()
        myLinkedList[0] = 4
        myLinkedList.insert(1, 5)
        myLinkedList.remove(1)
        myLinkedList.reverse()
        myLinkedList.getHead()
        myLinkedList.getTail()
        myLinkedList.getLength()
        println("\nLinked List:")
        myLinkedList.printList()
        println("value of index 1: " + myLinkedList[1]?.value)
    }
}