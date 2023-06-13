package p000;

import java.util.ListIterator;
/* renamed from: iu8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C43000iu8 implements ListIterator {

    /* renamed from: b */
    public final ListIterator f91673b;

    /* renamed from: c */
    public final /* synthetic */ int f91674c;

    /* renamed from: d */
    public final /* synthetic */ C33673Iu8 f91675d;

    public C43000iu8(C33673Iu8 c33673Iu8, int i) {
        InterfaceC42830id8 interfaceC42830id8;
        this.f91675d = c33673Iu8;
        this.f91674c = i;
        interfaceC42830id8 = c33673Iu8.f16452b;
        this.f91673b = interfaceC42830id8.listIterator(i);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f91673b.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f91673b.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f91673b.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f91673b.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f91673b.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f91673b.previousIndex();
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
