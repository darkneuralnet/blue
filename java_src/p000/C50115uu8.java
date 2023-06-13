package p000;

import java.util.Iterator;
/* renamed from: uu8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C50115uu8 implements Iterator {

    /* renamed from: b */
    public final Iterator f113191b;

    /* renamed from: c */
    public final /* synthetic */ C33673Iu8 f113192c;

    public C50115uu8(C33673Iu8 c33673Iu8) {
        InterfaceC42830id8 interfaceC42830id8;
        this.f113192c = c33673Iu8;
        interfaceC42830id8 = c33673Iu8.f16452b;
        this.f113191b = interfaceC42830id8.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f113191b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f113191b.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
