package p000;

import java.util.NoSuchElementException;
/* renamed from: x0 */
/* loaded from: classes6.dex */
public abstract class AbstractC30014x0<E> extends AbstractC49953ue6<E> {

    /* renamed from: b */
    public final int f116953b;

    /* renamed from: c */
    public int f116954c;

    public AbstractC30014x0(int i) {
        this(i, 0);
    }

    /* renamed from: a */
    public abstract E mo573a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f116954c < this.f116953b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f116954c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (hasNext()) {
            int i = this.f116954c;
            this.f116954c = i + 1;
            return mo573a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f116954c;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (hasPrevious()) {
            int i = this.f116954c - 1;
            this.f116954c = i;
            return mo573a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f116954c - 1;
    }

    public AbstractC30014x0(int i, int i2) {
        EZ3.m108798q(i2, i);
        this.f116953b = i;
        this.f116954c = i2;
    }
}
