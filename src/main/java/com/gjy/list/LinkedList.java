package com.gjy.list;

import java.util.NoSuchElementException;

public class LinkedList<E> {
    private int size = 0;
    private Node<E> first;
    private Node<E> last;

    private void linkFirst(E e){
        final Node<E> f = first;
        final Node<E> newNode = new Node<>(null,e,f);
        first = newNode;
        if (f == null)
            last = newNode;
        else
            f.prev = newNode;
        size++;
    }

    private void linkLast(E e){
        final Node<E> l = last;
        final Node<E> newNode = new Node<>(l,e,null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
    }

    public E getFirst(){
        final Node<E> f = first;
        if (f == null)
            throw new NoSuchElementException();
        return f.item;
    }

    public E getLast(){
        final Node<E> l = last;
        if (l == null)
            throw new NoSuchElementException();
        return l.item;
    }

    public boolean add(E e){
        linkLast(e);
        return true;
    }

    public int getSize(){
        return size;
    }

    public Node<E> node(int index){
        Node<E> x;
        if (index < (size >> 1)){
            x = first;
            for (int i = 0; i < index; i++)
                x = x.next;
        }else {
            x = last;
            for (int i = size - 1; i > index; i--)
                x = x.prev;
        }
        return x;
    }

    private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        public Node(Node<E> prev, E item, Node<E> next) {
            this.item = item;
            this.next = next;
            this.prev = prev;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "item=" + item +
                    '}';
        }
    }
}
