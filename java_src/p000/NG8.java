package p000;

import java.util.NoSuchElementException;
/* renamed from: NG8 */
/* loaded from: classes5.dex */
public abstract class NG8 extends AbstractC47426qN7 {

    /* renamed from: b */
    public final int f24386b;

    /* renamed from: c */
    public int f24387c;

    public NG8(int i, int i2) {
        C41211ft8.m40588b(i2, i, "index");
        this.f24386b = i;
        this.f24387c = i2;
    }

    /* renamed from: a */
    public abstract Object mo94110a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f24387c < this.f24386b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f24387c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i = this.f24387c;
            this.f24387c = i + 1;
            return mo94110a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f24387c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f24387c - 1;
            this.f24387c = i;
            return mo94110a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f24387c - 1;
    }
}
