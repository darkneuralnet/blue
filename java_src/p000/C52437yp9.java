package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* renamed from: yp9  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C52437yp9<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: c */
    public static final C52437yp9 f120231c;

    /* renamed from: b */
    public boolean f120232b;

    static {
        C52437yp9 c52437yp9 = new C52437yp9();
        f120231c = c52437yp9;
        c52437yp9.f120232b = false;
    }

    private C52437yp9() {
        this.f120232b = true;
    }

    /* renamed from: d */
    public static <K, V> C52437yp9<K, V> m2510d() {
        return f120231c;
    }

    /* renamed from: j */
    public static int m2505j(Object obj) {
        if (obj instanceof byte[]) {
            return Fn9.m106453b((byte[]) obj);
        }
        if (!(obj instanceof Qm9)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m2504k();
        super.clear();
    }

    /* renamed from: e */
    public final C52437yp9<K, V> m2509e() {
        return isEmpty() ? new C52437yp9<>() : new C52437yp9<>(this);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
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
                                return false;
                            }
                        } else {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final void m2508f() {
        this.f120232b = false;
    }

    /* renamed from: g */
    public final void m2507g(C52437yp9<K, V> c52437yp9) {
        m2504k();
        if (!c52437yp9.isEmpty()) {
            putAll(c52437yp9);
        }
    }

    /* renamed from: h */
    public final boolean m2506h() {
        return this.f120232b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            i += m2505j(entry.getValue()) ^ m2505j(entry.getKey());
        }
        return i;
    }

    /* renamed from: k */
    public final void m2504k() {
        if (this.f120232b) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        m2504k();
        Fn9.m106450e(k);
        Fn9.m106450e(v);
        return (V) super.put(k, v);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        m2504k();
        for (K k : map.keySet()) {
            Fn9.m106450e(k);
            Fn9.m106450e(map.get(k));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        m2504k();
        return (V) super.remove(obj);
    }

    public C52437yp9(Map<K, V> map) {
        super(map);
        this.f120232b = true;
    }
}
