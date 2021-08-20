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
    public void displayLinkedList(){
        if(head!=null){
            INode<K> temp=head;
            while (temp!=null){
                System.out.print(temp.getKey()+"->");
                temp=temp.getNext();
            }
            System.out.println("null");
        }
    }
    // adds node at head
    public void addNode(INode<K> myNode) {
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
        if (this.head == null) {
            this.head = myNode;
        } else {
            INode<K> tempNode = this.head;
            while(tempNode.getNext() != null){
                tempNode=tempNode.getNext();
            }
            tempNode.setNext(myNode);
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
        linkedList.appendNode(nodeOne);
        linkedList.appendNode(nodeTwo);
        linkedList.appendNode(nodeThree);
        // displays list values
        linkedList.displayLinkedList();
    }
}

