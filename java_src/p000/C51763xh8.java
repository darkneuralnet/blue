package p000;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* renamed from: xh8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C51763xh8 extends LinkedHashMap {

    /* renamed from: c */
    public static final C51763xh8 f117982c;

    /* renamed from: b */
    public boolean f117983b;

    static {
        C51763xh8 c51763xh8 = new C51763xh8();
        f117982c = c51763xh8;
        c51763xh8.f117983b = false;
    }

    private C51763xh8() {
        this.f117983b = true;
    }

    /* renamed from: d */
    public static C51763xh8 m4874d() {
        return f117982c;
    }

    /* renamed from: j */
    public static int m4869j(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            Charset charset = C32791Fa8.f9736a;
            int length = bArr.length;
            int m106927b = C32791Fa8.m106927b(length, bArr, 0, length);
            if (m106927b == 0) {
                return 1;
            }
            return m106927b;
        } else if (!(obj instanceof A88)) {
            return obj.hashCode();
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m4868k();
        super.clear();
    }

    /* renamed from: e */
    public final C51763xh8 m4873e() {
        return isEmpty() ? new C51763xh8() : new C51763xh8(this);
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
    public final void m4872f() {
        this.f117983b = false;
    }

    /* renamed from: g */
    public final void m4871g(C51763xh8 c51763xh8) {
        m4868k();
        if (!c51763xh8.isEmpty()) {
            putAll(c51763xh8);
        }
    }

    /* renamed from: h */
    public final boolean m4870h() {
        return this.f117983b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Iterator it = entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            i += m4869j(entry.getValue()) ^ m4869j(entry.getKey());
        }
        return i;
    }

    /* renamed from: k */
    public final void m4868k() {
        if (!this.f117983b) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        m4868k();
        Charset charset = C32791Fa8.f9736a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m4868k();
        for (Object obj : map.keySet()) {
            Charset charset = C32791Fa8.f9736a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m4868k();
        return super.remove(obj);
    }

    public C51763xh8(Map map) {
        super(map);
        this.f117983b = true;
    }
}
