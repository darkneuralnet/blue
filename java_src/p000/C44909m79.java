package p000;

import java.util.ListIterator;
/* renamed from: m79  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C44909m79 implements ListIterator {

    /* renamed from: b */
    public final ListIterator f97380b;

    /* renamed from: c */
    public final /* synthetic */ int f97381c;

    /* renamed from: d */
    public final /* synthetic */ B79 f97382d;

    public C44909m79(B79 b79, int i) {
        InterfaceC48702sX8 interfaceC48702sX8;
        this.f97382d = b79;
        this.f97381c = i;
        interfaceC48702sX8 = b79.f1899b;
        this.f97380b = interfaceC48702sX8.listIterator(i);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f97380b.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f97380b.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f97380b.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f97380b.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f97380b.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f97380b.previousIndex();
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
