package p000;

import java.util.Iterator;
/* renamed from: Zr5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C37621Zr5<T> implements Iterator<InterfaceC37153Xr5> {

    /* renamed from: b */
    public Iterator<T> f49409b;

    public C37621Zr5(Iterator<T> it) {
        this.f49409b = it;
    }

    @Override // java.util.Iterator
    /* renamed from: a */
    public InterfaceC37153Xr5 next() {
        return new C37387Yr5(this.f49409b.next());
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f49409b.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f49409b.remove();
    }
}
