package p000;

import java.util.ListIterator;
/* renamed from: el9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C40539el9 implements ListIterator {

    /* renamed from: b */
    public final ListIterator f78831b;

    /* renamed from: c */
    public final /* synthetic */ int f78832c;

    /* renamed from: d */
    public final /* synthetic */ Sl9 f78833d;

    public C40539el9(Sl9 sl9, int i) {
        Id9 id9;
        this.f78833d = sl9;
        this.f78832c = i;
        id9 = sl9.f34238b;
        this.f78831b = id9.listIterator(i);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f78831b.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f78831b.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f78831b.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f78831b.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f78831b.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f78831b.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
