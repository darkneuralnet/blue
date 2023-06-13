package p000;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import p000.AbstractC6216P0;
/* renamed from: qK2  reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C47394qK2<K, V> extends AbstractC6216P0<K, V, V> {

    /* renamed from: b */
    public static final Y94<Map<Object, Object>> f105121b = C39546d52.m44621a(Collections.emptyMap());

    /* renamed from: qK2$b */
    /* loaded from: classes7.dex */
    public static final class C27581b<K, V> extends AbstractC6216P0.AbstractC6217a<K, V, V> {
        /* renamed from: b */
        public C47394qK2<K, V> m17608b() {
            return new C47394qK2<>(this.f27725a);
        }

        /* renamed from: c */
        public C27581b<K, V> m17607c(K k, Y94<V> y94) {
            super.m91114a(k, y94);
            return this;
        }

        public C27581b(int i) {
            super(i);
        }
    }

    /* renamed from: b */
    public static <K, V> C27581b<K, V> m17610b(int i) {
        return new C27581b<>(i);
    }

    @Override // p000.Y94
    /* renamed from: c */
    public Map<K, V> get() {
        LinkedHashMap m92578b = OH0.m92578b(m91115a().size());
        for (Map.Entry<K, Y94<V>> entry : m91115a().entrySet()) {
            m92578b.put(entry.getKey(), entry.getValue().get());
        }
        return Collections.unmodifiableMap(m92578b);
    }

    public C47394qK2(Map<K, Y94<V>> map) {
        super(map);
    }
}
