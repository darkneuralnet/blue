package p000;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
/* renamed from: Dx1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC32523Dx1<E> extends AbstractC31821Ax1<E> implements List<E> {
    @Override // p000.AbstractC31821Ax1, p000.AbstractC33927Jx1
    /* renamed from: a */
    public abstract List<E> delegate();

    @Override // java.util.List
    public void add(int i, E e) {
        delegate().add(i, e);
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        return delegate().addAll(i, collection);
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return obj == this || delegate().equals(obj);
    }

    @Override // java.util.List
    public E get(int i) {
        return delegate().get(i);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return delegate().hashCode();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return delegate().indexOf(obj);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return delegate().lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return delegate().listIterator();
    }

    @Override // java.util.List
    public E remove(int i) {
        return delegate().remove(i);
    }

    @Override // java.util.List
    public E set(int i, E e) {
        return delegate().set(i, e);
    }

    @Override // java.util.List
    public List<E> subList(int i, int i2) {
        return delegate().subList(i, i2);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i) {
        return delegate().listIterator(i);
    }
}
