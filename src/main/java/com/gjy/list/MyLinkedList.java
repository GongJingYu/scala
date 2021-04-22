package com.gjy.list;

public class MyLinkedList {



    private static class Node {
        Integer item;
        Node next;

        public Node(Integer item, Node next) {
            this.item = item;
            this.next = next;
        }
    }
}
