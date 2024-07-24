package com.maxwell.internship;

class Node<E> {
    //fields of node class
    private E data;
    private Node<E> next;

    public Node(E data, Node<E> next) {
        this.data = data;
        this.next = next;
    }

    //accessor methods
    public E getData() {
        return data;
    }

    public Node<E> getNext() {
        return next;
    }

    //update method
    public void setNext(Node<E> n) {
        next = n;
    }
}
