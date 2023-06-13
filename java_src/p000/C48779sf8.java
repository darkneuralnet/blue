package p000;

import java.util.ListIterator;
/* renamed from: sf8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48779sf8 implements ListIterator<String> {

    /* renamed from: b */
    public ListIterator<String> f109089b;

    /* renamed from: c */
    public final /* synthetic */ int f109090c;

    /* renamed from: d */
    public final /* synthetic */ C39886df8 f109091d;

    public C48779sf8(C39886df8 c39886df8, int i) {
        WW7 ww7;
        this.f109091d = c39886df8;
        this.f109090c = i;
        ww7 = c39886df8.f77015b;
        this.f109089b = ww7.listIterator(i);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f109089b.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f109089b.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f109089b.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f109089b.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ String previous() {
        return this.f109089b.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f109089b.previousIndex();
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
