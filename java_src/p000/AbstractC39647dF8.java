package p000;

import java.util.NoSuchElementException;
/* renamed from: dF8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC39647dF8 extends AbstractC49169tJ8 {

    /* renamed from: b */
    public final int f76329b;

    /* renamed from: c */
    public int f76330c;

    public AbstractC39647dF8(int i, int i2) {
        C38425bD8.m64818b(i2, i, "index");
        this.f76329b = i;
        this.f76330c = i2;
    }

    /* renamed from: a */
    public abstract Object mo5573a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f76330c < this.f76329b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f76330c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i = this.f76330c;
            this.f76330c = i + 1;
            return mo5573a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f76330c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f76330c - 1;
            this.f76330c = i;
            return mo5573a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f76330c - 1;
    }
}
