package ru.mirea.pr11.task_1_and_2;

import java.util.Arrays;

public class ArrayQueueADT{
    private /*static*/ int size;
    private /*static*/ Object[] elements =
            new Object[1];

    public static void enqueue(ArrayQueueADT queue, Object element) {
        assert element != null;
        ensureCapacity(queue, queue.size + 1);
        queue.elements[queue.size++] = element;
    }

    private static void ensureCapacity(ArrayQueueADT queue, int capacity) {
        if (capacity <= queue.elements.length) {
            return;
        }
        Object[] newElements = new Object[capacity];
        if (queue.size >= 0) System.arraycopy(queue.elements, 0, newElements, 0, queue.size);
        queue.elements = newElements;
    }

    static Object dequeue(ArrayQueueADT queue) {
        assert queue.size > 0;
        Object temp = queue.elements[0];
        Object[] newElements = new Object[queue.size-1];
        System.arraycopy(queue.elements, 1, newElements, 0, queue.size - 1);
        queue.elements = newElements;
        queue.size--;
        return temp;
    }

    public static Object element(ArrayQueueADT queue) {  //голова
        assert queue.size > 0;
        return queue.elements[0];
    }

    public static int size(ArrayQueueADT queue) {
        return queue.size;
    }

    public static boolean isEmpty(ArrayQueueADT queue) {
        return queue.size == 0;
    }

    public static void clear(ArrayQueueADT queue) {
        queue.elements = new Object[0];
        queue.size = 0;
    }

    @Override
    public String toString() {
        return "ArrayQueueADT{" +
                "size=" + size +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }
}
