class Node:
    def __init__(self, value):
        self.value = value
        self.next = None


class LinkedList:
    def __init__(self, value):
        newNode = Node(value)
        self.head = newNode
        self.tail = newNode
        self.length = 1

    def printList(self):
        temp = self.head
        while (temp != None):
            print(temp.value)
            temp = temp.next

    def append(self, value):
        newNode = Node(value)
        if (self.length == 0):
            self.head = newNode
            self.tail = newNode
        else:
            self.tail.next = newNode
            self.tail = newNode
        self.length += 1

    def prepend(self, value):
        newNode = Node(value)
        if (self.length == 0):
            self.head = newNode
            self.tail = newNode
        newNode.next = self.head
        self.head = newNode
        self.length += 1

    def removeLast(self):
        if (self.length == 0):
            return None
        temp = self.head
        prev = self.head
        if (self.length == 1):
            self.head = None
            self.tail = None
        else:
            while (temp.next != None):
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
