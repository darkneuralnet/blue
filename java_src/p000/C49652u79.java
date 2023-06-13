package p000;

import java.util.Iterator;
/* renamed from: u79  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C49652u79 implements Iterator {

    /* renamed from: b */
    public final Iterator f111775b;

    /* renamed from: c */
    public final /* synthetic */ B79 f111776c;

    public C49652u79(B79 b79) {
        InterfaceC48702sX8 interfaceC48702sX8;
        this.f111776c = b79;
        interfaceC48702sX8 = b79.f1899b;
        this.f111775b = interfaceC48702sX8.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f111775b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f111775b.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
