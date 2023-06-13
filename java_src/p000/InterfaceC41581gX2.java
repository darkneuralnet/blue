package p000;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* renamed from: gX2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC41581gX2<K, V> {
    /* renamed from: b */
    Collection<Map.Entry<K, V>> mo24584b();

    void clear();

    boolean containsKey(Object obj);

    boolean containsValue(Object obj);

    /* renamed from: d */
    InterfaceC45139mX2<K> mo39190d();

    /* renamed from: e */
    boolean mo39189e(K k, Iterable<? extends V> iterable);

    /* renamed from: f */
    Map<K, Collection<V>> mo24583f();

    /* renamed from: g */
    boolean mo39188g(Object obj, Object obj2);

    Collection<V> get(K k);

    Set<K> keySet();

    boolean put(K k, V v);

    boolean remove(Object obj, Object obj2);

    int size();
}
