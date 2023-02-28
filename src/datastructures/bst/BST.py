class Node:
    def __init__(self, value):
        self.value: int = value
        self.left: Node = None
        self.right: Node = None


class BST:
    def __init__(self):
        self.root: Node = None

    def insert(self, value: int) -> bool:
        newNode: Node = Node(value)
        if self.root == None:
            self.root = newNode
            return True
        temp: Node = self.root
        while True:
            if newNode.value == temp.value:
                return False
            if newNode.value < temp.value:
                if temp.left == None:
                    temp.left = newNode
                    return True
                else:
                    temp = temp.left
            if newNode.value > temp.value:
                if temp.right == None:
                    temp.right = newNode
                    return True
                else:
                    temp = temp.right

    def contains(self, value: int) -> bool:
        if self.root == None:
            return False
        temp: Node = self.root
        while temp != None:
            if value == temp.value:
                return True
            if value < temp.value:
                temp = temp.left
            elif value > temp.value:
                temp = temp.right
            else:
                return True
        return False


myBST = BST()
myBST.insert(47)
myBST.insert(21)
myBST.insert(76)
myBST.insert(18)
myBST.insert(52)
myBST.insert(82)

myBST.insert(27)

print(myBST.root.left.right.value)
print(myBST.contains(27))
print(myBST.contains(26))
