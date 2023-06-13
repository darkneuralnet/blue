package com.google.protobuf;

import com.google.protobuf.C18544t;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* renamed from: com.google.protobuf.A */
/* loaded from: classes6.dex */
public final class C18457A<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: c */
    public static final C18457A<?, ?> f74681c;

    /* renamed from: b */
    public boolean f74682b;

    static {
        C18457A<?, ?> c18457a = new C18457A<>();
        f74681c = c18457a;
        c18457a.m46743m();
    }

    private C18457A() {
        this.f74682b = true;
    }

    /* renamed from: d */
    public static <K, V> int m46751d(Map<K, V> map) {
        int i = 0;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            i += m46750e(entry.getValue()) ^ m46750e(entry.getKey());
        }
        return i;
    }

    /* renamed from: e */
    public static int m46750e(Object obj) {
        if (obj instanceof byte[]) {
            return C18544t.m45997d((byte[]) obj);
        }
        if (!(obj instanceof C18544t.InterfaceC18547c)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: f */
    public static void m46749f(Map<?, ?> map) {
        for (Object obj : map.keySet()) {
            C18544t.m46000a(obj);
            C18544t.m46000a(map.get(obj));
        }
    }

    /* renamed from: g */
    public static <K, V> C18457A<K, V> m46748g() {
        return (C18457A<K, V>) f74681c;
    }

    /* renamed from: j */
    public static boolean m46746j(Object obj, Object obj2) {
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
    public static <K, V> boolean m46745k(Map<K, V> map, Map<K, V> map2) {
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !m46746j(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
            while (r4.hasNext()) {
            }
        }
        return true;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        m46747h();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && m46745k(this, (Map) obj);
    }

    /* renamed from: h */
    public final void m46747h() {
        if (m46744l()) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return m46751d(this);
    }

    /* renamed from: l */
    public boolean m46744l() {
        return this.f74682b;
    }

    /* renamed from: m */
    public void m46743m() {
        this.f74682b = false;
    }

    /* renamed from: n */
    public void m46742n(C18457A<K, V> c18457a) {
        m46747h();
        if (!c18457a.isEmpty()) {
            putAll(c18457a);
        }
    }

    /* renamed from: o */
    public C18457A<K, V> m46741o() {
        return isEmpty() ? new C18457A<>() : new C18457A<>(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        m46747h();
        C18544t.m46000a(k);
        C18544t.m46000a(v);
        return (V) super.put(k, v);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        m46747h();
        m46749f(map);
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        m46747h();
        return (V) super.remove(obj);
    }

    public C18457A(Map<K, V> map) {
        super(map);
        this.f74682b = true;
    }
}
