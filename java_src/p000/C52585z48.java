package p000;

import java.util.Iterator;
/* renamed from: z48  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C52585z48 implements Iterator<String> {

    /* renamed from: b */
    public Iterator<String> f120745b;

    /* renamed from: c */
    public final /* synthetic */ X38 f120746c;

    public C52585z48(X38 x38) {
        KM7 km7;
        this.f120746c = x38;
        km7 = x38.f42591b;
        this.f120745b = km7.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f120745b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.f120745b.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
