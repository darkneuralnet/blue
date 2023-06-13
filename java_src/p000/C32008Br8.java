package p000;

import java.util.Iterator;
/* renamed from: Br8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C32008Br8 implements Iterator<String> {

    /* renamed from: b */
    public final Iterator<String> f2974b;

    /* renamed from: c */
    public final /* synthetic */ C34816Nr8 f2975c;

    public C32008Br8(C34816Nr8 c34816Nr8) {
        InterfaceC45222mf8 interfaceC45222mf8;
        this.f2975c = c34816Nr8;
        interfaceC45222mf8 = c34816Nr8.f25308b;
        this.f2974b = interfaceC45222mf8.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2974b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ String next() {
        return this.f2974b.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
