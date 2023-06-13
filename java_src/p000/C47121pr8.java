package p000;

import java.util.ListIterator;
/* renamed from: pr8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C47121pr8 implements ListIterator<String> {

    /* renamed from: b */
    public final ListIterator<String> f104190b;

    /* renamed from: c */
    public final /* synthetic */ int f104191c;

    /* renamed from: d */
    public final /* synthetic */ C34816Nr8 f104192d;

    public C47121pr8(C34816Nr8 c34816Nr8, int i) {
        InterfaceC45222mf8 interfaceC45222mf8;
        this.f104192d = c34816Nr8;
        this.f104191c = i;
        interfaceC45222mf8 = c34816Nr8.f25308b;
        this.f104190b = interfaceC45222mf8.listIterator(i);
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f104190b.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f104190b.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return this.f104190b.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f104190b.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ String previous() {
        return this.f104190b.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f104190b.previousIndex();
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
