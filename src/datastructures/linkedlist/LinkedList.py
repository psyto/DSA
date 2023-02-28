class Node:
    def __init__(self, value):
        self.value: int = value
        self.next: Node = None


class LinkedList:
    def __init__(self, value):
        newNode: Node = Node(value)
        self.head: Node = newNode
        self.tail: Node = newNode
        self.length: int = 1

    def printList(self) -> None:
        temp: Node = self.head
        while temp != None:
            print(temp.value)
            temp = temp.next

    def append(self, value) -> None:
        newNode: Node = Node(value)
        if self.length == 0:
            self.head = newNode
            self.tail = newNode
        else:
            self.tail.next = newNode
            self.tail = newNode
        self.length += 1

    def prepend(self, value) -> None:
        newNode: Node = Node(value)
        if self.length == 0:
            self.head = newNode
            self.tail = newNode
        newNode.next = self.head
        self.head = newNode
        self.length += 1

    def removeLast(self) -> Node:
        if self.length == 0:
            return None
        temp: Node = self.head
        prev: Node = self.head
        if self.length == 1:
            self.head = None
            self.tail = None
        else:
            while temp.next != None:
                prev = temp
                temp = temp.next
            self.tail = prev
            self.tail.next = None
        self.length -= 1
        return temp


myLinkedList = LinkedList(1)
myLinkedList.append(2)
myLinkedList.removeLast()
myLinkedList.prepend(10)
myLinkedList.printList()
