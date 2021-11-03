package edu.touro.cs.mcon264;

import static org.junit.jupiter.api.Assertions.*;

class LinkedList2Test {

    @org.junit.jupiter.api.Test
    void size() {
    }

    @org.junit.jupiter.api.Test
    void isEmpty() {
    }

    @org.junit.jupiter.api.Test
    void contains() {
    }

    @org.junit.jupiter.api.Test
    void add() {
        LinkedList2<Integer> list = new LinkedList2<>();
        list.add(0);
        list.add(1);
        list.add(2);

        assertEquals(3, list.size());
        for (int i=0;i<list.size();i++)
        {
            assertEquals(i, list.get(i));
        }
    }

    @org.junit.jupiter.api.Test
    void remove() {
    }

    @org.junit.jupiter.api.Test
    void clear() {
    }

    @org.junit.jupiter.api.Test
    void get() {
    }

    @org.junit.jupiter.api.Test
    void set() {
    }
}