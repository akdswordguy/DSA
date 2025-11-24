class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
''' Created nodes here'''    
node1 = Node(10)
node2 = Node(20)
node3 = Node(30)

''' Linked the nodes here'''
node1.next = node2
node2.next = node3

head = node1

current = head
''' traversal begins here'''

while current:
    print(current.data,end=" -> ")
    current = current.next
print("None")

''' Insertion at begining'''

newNode = Node(1000)
newNode.next = head
head = newNode
print("After Insertion at begining:")
current = head
while current:
    print(current.data,end=" -> ")
    current = current.next
print("None")


''' Insertion at end'''
endNode = Node(9999)
current = head
while current:
    if current.next == None:
        current.next = endNode
        break
    current = current.next
print("After Insertion at end:")
current = head
while current:
    print(current.data,end=" -> ")
    current = current.next  
print("None")

''' Insertion at specific position'''

def insertAtPosition(head, data, position):
    newNodePos = Node (data)
    if position == 0:
        newNodePos.next = head
        return newNodePos
    current = head
    count = 0
    while current:
        if count == position - 1:
            newNodePos.next = current.next
            current.next = newNodePos
            return head
        current = current.next
        count += 1

head = insertAtPosition(head, 5555, 3)
print("After Insertion at specific position:")
current = head
while current:  
    print(current.data,end=" -> ")
    current = current.next
print("None")


