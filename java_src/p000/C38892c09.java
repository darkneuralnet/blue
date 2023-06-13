package p000;

import java.util.Iterator;
/* renamed from: c09  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C38892c09 implements Iterator<String> {

    /* renamed from: b */
    public Iterator<String> f59884b;

    /* renamed from: c */
    public final /* synthetic */ C38623bZ8 f59885c;

    public C38892c09(C38623bZ8 c38623bZ8) {
        InterfaceC41488gM8 interfaceC41488gM8;
        this.f59885c = c38623bZ8;
        interfaceC41488gM8 = c38623bZ8.f57700b;
        this.f59884b = interfaceC41488gM8.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f59884b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.f59884b.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
