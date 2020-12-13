package ru.mirea.pr11.task_1_and_2;

import java.util.LinkedList;

public class LinkedQueue implements Queue{

    LinkedList<Object> elements = new LinkedList<>();
    @Override
    public void enqueue(Object element) {
        elements.add(element);
    }

    @Override
    public Object element() {
        return elements.getLast();
    }

    @Override
    public Object dequeue() {
        return elements.pollLast();
    }

    @Override
    public int size() {
        return elements.size();
    }

    @Override
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    @Override
    public void clear() {
        elements.clear();
    }

    @Override
    public String toString() {
        return "LinkedQueue{" +
                "elements=" + elements +
                '}';
    }
}
