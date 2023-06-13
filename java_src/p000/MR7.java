package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* renamed from: MR7 */
/* loaded from: classes5.dex */
public final class MR7<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: c */
    public static final MR7 f23126c;

    /* renamed from: b */
    public boolean f23127b;

    static {
        MR7 mr7 = new MR7();
        f23126c = mr7;
        mr7.f23127b = false;
    }

    private MR7() {
        this.f23127b = true;
    }

    /* renamed from: g */
    public static <K, V> MR7<K, V> m95297g() {
        return f23126c;
    }

    /* renamed from: k */
    public static int m95294k(Object obj) {
        if (obj instanceof byte[]) {
            return C44389lF7.m27618b((byte[]) obj);
        }
        if (!(obj instanceof JH7)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m95295j();
        super.clear();
    }

    /* renamed from: d */
    public final boolean m95300d() {
        return this.f23127b;
    }

    /* renamed from: e */
    public final void m95299e() {
        this.f23127b = false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005c A[RETURN] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z;
        boolean equals;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this != map) {
                if (size() == map.size()) {
                    for (Map.Entry<K, V> entry : entrySet()) {
                        if (map.containsKey(entry.getKey())) {
                            V value = entry.getValue();
                            Object obj2 = map.get(entry.getKey());
                            if ((value instanceof byte[]) && (obj2 instanceof byte[])) {
                                equals = Arrays.equals((byte[]) value, (byte[]) obj2);
                                continue;
                            } else {
                                equals = value.equals(obj2);
                                continue;
                            }
                            if (!equals) {
                            }
                        }
                    }
                }
                z = false;
                if (!z) {
                    return true;
                }
            }
            z = true;
            if (!z) {
            }
        }
        return false;
    }

    /* renamed from: f */
    public final void m95298f(MR7<K, V> mr7) {
        m95295j();
        if (!mr7.isEmpty()) {
            putAll(mr7);
        }
    }

    /* renamed from: h */
    public final MR7<K, V> m95296h() {
        return isEmpty() ? new MR7<>() : new MR7<>(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            i += m95294k(entry.getValue()) ^ m95294k(entry.getKey());
        }
        return i;
    }

    /* renamed from: j */
    public final void m95295j() {
        if (this.f23127b) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        m95295j();
        C44389lF7.m27619a(k);
        C44389lF7.m27619a(v);
        return (V) super.put(k, v);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        m95295j();
        for (K k : map.keySet()) {
            C44389lF7.m27619a(k);
            C44389lF7.m27619a(map.get(k));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        m95295j();
        return (V) super.remove(obj);
    }

    public MR7(Map<K, V> map) {
        super(map);
        this.f23127b = true;
    }
}
