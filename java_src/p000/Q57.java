package p000;

import java.util.NoSuchElementException;
/* renamed from: Q57 */
/* loaded from: classes5.dex */
public abstract class Q57 extends AbstractC44304l67 {

    /* renamed from: b */
    public final int f29822b;

    /* renamed from: c */
    public int f29823c;

    public Q57(int i, int i2) {
        J57.m101168b(i2, i, "index");
        this.f29822b = i;
        this.f29823c = i2;
    }

    /* renamed from: a */
    public abstract Object mo80421a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f29823c < this.f29822b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f29823c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i = this.f29823c;
            this.f29823c = i + 1;
            return mo80421a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f29823c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f29823c - 1;
            this.f29823c = i;
            return mo80421a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f29823c - 1;
    }
}
