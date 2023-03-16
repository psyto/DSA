class Node:
    def __init__(self, value):
        self.value: int = value
        self.next: Node = None


class Stack:
    def __init__(self, value):
        newNode: Node = Node(value)
        self.top: Node = newNode
        self.height: int = 1

    def printStack(self) -> None:
        temp: Node = self.top
        while temp != None:
            print(temp.value)
            temp = temp.next

    def push(self, value) -> None:
        newNode: Node = Node(value)
        if self.height == 0:
            self.top = newNode
        else:
            newNode.next = self.top
            self.top = newNode
        self.height += 1

    def pop(self) -> Node:
        if self.height == 0:
            return None
        temp: Node = self.top
        if self.height == 1:
            self.top.next = None
        else:
            self.top = self.top.next
            temp.next = None
        self.height -= 1
        return temp


myStack = Stack(1)
myStack.push(2)
print("pop value:", myStack.pop().value)
myStack.printStack()
