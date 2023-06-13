package p000;

import java.util.NoSuchElementException;
/* renamed from: uv7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC50124uv7 extends AbstractC49312tZ7 {

    /* renamed from: b */
    public final int f113210b;

    /* renamed from: c */
    public int f113211c;

    public AbstractC50124uv7(int i, int i2) {
        C34833Nt7.m93212b(i2, i, "index");
        this.f113210b = i;
        this.f113211c = i2;
    }

    /* renamed from: a */
    public abstract Object mo9485a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f113211c < this.f113210b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f113211c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i = this.f113211c;
            this.f113211c = i + 1;
            return mo9485a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f113211c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f113211c - 1;
            this.f113211c = i;
            return mo9485a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f113211c - 1;
    }
}
