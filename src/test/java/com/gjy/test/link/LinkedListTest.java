package com.gjy.test.link;

import com.gjy.list.LinkedList;
import org.junit.Test;

public class LinkedListTest {

    @Test
    public void test1(){
        LinkedList<String> list = new LinkedList<>();

        list.add("gjy");
        list.add("yq");
        list.add("ccx");
        list.add("dmm");

        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.getSize());
        System.out.println(list.node(2));
    }
}
