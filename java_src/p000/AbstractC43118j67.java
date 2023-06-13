package p000;

import java.util.ListIterator;
/* renamed from: j67  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC43118j67 extends AbstractC42525i67 implements ListIterator {
    public AbstractC43118j67(ListIterator listIterator) {
        super(listIterator);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Iterator, java.util.ListIterator] */
    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f86759b.hasPrevious();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Iterator, java.util.ListIterator] */
    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f86759b.nextIndex();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Iterator, java.util.ListIterator] */
    @Override // java.util.ListIterator
    public final Object previous() {
        return mo34440a(this.f86759b.previous());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Iterator, java.util.ListIterator] */
    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f86759b.previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
