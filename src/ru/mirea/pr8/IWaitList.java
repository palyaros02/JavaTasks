package ru.mirea.pr8;
/**
 * Интерфейсный класс.
 * Содержит методы
 * void add(E element);
 * E remove();
 * boolean contains(E element);
 * boolean containsAll(Collection<E> c);
 * boolean isEmpty();
 */

import java.util.Collection;

public interface IWaitList<E> {
    void add(E element);
    E remove();
    boolean contains(E element);
    boolean containsAll(Collection<E> c);
    boolean isEmpty();
}
