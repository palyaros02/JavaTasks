package ru.mirea.pr8;

public class BoundedWaitList<E> extends WaitList<E>{

    int capacity;

    public BoundedWaitList(int capacity) {
        super();
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void add(E element) {
        if(this.content.size() != this.capacity)
            super.add(element);
        else
            throw new ArrayIndexOutOfBoundsException("WaitList is full");
    }

    @Override
    public String toString() {
        return this.content.toString() +
            " capacity = " + capacity;
    }
}
