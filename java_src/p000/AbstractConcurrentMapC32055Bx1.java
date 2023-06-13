package p000;

import java.util.concurrent.ConcurrentMap;
/* renamed from: Bx1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractConcurrentMapC32055Bx1<K, V> extends AbstractC33459Hx1<K, V> implements ConcurrentMap<K, V> {
    @Override // p000.AbstractC33459Hx1, p000.AbstractC33927Jx1
    /* renamed from: b */
    public abstract ConcurrentMap<K, V> delegate();

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V putIfAbsent(K k, V v) {
        return delegate().putIfAbsent(k, v);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean remove(Object obj, Object obj2) {
        return delegate().remove(obj, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V replace(K k, V v) {
        return delegate().replace(k, v);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean replace(K k, V v, V v2) {
        return delegate().replace(k, v, v2);
    }
}
