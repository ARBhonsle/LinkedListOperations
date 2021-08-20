package com.linkedlist;

/**
 * Linked List concepts implementation
 *
 * @param <K>
 */
public class MyLinkedList<K> {
    // head and tail of linked list set
    public INode<K> head;

    // constructor defined
    public MyLinkedList() {
        this.head = null;
    }
    // display linked list
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
    // add node to head
    public void addNode(INode<K> myNode) {
        if (this.head == null) {
            this.head = myNode;
        } else {
            INode<K> tempNode = this.head;
            this.head = myNode;
            this.head.setNext(tempNode);
        }
    }

    // add node to end of list
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

