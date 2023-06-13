package p000;

import java.util.ListIterator;
/* renamed from: Ec7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C32574Ec7 implements ListIterator {

    /* renamed from: b */
    public final ListIterator f7862b;

    /* renamed from: c */
    public final /* synthetic */ int f7863c;

    /* renamed from: d */
    public final /* synthetic */ C33042Gc7 f7864d;

    public C32574Ec7(C33042Gc7 c33042Gc7, int i) {
        InterfaceC31629Ab7 interfaceC31629Ab7;
        this.f7864d = c33042Gc7;
        this.f7863c = i;
        interfaceC31629Ab7 = c33042Gc7.f12165b;
        this.f7862b = interfaceC31629Ab7.listIterator(i);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f7862b.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f7862b.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f7862b.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f7862b.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f7862b.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f7862b.previousIndex();
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
