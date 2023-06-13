package p000;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* renamed from: Nb7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C34671Nb7 extends LinkedHashMap {

    /* renamed from: c */
    public static final C34671Nb7 f24842c;

    /* renamed from: b */
    public boolean f24843b;

    static {
        C34671Nb7 c34671Nb7 = new C34671Nb7();
        f24842c = c34671Nb7;
        c34671Nb7.f24843b = false;
    }

    private C34671Nb7() {
        this.f24843b = true;
    }

    /* renamed from: d */
    public static C34671Nb7 m93721d() {
        return f24842c;
    }

    /* renamed from: j */
    public static int m93716j(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            Charset charset = C46960pb7.f103839a;
            int length = bArr.length;
            int m19080b = C46960pb7.m19080b(length, bArr, 0, length);
            if (m19080b == 0) {
                return 1;
            }
            return m19080b;
        } else if (!(obj instanceof InterfaceC42216hb7)) {
            return obj.hashCode();
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m93715k();
        super.clear();
    }

    /* renamed from: e */
    public final C34671Nb7 m93720e() {
        return isEmpty() ? new C34671Nb7() : new C34671Nb7(this);
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
    public final void m93719f() {
        this.f24843b = false;
    }

    /* renamed from: g */
    public final void m93718g(C34671Nb7 c34671Nb7) {
        m93715k();
        if (!c34671Nb7.isEmpty()) {
            putAll(c34671Nb7);
        }
    }

    /* renamed from: h */
    public final boolean m93717h() {
        return this.f24843b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Iterator it = entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            i += m93716j(entry.getValue()) ^ m93716j(entry.getKey());
        }
        return i;
    }

    /* renamed from: k */
    public final void m93715k() {
        if (!this.f24843b) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        m93715k();
        Charset charset = C46960pb7.f103839a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m93715k();
        for (Object obj : map.keySet()) {
            Charset charset = C46960pb7.f103839a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m93715k();
        return super.remove(obj);
    }

    public C34671Nb7(Map map) {
        super(map);
        this.f24843b = true;
    }
}
