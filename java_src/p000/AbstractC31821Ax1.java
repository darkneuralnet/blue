package p000;

import java.util.Collection;
import java.util.Iterator;
/* renamed from: Ax1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31821Ax1<E> extends AbstractC33927Jx1 implements Collection<E> {
    @Override // java.util.Collection
    public boolean add(E e) {
        return delegate().add(e);
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        return delegate().addAll(collection);
    }

    @Override // java.util.Collection
    public void clear() {
        delegate().clear();
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return delegate().contains(obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return delegate().containsAll(collection);
    }

    @Override // p000.AbstractC33927Jx1
    public abstract Collection<E> delegate();

    @Override // java.util.Collection
    public boolean isEmpty() {
        return delegate().isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return delegate().iterator();
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        return delegate().remove(obj);
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        return delegate().removeAll(collection);
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        return delegate().retainAll(collection);
    }

    @Override // java.util.Collection
    public int size() {
        return delegate().size();
    }

    public boolean standardAddAll(Collection<? extends E> collection) {
        return C52933zg2.m597a(this, collection.iterator());
    }

    public void standardClear() {
        C52933zg2.m595c(iterator());
    }

    public boolean standardContains(Object obj) {
        return C52933zg2.m593e(iterator(), obj);
    }

    public boolean standardContainsAll(Collection<?> collection) {
        return C44098km0.m28480a(this, collection);
    }

    public boolean standardIsEmpty() {
        return !iterator().hasNext();
    }

    public boolean standardRemove(Object obj) {
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (C37025Xd3.m76748a(it.next(), obj)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    public boolean standardRemoveAll(Collection<?> collection) {
        return C52933zg2.m583o(iterator(), collection);
    }

    public boolean standardRetainAll(Collection<?> collection) {
        return C52933zg2.m581q(iterator(), collection);
    }

    public Object[] standardToArray() {
        return toArray(new Object[size()]);
    }

    public String standardToString() {
        return C44098km0.m28476e(this);
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return delegate().toArray();
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) delegate().toArray(tArr);
    }

    public <T> T[] standardToArray(T[] tArr) {
        return (T[]) C33281Hd3.m103633i(this, tArr);
    }
}
