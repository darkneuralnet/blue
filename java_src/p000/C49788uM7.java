package p000;

import java.util.Iterator;
import java.util.Map;
/* renamed from: uM7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C49788uM7<K> implements Iterator<Map.Entry<K, Object>> {

    /* renamed from: b */
    public Iterator<Map.Entry<K, Object>> f112268b;

    public C49788uM7(Iterator<Map.Entry<K, Object>> it) {
        this.f112268b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f112268b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry<K, Object> next = this.f112268b.next();
        if (next.getValue() instanceof TK7) {
            return new C52150yL7(next);
        }
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f112268b.remove();
    }
}
