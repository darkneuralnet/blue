package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* renamed from: eA8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C40194eA8 {
    /* renamed from: a */
    public static InterfaceC37164Xs7 m43154a(C32485Ds8 c32485Ds8) {
        if (c32485Ds8 == null) {
            return InterfaceC37164Xs7.f44125h0;
        }
        int m109818K = c32485Ds8.m109818K() - 1;
        if (m109818K != 1) {
            if (m109818K != 2) {
                if (m109818K != 3) {
                    if (m109818K == 4) {
                        List<C32485Ds8> m109823F = c32485Ds8.m109823F();
                        ArrayList arrayList = new ArrayList();
                        for (C32485Ds8 c32485Ds82 : m109823F) {
                            arrayList.add(m43154a(c32485Ds82));
                        }
                        return new C34365Lt7(c32485Ds8.m109825D(), arrayList);
                    }
                    throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
                } else if (c32485Ds8.m109821H()) {
                    return new C48828sk7(Boolean.valueOf(c32485Ds8.m109822G()));
                } else {
                    return new C48828sk7(null);
                }
            } else if (c32485Ds8.m109820I()) {
                return new C44105km7(Double.valueOf(c32485Ds8.m109827B()));
            } else {
                return new C44105km7(null);
            }
        } else if (c32485Ds8.m109819J()) {
            return new C43019iw7(c32485Ds8.m109824E());
        } else {
            return InterfaceC37164Xs7.f44132o0;
        }
    }

    /* renamed from: b */
    public static InterfaceC37164Xs7 m43153b(Object obj) {
        if (obj == null) {
            return InterfaceC37164Xs7.f44126i0;
        }
        if (obj instanceof String) {
            return new C43019iw7((String) obj);
        }
        if (obj instanceof Double) {
            return new C44105km7((Double) obj);
        }
        if (obj instanceof Long) {
            return new C44105km7(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new C44105km7(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new C48828sk7((Boolean) obj);
        }
        if (obj instanceof Map) {
            C53038zq7 c53038zq7 = new C53038zq7();
            Map map = (Map) obj;
            for (Object obj2 : map.keySet()) {
                InterfaceC37164Xs7 m43153b = m43153b(map.get(obj2));
                if (obj2 != null) {
                    if (!(obj2 instanceof String)) {
                        obj2 = obj2.toString();
                    }
                    c53038zq7.mo383c((String) obj2, m43153b);
                }
            }
            return c53038zq7;
        } else if (obj instanceof List) {
            C50596vj7 c50596vj7 = new C50596vj7();
            for (Object obj3 : (List) obj) {
                c50596vj7.m8217z(c50596vj7.m8225f(), m43153b(obj3));
            }
            return c50596vj7;
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }
}
