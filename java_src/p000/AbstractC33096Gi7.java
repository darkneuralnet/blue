package p000;

import java.util.NoSuchElementException;
/* renamed from: Gi7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC33096Gi7 extends AbstractC42152hU7 {

    /* renamed from: b */
    public final int f12292b;

    /* renamed from: c */
    public int f12293c;

    public AbstractC33096Gi7(int i, int i2) {
        C50566vg7.m8262b(i2, i, "index");
        this.f12292b = i;
        this.f12293c = i2;
    }

    /* renamed from: a */
    public abstract Object mo44368a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f12293c < this.f12292b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f12293c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i = this.f12293c;
            this.f12293c = i + 1;
            return mo44368a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f12293c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f12293c - 1;
            this.f12293c = i;
            return mo44368a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f12293c - 1;
    }
}
