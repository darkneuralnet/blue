package p000;

import java.util.NoSuchElementException;
import org.jspecify.nullness.NullMarked;
@NullMarked
/* renamed from: Gy9 */
/* loaded from: classes5.dex */
public abstract class Gy9 extends AbstractC35256Po7 {

    /* renamed from: b */
    public final int f12685b;

    /* renamed from: c */
    public int f12686c;

    public Gy9(int i, int i2) {
        Uo9.m80801b(i2, i, "index");
        this.f12685b = i;
        this.f12686c = i2;
    }

    /* renamed from: a */
    public abstract Object mo11837a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f12686c < this.f12685b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f12686c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i = this.f12686c;
            this.f12686c = i + 1;
            return mo11837a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f12686c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f12686c - 1;
            this.f12686c = i;
            return mo11837a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f12686c - 1;
    }
}
