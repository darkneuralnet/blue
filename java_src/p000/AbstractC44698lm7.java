package p000;

import java.util.NoSuchElementException;
/* renamed from: lm7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC44698lm7 extends AbstractC37867aH7 {

    /* renamed from: b */
    public final int f96676b;

    /* renamed from: c */
    public int f96677c;

    public AbstractC44698lm7(int i, int i2) {
        C49421tk7.m11817b(i2, i, "index");
        this.f96676b = i;
        this.f96677c = i2;
    }

    /* renamed from: a */
    public abstract Object mo26840a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f96677c < this.f96676b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f96677c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i = this.f96677c;
            this.f96677c = i + 1;
            return mo26840a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f96677c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f96677c - 1;
            this.f96677c = i;
            return mo26840a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f96677c - 1;
    }
}
