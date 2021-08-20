package com.linkedlist;

/**
 * Linked List concepts implementation
 * @param <K>
 */
public class MyLinkedList<K> {
    // head and tail of linked list set
    public INode<K> head, tail;

    // constructor defined
    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }
    public void addNode(INode<K> myNode){
        if(this.tail==null){
            this.tail=myNode;
        }
        if(this.head==null){
            this.head=myNode;
        }else{
            INode<K> tempNode=this.head;
            this.head=myNode;
            this.head.setNext(tempNode);
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
        MyLinkedList linkedList=new MyLinkedList();
        // addNode adds nodes to linked list
        linkedList.addNode(nodeThree);
        linkedList.addNode(nodeTwo);
        linkedList.addNode(nodeOne);
        // displays list values
        System.out.println(nodeOne.displayKey() + nodeTwo.displayKey() + nodeThree.displayKey());
    }
}

