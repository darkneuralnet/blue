package p000;

import java.util.NoSuchElementException;
/* renamed from: TL7 */
/* loaded from: classes5.dex */
public abstract class TL7<E> extends AbstractC38523bO7<E> {

    /* renamed from: b */
    public final int f35368b;

    /* renamed from: c */
    public int f35369c;

    public TL7(int i, int i2) {
        C46222oL7.m21303b(i2, i, "index");
        this.f35368b = i;
        this.f35369c = i2;
    }

    /* renamed from: a */
    public abstract E mo83748a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f35369c < this.f35368b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f35369c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (hasNext()) {
            int i = this.f35369c;
            this.f35369c = i + 1;
            return mo83748a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f35369c;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (hasPrevious()) {
            int i = this.f35369c - 1;
            this.f35369c = i;
            return mo83748a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f35369c - 1;
    }
}
