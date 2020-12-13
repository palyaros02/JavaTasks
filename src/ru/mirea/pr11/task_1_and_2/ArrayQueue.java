package ru.mirea.pr11.task_1_and_2;

import java.util.Arrays;

public class ArrayQueue implements Queue{
    private int size; //размер
    private Object[] elements = new Object[1]; //массив

    public void enqueue(Object element) { //добавление элемента
        assert element != null;
        ensureCapacity(size+1);
        elements[size++] = element;
    }

    private void ensureCapacity(int capacity) { //увеличение емкости очереди
        if (capacity <= elements.length) {
            return;
        }
        Object[] newElements = new Object[capacity];
        if (size >= 0) System.arraycopy(elements, 0, newElements, 0, size);
        elements = newElements;
    }

    public Object element() {  //голова
        assert size > 0;
        return elements[0];
    }

    public Object dequeue() { //удаление элемента
        assert size > 0;
        Object temp = elements[0];
        Object[] newElements = new Object[size-1];
        System.arraycopy(elements, 1, newElements, 0, size - 1);
        elements = newElements;
        size--;
        return temp;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        elements = new Object[0];
        size = 0;
    }

    @Override
    public String toString() {
        return "ArrayQueue{" +
                "size=" + size +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }

}
