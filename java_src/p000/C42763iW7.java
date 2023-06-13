package p000;

import java.util.Iterator;
import java.util.Map;
/* renamed from: iW7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C42763iW7<K> implements Iterator<Map.Entry<K, Object>> {

    /* renamed from: b */
    public Iterator<Map.Entry<K, Object>> f87431b;

    public C42763iW7(Iterator<Map.Entry<K, Object>> it) {
        this.f87431b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f87431b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry<K, Object> next = this.f87431b.next();
        return next.getValue() instanceof C48683sV7 ? new UV7(next) : next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f87431b.remove();
    }
}
