package ru.mirea.pr11.task_1_and_2;

public interface Queue {
    void enqueue(Object element);
    Object element();
    Object dequeue();
    int size();
    boolean isEmpty();
    void clear();
}
