package p000;

import java.util.ListIterator;
/* renamed from: P48 */
/* loaded from: classes5.dex */
public final class P48 implements ListIterator<String> {

    /* renamed from: b */
    public ListIterator<String> f27850b;

    /* renamed from: c */
    public final /* synthetic */ int f27851c;

    /* renamed from: d */
    public final /* synthetic */ X38 f27852d;

    public P48(X38 x38, int i) {
        KM7 km7;
        this.f27852d = x38;
        this.f27851c = i;
        km7 = x38.f42591b;
        this.f27850b = km7.listIterator(i);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f27850b.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f27850b.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f27850b.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f27850b.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ String previous() {
        return this.f27850b.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f27850b.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(String str) {
        throw new UnsupportedOperationException();
    }
}
