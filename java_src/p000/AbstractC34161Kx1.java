package p000;

import java.util.NoSuchElementException;
import java.util.Queue;
/* renamed from: Kx1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34161Kx1<E> extends AbstractC31821Ax1<E> implements Queue<E> {
    @Override // p000.AbstractC31821Ax1, p000.AbstractC33927Jx1
    public abstract Queue<E> delegate();

    @Override // java.util.Queue
    public E element() {
        return delegate().element();
    }

    @Override // java.util.Queue
    public boolean offer(E e) {
        return delegate().offer(e);
    }

    @Override // java.util.Queue
    public E peek() {
        return delegate().peek();
    }

    @Override // java.util.Queue
    public E poll() {
        return delegate().poll();
    }

    @Override // java.util.Queue
    public E remove() {
        return delegate().remove();
    }

    public boolean standardOffer(E e) {
        try {
            return add(e);
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    public E standardPeek() {
        try {
            return element();
        } catch (NoSuchElementException unused) {
            return null;
        }
    }

    public E standardPoll() {
        try {
            return remove();
        } catch (NoSuchElementException unused) {
            return null;
        }
    }
}
