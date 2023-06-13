package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C18238v;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* renamed from: com.google.crypto.tink.shaded.protobuf.C */
/* loaded from: classes6.dex */
public final class C18144C<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: c */
    public static final C18144C f74015c;

    /* renamed from: b */
    public boolean f74016b;

    static {
        C18144C c18144c = new C18144C();
        f74015c = c18144c;
        c18144c.m48200m();
    }

    private C18144C() {
        this.f74016b = true;
    }

    /* renamed from: d */
    public static <K, V> int m48208d(Map<K, V> map) {
        int i = 0;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            i += m48207e(entry.getValue()) ^ m48207e(entry.getKey());
        }
        return i;
    }

    /* renamed from: e */
    public static int m48207e(Object obj) {
        if (obj instanceof byte[]) {
            return C18238v.m47420d((byte[]) obj);
        }
        if (!(obj instanceof C18238v.InterfaceC18241c)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: f */
    public static void m48206f(Map<?, ?> map) {
        for (Object obj : map.keySet()) {
            C18238v.m47423a(obj);
            C18238v.m47423a(map.get(obj));
        }
    }

    /* renamed from: g */
    public static <K, V> C18144C<K, V> m48205g() {
        return f74015c;
    }

    /* renamed from: j */
    public static boolean m48203j(Object obj, Object obj2) {
        if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
            return Arrays.equals((byte[]) obj, (byte[]) obj2);
        }
        return obj.equals(obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <K, V> boolean m48202k(Map<K, V> map, Map<K, V> map2) {
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !m48203j(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
            while (r4.hasNext()) {
            }
        }
        return true;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        m48204h();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && m48202k(this, (Map) obj);
    }

    /* renamed from: h */
    public final void m48204h() {
        if (m48201l()) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return m48208d(this);
    }

    /* renamed from: l */
    public boolean m48201l() {
        return this.f74016b;
    }

    /* renamed from: m */
    public void m48200m() {
        this.f74016b = false;
    }

    /* renamed from: n */
    public void m48199n(C18144C<K, V> c18144c) {
        m48204h();
        if (!c18144c.isEmpty()) {
            putAll(c18144c);
        }
    }

    /* renamed from: o */
    public C18144C<K, V> m48198o() {
        return isEmpty() ? new C18144C<>() : new C18144C<>(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        m48204h();
        C18238v.m47423a(k);
        C18238v.m47423a(v);
        return (V) super.put(k, v);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        m48204h();
        m48206f(map);
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        m48204h();
        return (V) super.remove(obj);
    }

    public C18144C(Map<K, V> map) {
        super(map);
        this.f74016b = true;
    }
}
