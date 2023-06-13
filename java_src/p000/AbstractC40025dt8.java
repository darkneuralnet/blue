package p000;

import java.util.NoSuchElementException;
/* renamed from: dt8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC40025dt8 extends AbstractC34491Mh7 {

    /* renamed from: b */
    public final int f77362b;

    /* renamed from: c */
    public int f77363c;

    public AbstractC40025dt8(int i, int i2) {
        C43433je8.m30136b(i2, i, "index");
        this.f77362b = i;
        this.f77363c = i2;
    }

    /* renamed from: a */
    public abstract Object mo43532a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f77363c < this.f77362b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f77363c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i = this.f77363c;
            this.f77363c = i + 1;
            return mo43532a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f77363c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f77363c - 1;
            this.f77363c = i;
            return mo43532a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f77363c - 1;
    }
}
