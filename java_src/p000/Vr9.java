package p000;

import java.util.Iterator;
/* renamed from: Vr9 */
/* loaded from: classes6.dex */
public final class Vr9 implements Iterator<String> {

    /* renamed from: b */
    public final Iterator<String> f39853b;

    /* renamed from: c */
    public final /* synthetic */ Xr9 f39854c;

    public Vr9(Xr9 xr9) {
        InterfaceC44127ko9 interfaceC44127ko9;
        this.f39854c = xr9;
        interfaceC44127ko9 = xr9.f44075b;
        this.f39853b = interfaceC44127ko9.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f39853b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ String next() {
        return this.f39853b.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
