package p000;

import java.util.Comparator;
import java.util.SortedMap;
/* renamed from: Nx1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34863Nx1<K, V> extends AbstractC33459Hx1<K, V> implements SortedMap<K, V> {
    /* renamed from: c */
    public static int m93167c(Comparator<?> comparator, Object obj, Object obj2) {
        if (comparator == null) {
            return ((Comparable) obj).compareTo(obj2);
        }
        return comparator.compare(obj, obj2);
    }

    @Override // p000.AbstractC33459Hx1, p000.AbstractC33927Jx1
    /* renamed from: b */
    public abstract SortedMap<K, V> delegate();

    @Override // java.util.SortedMap
    public Comparator<? super K> comparator() {
        return delegate().comparator();
    }

    @Override // java.util.SortedMap
    public K firstKey() {
        return delegate().firstKey();
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> headMap(K k) {
        return delegate().headMap(k);
    }

    @Override // java.util.SortedMap
    public K lastKey() {
        return delegate().lastKey();
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> subMap(K k, K k2) {
        return delegate().subMap(k, k2);
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> tailMap(K k) {
        return delegate().tailMap(k);
    }
}
