package p000;

import java.util.ListIterator;
/* renamed from: mV7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC45126mV7 extends ZU7 implements ListIterator {
    public AbstractC45126mV7(ListIterator listIterator) {
        super(listIterator);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.f48684b).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.f48684b).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return mo15989a(((ListIterator) this.f48684b).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.f48684b).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
