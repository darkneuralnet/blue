package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* renamed from: YO8 */
/* loaded from: classes6.dex */
public final class YO8<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: c */
    public static final YO8 f45832c;

    /* renamed from: b */
    public boolean f45833b;

    static {
        YO8 yo8 = new YO8();
        f45832c = yo8;
        yo8.f45833b = false;
    }

    private YO8() {
        this.f45833b = true;
    }

    /* renamed from: d */
    public static int m75120d(Object obj) {
        if (obj instanceof byte[]) {
            return C52124yI8.m3685j((byte[]) obj);
        }
        if (!(obj instanceof InterfaceC45010mI8)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public static <K, V> YO8<K, V> m75119e() {
        return f45832c;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m75114k();
        super.clear();
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
    public final void m75118f(YO8<K, V> yo8) {
        m75114k();
        if (!yo8.isEmpty()) {
            putAll(yo8);
        }
    }

    /* renamed from: g */
    public final YO8<K, V> m75117g() {
        return isEmpty() ? new YO8<>() : new YO8<>(this);
    }

    /* renamed from: h */
    public final void m75116h() {
        this.f45833b = false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            i += m75120d(entry.getValue()) ^ m75120d(entry.getKey());
        }
        return i;
    }

    /* renamed from: j */
    public final boolean m75115j() {
        return this.f45833b;
    }

    /* renamed from: k */
    public final void m75114k() {
        if (this.f45833b) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        m75114k();
        C52124yI8.m3691d(k);
        C52124yI8.m3691d(v);
        return (V) super.put(k, v);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        m75114k();
        for (K k : map.keySet()) {
            C52124yI8.m3691d(k);
            C52124yI8.m3691d(map.get(k));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        m75114k();
        return (V) super.remove(obj);
    }

    public YO8(Map<K, V> map) {
        super(map);
        this.f45833b = true;
    }
}
