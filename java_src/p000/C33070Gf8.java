package p000;

import java.util.Iterator;
/* renamed from: Gf8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C33070Gf8 implements Iterator<String> {

    /* renamed from: b */
    public Iterator<String> f12223b;

    /* renamed from: c */
    public final /* synthetic */ C39886df8 f12224c;

    public C33070Gf8(C39886df8 c39886df8) {
        WW7 ww7;
        this.f12224c = c39886df8;
        ww7 = c39886df8.f77015b;
        this.f12223b = ww7.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12223b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.f12223b.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
