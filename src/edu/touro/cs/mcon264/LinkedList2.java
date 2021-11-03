package edu.touro.cs.mcon264;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LinkedList2<T> implements List<T> {

    private Node<T> head = new Node<>(null,null);
    private int size;

    private static class Node<T> // static - no access to outer class except static members
    {
        Node(T data, Node<T> next)
        {
            this.data = data;
            this.next = next;
        }
        T data;
        Node<T> next;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator();
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean add(T t) {
        Node<T> newNode = new Node<>(t, null);
        Node<T> tail = getTail();
        tail.next = newNode;
        size++;
        return true;
    }

    private Node<T> getNode(int index)
    {
        if (isEmpty()) // TODO, cleanup index < 0 or index >= size()
            throw new RuntimeException("no Tail for empty list");
        Node<T> t = head;
        for (int i=-1; i < index; i++){
            t = t.next;
        }
        return t;
    }

    private Node<T> getTail()
    {
        return getNode(size() - 1);

    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        head.next = null; // dummy set to null

    }

    @Override
    public T get(int index) {
        boundsCheck(index, false);
        return getNode(index).data;
    }

    private void boundsCheck(int index, boolean inclusiveOfSize) {
        // TODO
    }

    @Override
    public T set(int index, T element) {
        boundsCheck(index, false);
        Node<T> n = getNode(index);
        T oldVal = n.data;
        n.data = element;
        return oldVal;
    }

    @Override
    public void add(int index, T element) {
        boundsCheck(index, true);
//        preNode = getNode(index-1);
//        newNode.next = preNode.next; // 1
//        preNode.next = newNode; // 2


    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }

    // non static inner class
    private class MyIterator implements Iterator<T> {

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public T next() {
            return null;
        }
    }
}
