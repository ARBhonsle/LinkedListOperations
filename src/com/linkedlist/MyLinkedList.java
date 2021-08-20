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

    public static <K> void main(String[] args) {
        //Welcome to LinkedList
        System.out.println("Linked List Implementation");
        INode<Integer> nodeOne = new Node<>(56);
        INode<Integer> nodeTwo = new Node<>(30);
        INode<Integer> nodeThree = new Node<>(70);
        nodeOne.setNext(nodeTwo);
        nodeTwo.setNext(nodeThree);
        System.out.println(nodeOne.displayKey() + nodeTwo.displayKey() + nodeThree.displayKey());
    }
}

