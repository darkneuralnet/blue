package p000;

import java.util.Iterator;
import java.util.Map;
/* renamed from: ic8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C42820ic8 implements Iterator {

    /* renamed from: b */
    public final Iterator f87528b;

    public C42820ic8(Iterator it) {
        this.f87528b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f87528b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f87528b.next();
        if (entry.getValue() instanceof C51713xc8) {
            return new C37012Xb8(entry, null);
        }
        return entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f87528b.remove();
    }
}
