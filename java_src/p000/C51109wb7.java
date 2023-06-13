package p000;

import java.util.Iterator;
import java.util.Map;
/* renamed from: wb7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C51109wb7 implements Iterator {

    /* renamed from: b */
    public final Iterator f116247b;

    public C51109wb7(Iterator it) {
        this.f116247b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f116247b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f116247b.next();
        if (entry.getValue() instanceof C51702xb7) {
            return new C48738sb7(entry, null);
        }
        return entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f116247b.remove();
    }
}
