package p000;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
/* renamed from: P0 */
/* loaded from: classes7.dex */
public abstract class AbstractC6216P0<K, V, V2> implements InterfaceC48812sj1<Map<K, V2>> {

    /* renamed from: a */
    public final Map<K, Y94<V>> f27724a;

    /* renamed from: P0$a */
    /* loaded from: classes7.dex */
    public static abstract class AbstractC6217a<K, V, V2> {

        /* renamed from: a */
        public final LinkedHashMap<K, Y94<V>> f27725a;

        public AbstractC6217a(int i) {
            this.f27725a = OH0.m92578b(i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public AbstractC6217a<K, V, V2> m91114a(K k, Y94<V> y94) {
            this.f27725a.put(C51679xZ3.m5004c(k, "key"), C51679xZ3.m5004c(y94, "provider"));
            return this;
        }
    }

    public AbstractC6216P0(Map<K, Y94<V>> map) {
        this.f27724a = Collections.unmodifiableMap(map);
    }

    /* renamed from: a */
    public final Map<K, Y94<V>> m91115a() {
        return this.f27724a;
    }
}
