package com.stack;

import com.linkedlist.INode;
import com.linkedlist.MyLinkedList;
import com.linkedlist.Node;

/**
 * Stack Operations
 */
public class MyStack {
    MyLinkedList linkedList;

    public MyStack() {
        linkedList = new MyLinkedList();
    }

    public INode<Integer> createNode(Integer key) {
        return new Node<>(key);
    }

    public void push(Integer key) {
        linkedList.addNode(createNode(key));
    }

    public void display() {
        linkedList.displayLinkedList();
    }

    public INode<Integer> peek() {
        return linkedList.head;
    }

    public void pop() {
        linkedList.pop();
    }

    public static void main(String[] args) {
        // MyStack object created
        System.out.println("Stack Operations");
        MyStack stack = new MyStack();
        // elements pushed to stack
        System.out.println("56 pushed to stack");
        stack.push(56);
        System.out.println("30 pushed to stack");
        stack.push(30);
        System.out.println("70 pushed to stack");
        stack.push(70);
        System.out.println("Stack displayed");
        stack.display();
        System.out.println("Top Node : " + stack.peek().getKey());
        System.out.println("Pop stack elements: 70, 30, 56");
        stack.pop();
        stack.display();
        stack.pop();
        stack.display();
        stack.pop();
        stack.display();
    }
}
