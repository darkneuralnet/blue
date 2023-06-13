package p000;

import java.util.NoSuchElementException;
/* renamed from: xF7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC51503xF7 extends KO7 {

    /* renamed from: b */
    public final int f117255b;

    /* renamed from: c */
    public int f117256c;

    public AbstractC51503xF7(int i, int i2) {
        C44937mA7.m26193b(i2, i, "index");
        this.f117255b = i;
        this.f117256c = i2;
    }

    /* renamed from: a */
    public abstract Object mo5616a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f117256c < this.f117255b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f117256c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i = this.f117256c;
            this.f117256c = i + 1;
            return mo5616a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f117256c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f117256c - 1;
            this.f117256c = i;
            return mo5616a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f117256c - 1;
    }
}
