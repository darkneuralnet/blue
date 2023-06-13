package p000;

import java.util.NoSuchElementException;
/* renamed from: YR8 */
/* loaded from: classes5.dex */
public abstract class YR8 extends RX8 {

    /* renamed from: b */
    public final int f45884b;

    /* renamed from: c */
    public int f45885c;

    public YR8(int i, int i2) {
        DQ8.m110469b(i2, i, "index");
        this.f45884b = i;
        this.f45885c = i2;
    }

    /* renamed from: a */
    public abstract Object mo75006a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f45885c < this.f45884b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f45885c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i = this.f45885c;
            this.f45885c = i + 1;
            return mo75006a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f45885c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f45885c - 1;
            this.f45885c = i;
            return mo75006a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f45885c - 1;
    }
}
