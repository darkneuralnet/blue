package p000;

import java.util.Iterator;
/* renamed from: Fc7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C32808Fc7 implements Iterator {

    /* renamed from: b */
    public final Iterator f9771b;

    /* renamed from: c */
    public final /* synthetic */ C33042Gc7 f9772c;

    public C32808Fc7(C33042Gc7 c33042Gc7) {
        InterfaceC31629Ab7 interfaceC31629Ab7;
        this.f9772c = c33042Gc7;
        interfaceC31629Ab7 = c33042Gc7.f12165b;
        this.f9771b = interfaceC31629Ab7.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9771b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f9771b.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
