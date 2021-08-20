package com.linkedlist;

/**
 * Interface with methods for performing Linked List operations
 * @param <K>
 */
public interface INode<K> {
    K getKey();

    void setKey(K key);

    INode<K> getNext();

    void setNext(INode<K> next);
}
