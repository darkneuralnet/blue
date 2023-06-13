package p000;

import java.util.Iterator;
import java.util.Map;
/* renamed from: Ku7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C34140Ku7 implements Iterator {

    /* renamed from: b */
    public final Iterator f20339b;

    public C34140Ku7(Iterator it) {
        this.f20339b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f20339b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f20339b.next();
        if (entry.getValue() instanceof C34374Lu7) {
            return new C48336ru7(entry, null);
        }
        return entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f20339b.remove();
    }
}
