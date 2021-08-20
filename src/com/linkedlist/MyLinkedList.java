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
    // adds node at head
    public void addNode(INode<K> myNode) {
        System.out.println("Adding at head of linked list: "+myNode.getKey());
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
        System.out.println("Adding at End of linked list: "+myNode.getKey());
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
        System.out.println("Insert between nodes: "+keyPrev+" and "+keyNext+" key: "+myNode.getKey());
        INode<K> node = myNode;
        if (this.head != null) {
            INode<K> temp = head, tempPrev = head;
            while (tempPrev != null) {
                if (temp.getKey() == keyPrev && tempPrev.getKey() == keyNext) {
                    node.setNext(temp.getNext());
                    temp.setNext(node);
                    break;
                }
                temp=tempPrev;
                tempPrev = tempPrev.getNext();
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
        linkedList.appendNode(nodeThree);
        // displays list values
        linkedList.displayLinkedList();
        // inserts node between key 56 and key 70
        linkedList.insertBetweenTwoKeys(56,70,nodeTwo);
        // displays final list
        linkedList.displayLinkedList();
    }
}

