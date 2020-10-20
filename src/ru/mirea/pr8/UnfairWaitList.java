package ru.mirea.pr8;

import java.util.ArrayList;

public class UnfairWaitList<E> extends WaitList<E>{
    ArrayList<E> deleted = new ArrayList<>();
    public UnfairWaitList() {
        super();
    }

    @Override
    public void add(E element) {
        if(!(deleted.contains(element)))
            super.add(element);
        else
            System.out.println("error");
    }

    public void remove(E element) {
        deleted.add(element);
        this.content.remove(element);
    }
    public void moveToBack(E element){
        remove(element);
        this.content.add(element);
    }
}
