package io.reactivex.internal.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: io.reactivex.internal.util.t */
/* loaded from: classes8.dex */
public final class C24488t<T> extends AtomicInteger implements List<T>, RandomAccess {
    private static final long serialVersionUID = 3972397474470203923L;

    /* renamed from: b */
    public final ArrayList<T> f91090b = new ArrayList<>();

    @Override // java.util.List, java.util.Collection
    public boolean add(T t) {
        boolean add = this.f91090b.add(t);
        lazySet(this.f91090b.size());
        return add;
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        boolean addAll = this.f91090b.addAll(collection);
        lazySet(this.f91090b.size());
        return addAll;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        this.f91090b.clear();
        lazySet(0);
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return this.f91090b.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return this.f91090b.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        if (obj instanceof C24488t) {
            return this.f91090b.equals(((C24488t) obj).f91090b);
        }
        return this.f91090b.equals(obj);
    }

    @Override // java.util.List
    public T get(int i) {
        return this.f91090b.get(i);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.f91090b.hashCode();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return this.f91090b.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return get() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return this.f91090b.iterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return this.f91090b.lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<T> listIterator() {
        return this.f91090b.listIterator();
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        boolean remove = this.f91090b.remove(obj);
        lazySet(this.f91090b.size());
        return remove;
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        boolean removeAll = this.f91090b.removeAll(collection);
        lazySet(this.f91090b.size());
        return removeAll;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        boolean retainAll = this.f91090b.retainAll(collection);
        lazySet(this.f91090b.size());
        return retainAll;
    }

    @Override // java.util.List
    public T set(int i, T t) {
        return this.f91090b.set(i, t);
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return get();
    }

    @Override // java.util.List
    public List<T> subList(int i, int i2) {
        return this.f91090b.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return this.f91090b.toArray();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger
    public String toString() {
        return this.f91090b.toString();
    }

    @Override // java.util.List
    public ListIterator<T> listIterator(int i) {
        return this.f91090b.listIterator(i);
    }

    @Override // java.util.List, java.util.Collection
    public <E> E[] toArray(E[] eArr) {
        return (E[]) this.f91090b.toArray(eArr);
    }

    @Override // java.util.List
    public void add(int i, T t) {
        this.f91090b.add(i, t);
        lazySet(this.f91090b.size());
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends T> collection) {
        boolean addAll = this.f91090b.addAll(i, collection);
        lazySet(this.f91090b.size());
        return addAll;
    }

    @Override // java.util.List
    public T remove(int i) {
        T remove = this.f91090b.remove(i);
        lazySet(this.f91090b.size());
        return remove;
    }
}
