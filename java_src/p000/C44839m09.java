package p000;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* renamed from: m09  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C44839m09 extends LinkedHashMap {

    /* renamed from: c */
    public static final C44839m09 f97072c;

    /* renamed from: b */
    public boolean f97073b;

    static {
        C44839m09 c44839m09 = new C44839m09();
        f97072c = c44839m09;
        c44839m09.f97073b = false;
    }

    private C44839m09() {
        this.f97073b = true;
    }

    /* renamed from: d */
    public static C44839m09 m26549d() {
        return f97072c;
    }

    /* renamed from: j */
    public static int m26544j(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            Charset charset = XV8.f43341a;
            int length = bArr.length;
            int m76918b = XV8.m76918b(length, bArr, 0, length);
            if (m76918b == 0) {
                return 1;
            }
            return m76918b;
        }
        return obj.hashCode();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m26543k();
        super.clear();
    }

    /* renamed from: e */
    public final C44839m09 m26548e() {
        return isEmpty() ? new C44839m09() : new C44839m09(this);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        boolean equals;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this != map) {
                if (size() == map.size()) {
                    Iterator it = entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        if (map.containsKey(entry.getKey())) {
                            Object value = entry.getValue();
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
    public final void m26547f() {
        this.f97073b = false;
    }

    /* renamed from: g */
    public final void m26546g(C44839m09 c44839m09) {
        m26543k();
        if (!c44839m09.isEmpty()) {
            putAll(c44839m09);
        }
    }

    /* renamed from: h */
    public final boolean m26545h() {
        return this.f97073b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Iterator it = entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            i += m26544j(entry.getValue()) ^ m26544j(entry.getKey());
        }
        return i;
    }

    /* renamed from: k */
    public final void m26543k() {
        if (!this.f97073b) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        m26543k();
        Charset charset = XV8.f43341a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m26543k();
        for (Object obj : map.keySet()) {
            Charset charset = XV8.f43341a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m26543k();
        return super.remove(obj);
    }

    public C44839m09(Map map) {
        super(map);
        this.f97073b = true;
    }
}
