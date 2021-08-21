package com.queue;

import com.linkedlist.MyLinkedList;
import com.linkedlist.Node;

/**
 * Queue Operations
 */
public class MyQueue {
    MyLinkedList linkedList;

    public MyQueue() {
        linkedList = new MyLinkedList();
    }

    public void enQueue(Integer key) {
        linkedList.appendNode(new Node(key));
    }

    public void display() {
        linkedList.displayLinkedList();
    }

    public static void main(String[] args) {
        System.out.println("Queue Operations");
        // MyQueue object created
        MyQueue queue = new MyQueue();
        System.out.println("Add node 56, 30, 70 to queue");
        queue.enQueue(56);
        queue.enQueue(30);
        queue.enQueue(70);
        System.out.println("Queue : ");
        queue.display();
    }
}
