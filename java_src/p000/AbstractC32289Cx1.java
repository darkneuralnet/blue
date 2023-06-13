package p000;

import java.util.Deque;
import java.util.Iterator;
/* renamed from: Cx1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC32289Cx1<E> extends AbstractC34161Kx1<E> implements Deque<E> {
    @Override // java.util.Deque
    public void addFirst(E e) {
        delegate().addFirst(e);
    }

    @Override // java.util.Deque
    public void addLast(E e) {
        delegate().addLast(e);
    }

    @Override // p000.AbstractC34161Kx1, p000.AbstractC31821Ax1, p000.AbstractC33927Jx1
    public abstract Deque<E> delegate();

    @Override // java.util.Deque
    public Iterator<E> descendingIterator() {
        return delegate().descendingIterator();
    }

    @Override // java.util.Deque
    public E getFirst() {
        return delegate().getFirst();
    }

    @Override // java.util.Deque
    public E getLast() {
        return delegate().getLast();
    }

    @Override // java.util.Deque
    public boolean offerFirst(E e) {
        return delegate().offerFirst(e);
    }

    @Override // java.util.Deque
    public boolean offerLast(E e) {
        return delegate().offerLast(e);
    }

    @Override // java.util.Deque
    public E peekFirst() {
        return delegate().peekFirst();
    }

    @Override // java.util.Deque
    public E peekLast() {
        return delegate().peekLast();
    }

    @Override // java.util.Deque
    public E pollFirst() {
        return delegate().pollFirst();
    }

    @Override // java.util.Deque
    public E pollLast() {
        return delegate().pollLast();
    }

    @Override // java.util.Deque
    public E pop() {
        return delegate().pop();
    }

    @Override // java.util.Deque
    public void push(E e) {
        delegate().push(e);
    }

    @Override // java.util.Deque
    public E removeFirst() {
        return delegate().removeFirst();
    }

    @Override // java.util.Deque
    public boolean removeFirstOccurrence(Object obj) {
        return delegate().removeFirstOccurrence(obj);
    }

    @Override // java.util.Deque
    public E removeLast() {
        return delegate().removeLast();
    }

    @Override // java.util.Deque
    public boolean removeLastOccurrence(Object obj) {
        return delegate().removeLastOccurrence(obj);
    }
}
