package p000;

import java.util.Iterator;
import java.util.Map;
/* renamed from: YK8 */
/* loaded from: classes6.dex */
public final class YK8<K> implements Iterator<Map.Entry<K, Object>> {

    /* renamed from: b */
    public Iterator<Map.Entry<K, Object>> f45004b;

    public YK8(Iterator<Map.Entry<K, Object>> it) {
        this.f45004b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f45004b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry<K, Object> next = this.f45004b.next();
        if (next.getValue() instanceof MK8) {
            return new C43851kL8(next);
        }
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f45004b.remove();
    }
}
