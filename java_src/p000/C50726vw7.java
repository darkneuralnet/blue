package p000;

import java.util.ListIterator;
/* renamed from: vw7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C50726vw7 implements ListIterator {

    /* renamed from: b */
    public final ListIterator f114925b;

    /* renamed from: c */
    public final /* synthetic */ int f114926c;

    /* renamed from: d */
    public final /* synthetic */ C51912xw7 f114927d;

    public C50726vw7(C51912xw7 c51912xw7, int i) {
        InterfaceC35076Ou7 interfaceC35076Ou7;
        this.f114927d = c51912xw7;
        this.f114926c = i;
        interfaceC35076Ou7 = c51912xw7.f118390b;
        this.f114925b = interfaceC35076Ou7.listIterator(i);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f114925b.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f114925b.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f114925b.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f114925b.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f114925b.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f114925b.previousIndex();
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
