package com.linkedlist;

/**
 * Node of Linked List with implementation of interface methods
 * @param <K>
 */
public class Node<K> implements INode<K> {
    private K key;
    private INode<K> next;

    public Node(K key) {
        this.key = key;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public void setKey(K key) {
        this.key = key;
    }

    public INode<K> getNext() {
        return next;
    }

    public void setNext(INode<K> next) {
        this.next = next;
    }

    public String printString() {
        StringBuilder myNodeString = new StringBuilder();
        myNodeString.append("MyNode{" + "key=").append(key).append("}");
        if (next != null)
            myNodeString.append("->").append(next);
        return myNodeString.toString();
    }
}
