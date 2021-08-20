package com.linkedlist;

/**
 * Linked List concepts implementation
 *
 * @param <K>
 */
public class MyLinkedList<K> {
    // head of linked list
    public INode<K> head;

    // constructor
    public MyLinkedList() {
        this.head = null;
    }

    // displays linked list
    public void displayLinkedList() {
        System.out.print("Display linked list: ");
        if (head != null) {
            INode<K> temp = head;
            while (temp != null) {
                System.out.print(temp.getKey() + "->");
                temp = temp.getNext();
            }
            System.out.println("null");
        }
    }

    // adds node at head of linked list
    public void addNode(INode<K> myNode) {
        System.out.println("Adding at head of linked list: " + myNode.getKey());
        if (this.head == null) {
            this.head = myNode;
        } else {
            INode<K> tempNode = this.head;
            this.head = myNode;
            this.head.setNext(tempNode);
        }
    }

    // adds node at end of list
    public void appendNode(INode<K> myNode) {
        System.out.println("Adding at End of linked list: " + myNode.getKey());
        if (this.head == null) {
            this.head = myNode;
        } else {
            INode<K> tempNode = this.head;
            while (tempNode.getNext() != null) {
                tempNode = tempNode.getNext();
            }
            tempNode.setNext(myNode);
        }
    }

    // inserts node between two keys
    public void insertBetweenTwoKeys(K keyPrev, K keyNext, INode<K> myNode) {
        System.out.println("Insert between nodes: " + keyPrev + " and " + keyNext + " key: " + myNode.getKey());
        INode<K> node = myNode;
        if (this.head != null) {
            INode<K> temp = head, tempPrev = head;
            while (tempPrev != null) {
                if (temp.getKey() == keyPrev && tempPrev.getKey() == keyNext) {
                    node.setNext(temp.getNext());
                    temp.setNext(node);
                    break;
                }
                temp = tempPrev;
                tempPrev = tempPrev.getNext();
            }
        } else {
            System.out.println("List is empty");
        }
    }

    // deletes node at head of list
    public void pop() {
        System.out.println("Delete node at head of linked list: ");
        if (this.head != null) {
            head = head.getNext();
        } else {
            System.out.println("List is empty");
        }
    }

    // deletes node at end of linked list
    public void popLast() {
        System.out.println("Delete node at end of linked list: ");
        if (this.head != null) {
            INode<K> tempNode = head, temp = head;
            while (tempNode.getNext() != null) {
                temp = tempNode;
                tempNode = tempNode.getNext();
            }
            temp.setNext(null);
        } else {
            System.out.println("List is empty");
        }
    }

    // searches node with given key parameter
    public void searchNode(K key) {
        if (this.head != null) {
            INode<K> temp = head;
            boolean keyFound = false;
            while (temp.getNext() != null) {
                if (temp.getKey() == key) {
                    System.out.println("Key " + key + " is found");
                    keyFound = true;
                    break;
                }
                temp = temp.getNext();
            }
            if (!keyFound) {
                System.out.println("Key " + key + " not found in linked list");
            }
        } else {
            System.out.println("List is empty");
        }
    }

    public static <K> void main(String[] args) {
        //Welcome to LinkedList
        System.out.println("Linked List Implementation");
        // INode interface reference to object of Node class
        INode<Integer> nodeOne = new Node<>(56);
        INode<Integer> nodeTwo = new Node<>(30);
        INode<Integer> nodeThree = new Node<>(70);
        // MyLinkedList object created
        MyLinkedList linkedList = new MyLinkedList();
        // addNode adds nodes to end of linked list
        linkedList.addNode(nodeOne);
        linkedList.appendNode(nodeTwo);
        linkedList.appendNode(nodeThree);
        // displays list values
        linkedList.displayLinkedList();
        // searches node in linked list
        linkedList.searchNode(30);
        // display final list
        linkedList.displayLinkedList();
    }
}

