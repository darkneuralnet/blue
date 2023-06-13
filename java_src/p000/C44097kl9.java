package p000;

import java.util.Iterator;
/* renamed from: kl9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C44097kl9 implements Iterator {

    /* renamed from: b */
    public final Iterator f94884b;

    /* renamed from: c */
    public final /* synthetic */ Sl9 f94885c;

    public C44097kl9(Sl9 sl9) {
        Id9 id9;
        this.f94885c = sl9;
        id9 = sl9.f34238b;
        this.f94884b = id9.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f94884b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f94884b.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
