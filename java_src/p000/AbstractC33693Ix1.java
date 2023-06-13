package p000;

import java.util.Map;
/* renamed from: Ix1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33693Ix1<K, V> extends AbstractC33927Jx1 implements Map.Entry<K, V> {
    @Override // p000.AbstractC33927Jx1
    /* renamed from: a */
    public abstract Map.Entry<K, V> delegate();

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        return delegate().equals(obj);
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return delegate().getKey();
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return delegate().getValue();
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        return delegate().hashCode();
    }

    @Override // java.util.Map.Entry
    public V setValue(V v) {
        return delegate().setValue(v);
    }
}
