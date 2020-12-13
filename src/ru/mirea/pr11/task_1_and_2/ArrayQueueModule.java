package ru.mirea.pr11.task_1_and_2;

import java.util.Arrays;

public class ArrayQueueModule{
    public static int size;
    public static Object[] elements = new Object[1];

    public static void enqueue(Object element) {
        assert element != null;
        ensureCapacity(size+1);
        elements[size++] = element;
    }

    static void ensureCapacity(int capacity) {
        if (capacity <= elements.length) {
            return;
        }
        Object[] newElements = new Object[capacity];
        if (size >= 0) System.arraycopy(elements, 0, newElements, 0, size);
        elements = newElements;
    }

    public static Object element() {
        assert size > 0;
        return elements[0];
    }

    public static Object dequeue() {
        assert size > 0;
        Object temp = elements[0];
        Object[] newElements = new Object[size-1];
        System.arraycopy(elements, 1, newElements, 0, size - 1);
        elements = newElements;
        size--;
        return temp;
    }

    public static int size() {
        return size;
    }

    public static boolean isEmpty() {
        return size == 0;
    }

    public static void clear() {
        elements = new Object[0];
        size = 0;
    }

    public String toString() {
        return "ArrayQueueModule{" +
                "size=" + size +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }
}
