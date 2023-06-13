package p000;

import java.util.NoSuchElementException;
/* renamed from: xh7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC51762xh7 extends OV7 {

    /* renamed from: b */
    public final int f117980b;

    /* renamed from: c */
    public int f117981c;

    public AbstractC51762xh7(int i, int i2) {
        C31899Bf7.m113728b(i2, i, "index");
        this.f117980b = i;
        this.f117981c = i2;
    }

    /* renamed from: a */
    public abstract Object mo4875a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f117981c < this.f117980b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f117981c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i = this.f117981c;
            this.f117981c = i + 1;
            return mo4875a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f117981c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f117981c - 1;
            this.f117981c = i;
            return mo4875a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f117981c - 1;
    }
}
