package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* renamed from: Zu7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C37650Zu7 extends LinkedHashMap {

    /* renamed from: c */
    public static final C37650Zu7 f49466c;

    /* renamed from: b */
    public boolean f49467b;

    static {
        C37650Zu7 c37650Zu7 = new C37650Zu7();
        f49466c = c37650Zu7;
        c37650Zu7.f49467b = false;
    }

    private C37650Zu7() {
        this.f49467b = true;
    }

    /* renamed from: d */
    public static C37650Zu7 m72314d() {
        return f49466c;
    }

    /* renamed from: j */
    public static int m72309j(Object obj) {
        if (obj instanceof byte[]) {
            return C46557ou7.m20296b((byte[]) obj);
        }
        if (!(obj instanceof InterfaceC41813gu7)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m72308k();
        super.clear();
    }

    /* renamed from: e */
    public final C37650Zu7 m72313e() {
        return isEmpty() ? new C37650Zu7() : new C37650Zu7(this);
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
    public final void m72312f() {
        this.f49467b = false;
    }

    /* renamed from: g */
    public final void m72311g(C37650Zu7 c37650Zu7) {
        m72308k();
        if (!c37650Zu7.isEmpty()) {
            putAll(c37650Zu7);
        }
    }

    /* renamed from: h */
    public final boolean m72310h() {
        return this.f49467b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Iterator it = entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            i += m72309j(entry.getValue()) ^ m72309j(entry.getKey());
        }
        return i;
    }

    /* renamed from: k */
    public final void m72308k() {
        if (!this.f49467b) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        m72308k();
        C46557ou7.m20293e(obj);
        C46557ou7.m20293e(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m72308k();
        for (Object obj : map.keySet()) {
            C46557ou7.m20293e(obj);
            C46557ou7.m20293e(map.get(obj));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m72308k();
        return super.remove(obj);
    }

    public C37650Zu7(Map map) {
        super(map);
        this.f49467b = true;
    }
}
