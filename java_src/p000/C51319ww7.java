package p000;

import java.util.Iterator;
/* renamed from: ww7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C51319ww7 implements Iterator {

    /* renamed from: b */
    public final Iterator f116864b;

    /* renamed from: c */
    public final /* synthetic */ C51912xw7 f116865c;

    public C51319ww7(C51912xw7 c51912xw7) {
        InterfaceC35076Ou7 interfaceC35076Ou7;
        this.f116865c = c51912xw7;
        interfaceC35076Ou7 = c51912xw7.f118390b;
        this.f116864b = interfaceC35076Ou7.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f116864b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f116864b.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
