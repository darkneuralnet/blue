package p000;

import java.util.NoSuchElementException;
/* renamed from: ZM8 */
/* loaded from: classes6.dex */
public abstract class ZM8<E> extends AbstractC45711nU8<E> {

    /* renamed from: b */
    public final int f48398b;

    /* renamed from: c */
    public int f48399c;

    public ZM8(int i, int i2) {
        C52142yK8.m3663b(i2, i, "index");
        this.f48398b = i;
        this.f48399c = i2;
    }

    /* renamed from: a */
    public abstract E mo15988a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f48399c < this.f48398b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f48399c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (hasNext()) {
            int i = this.f48399c;
            this.f48399c = i + 1;
            return mo15988a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f48399c;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (hasPrevious()) {
            int i = this.f48399c - 1;
            this.f48399c = i;
            return mo15988a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f48399c - 1;
    }
}
