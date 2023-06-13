package p000;

import java.util.ListIterator;
/* renamed from: Tr9 */
/* loaded from: classes6.dex */
public final class Tr9 implements ListIterator<String> {

    /* renamed from: b */
    public final ListIterator<String> f36370b;

    /* renamed from: c */
    public final /* synthetic */ int f36371c;

    /* renamed from: d */
    public final /* synthetic */ Xr9 f36372d;

    public Tr9(Xr9 xr9, int i) {
        InterfaceC44127ko9 interfaceC44127ko9;
        this.f36372d = xr9;
        this.f36371c = i;
        interfaceC44127ko9 = xr9.f44075b;
        this.f36370b = interfaceC44127ko9.listIterator(i);
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f36370b.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f36370b.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return this.f36370b.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f36370b.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ String previous() {
        return this.f36370b.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f36370b.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(String str) {
        throw new UnsupportedOperationException();
    }
}
