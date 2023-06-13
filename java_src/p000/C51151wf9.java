package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* renamed from: wf9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C51151wf9 extends LinkedHashMap {

    /* renamed from: c */
    public static final C51151wf9 f116328c;

    /* renamed from: b */
    public boolean f116329b;

    static {
        C51151wf9 c51151wf9 = new C51151wf9();
        f116328c = c51151wf9;
        c51151wf9.f116329b = false;
    }

    private C51151wf9() {
        this.f116329b = true;
    }

    /* renamed from: d */
    public static C51151wf9 m6534d() {
        return f116328c;
    }

    /* renamed from: j */
    public static int m6529j(Object obj) {
        if (obj instanceof byte[]) {
            return C44007kc9.m28738b((byte[]) obj);
        }
        if (!(obj instanceof Ib9)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m6528k();
        super.clear();
    }

    /* renamed from: e */
    public final C51151wf9 m6533e() {
        return isEmpty() ? new C51151wf9() : new C51151wf9(this);
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
    public final void m6532f() {
        this.f116329b = false;
    }

    /* renamed from: g */
    public final void m6531g(C51151wf9 c51151wf9) {
        m6528k();
        if (!c51151wf9.isEmpty()) {
            putAll(c51151wf9);
        }
    }

    /* renamed from: h */
    public final boolean m6530h() {
        return this.f116329b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Iterator it = entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            i += m6529j(entry.getValue()) ^ m6529j(entry.getKey());
        }
        return i;
    }

    /* renamed from: k */
    public final void m6528k() {
        if (!this.f116329b) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        m6528k();
        C44007kc9.m28735e(obj);
        C44007kc9.m28735e(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m6528k();
        for (Object obj : map.keySet()) {
            C44007kc9.m28735e(obj);
            C44007kc9.m28735e(map.get(obj));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m6528k();
        return super.remove(obj);
    }

    public C51151wf9(Map map) {
        super(map);
        this.f116329b = true;
    }
}
