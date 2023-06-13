package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* renamed from: fi8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C41101fi8<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: c */
    public static final C41101fi8 f80489c;

    /* renamed from: b */
    public boolean f80490b;

    static {
        C41101fi8 c41101fi8 = new C41101fi8();
        f80489c = c41101fi8;
        c41101fi8.f80490b = false;
    }

    private C41101fi8() {
        this.f80490b = true;
    }

    /* renamed from: d */
    public static <K, V> C41101fi8<K, V> m41006d() {
        return f80489c;
    }

    /* renamed from: j */
    public static int m41001j(Object obj) {
        if (obj instanceof byte[]) {
            return C41051fd8.m41093b((byte[]) obj);
        }
        return obj.hashCode();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m41000k();
        super.clear();
    }

    /* renamed from: e */
    public final C41101fi8<K, V> m41005e() {
        return isEmpty() ? new C41101fi8<>() : new C41101fi8<>(this);
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
    public final void m41004f() {
        this.f80490b = false;
    }

    /* renamed from: g */
    public final void m41003g(C41101fi8<K, V> c41101fi8) {
        m41000k();
        if (!c41101fi8.isEmpty()) {
            putAll(c41101fi8);
        }
    }

    /* renamed from: h */
    public final boolean m41002h() {
        return this.f80490b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            i += m41001j(entry.getValue()) ^ m41001j(entry.getKey());
        }
        return i;
    }

    /* renamed from: k */
    public final void m41000k() {
        if (this.f80490b) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        m41000k();
        C41051fd8.m41090e(k);
        C41051fd8.m41090e(v);
        return (V) super.put(k, v);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        m41000k();
        for (K k : map.keySet()) {
            C41051fd8.m41090e(k);
            C41051fd8.m41090e(map.get(k));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        m41000k();
        return (V) super.remove(obj);
    }

    public C41101fi8(Map<K, V> map) {
        super(map);
        this.f80490b = true;
    }
}
