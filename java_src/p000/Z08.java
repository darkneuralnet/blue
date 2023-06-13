package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* renamed from: Z08 */
/* loaded from: classes5.dex */
public final class Z08<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: c */
    public static final Z08 f47742c;

    /* renamed from: b */
    public boolean f47743b;

    static {
        Z08 z08 = new Z08();
        f47742c = z08;
        z08.f47743b = false;
    }

    private Z08() {
        this.f47743b = true;
    }

    /* renamed from: f */
    public static <K, V> Z08<K, V> m73866f() {
        return f47742c;
    }

    /* renamed from: j */
    public static int m73863j(Object obj) {
        if (obj instanceof byte[]) {
            return C37975aT7.m71331b((byte[]) obj);
        }
        if (obj instanceof InterfaceC46887pT7) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m73864h();
        super.clear();
    }

    /* renamed from: d */
    public final boolean m73868d() {
        return this.f47743b;
    }

    /* renamed from: e */
    public final void m73867e(Z08<K, V> z08) {
        m73864h();
        if (z08.isEmpty()) {
            return;
        }
        putAll(z08);
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

    /* renamed from: g */
    public final Z08<K, V> m73865g() {
        return isEmpty() ? new Z08<>() : new Z08<>(this);
    }

    /* renamed from: h */
    public final void m73864h() {
        if (!this.f47743b) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            i += m73863j(entry.getValue()) ^ m73863j(entry.getKey());
        }
        return i;
    }

    /* renamed from: k */
    public final void m73862k() {
        this.f47743b = false;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        m73864h();
        C37975aT7.m71332a(k);
        C37975aT7.m71332a(v);
        return (V) super.put(k, v);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        m73864h();
        for (K k : map.keySet()) {
            C37975aT7.m71332a(k);
            C37975aT7.m71332a(map.get(k));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        m73864h();
        return (V) super.remove(obj);
    }

    public Z08(Map<K, V> map) {
        super(map);
        this.f47743b = true;
    }
}
