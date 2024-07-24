package com.maxwell.internship;

public class LinkedList<E> {
    //instance variables
    Node<E> head = null;
    Node<E> tail = null;

    int size = 0;

    public LinkedList(){}

    @SafeVarargs
    public LinkedList(E... items){
        for(E item:items)
            addLast(item);
    }

    // accessor methods
    public int size(){return size;}

    public E getFirst(){
        if(size == 0) return null;
        return head.getData();
    }
    public E getLast(){
        if(size == 0) return null;
        return tail.getData();
    }

    //update methods
    //adds a node to the front of the list
    public void addFirst(E d){
        if(size == 0)
            head = tail = new Node<>(d, null);

        else
            head = new Node<>(d, head);
        size++;
    }
    //adds a node to the end of the list

    public void addLast(E d){

        var newNode = new com.maxwell.internship.Node<>(d, null);
        if(size == 0)
            head = tail = newNode;
        else{
            tail.setNext(newNode);
            tail = newNode;
        }
        size++;
    }


    //removes a node from the front of the list
    public E removeFirst(){
        if(size == 0) return null;
        E temp = head.getData();
        head = head.getNext();
        size--;
        if(size == 0)
            tail = null;
        return temp;
    }

    //outputs data stored in nested linked lists
    public void show(){
        System.out.println(this);
    }

    //prints the data stored in a linked list instance
    public String toString(){
        var current = head;
        var sb = new StringBuilder();
        sb.append('[');
        while(current != null){
            sb.append(current.getData().toString());
            if(current.getNext() != null)
                sb.append(", ");
            current = current.getNext();
        }
        sb.append(']');
        return sb.toString();
    }
}
