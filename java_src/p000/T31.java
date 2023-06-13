package p000;

import java.util.HashMap;
import java.util.Map;
/* renamed from: T31 */
/* loaded from: classes8.dex */
public class T31 {

    /* renamed from: a */
    public static Map<String, C5448N> f34700a = new HashMap();

    /* renamed from: b */
    public static Map<C5448N, String> f34701b = new HashMap();

    static {
        Map<String, C5448N> map = f34700a;
        C5448N c5448n = InterfaceC42183hY2.f85404c;
        map.put("SHA-256", c5448n);
        Map<String, C5448N> map2 = f34700a;
        C5448N c5448n2 = InterfaceC42183hY2.f85408e;
        map2.put("SHA-512", c5448n2);
        Map<String, C5448N> map3 = f34700a;
        C5448N c5448n3 = InterfaceC42183hY2.f85424m;
        map3.put("SHAKE128", c5448n3);
        Map<String, C5448N> map4 = f34700a;
        C5448N c5448n4 = InterfaceC42183hY2.f85426n;
        map4.put("SHAKE256", c5448n4);
        f34701b.put(c5448n, "SHA-256");
        f34701b.put(c5448n2, "SHA-512");
        f34701b.put(c5448n3, "SHAKE128");
        f34701b.put(c5448n4, "SHAKE256");
    }

    /* renamed from: a */
    public static P31 m84396a(C5448N c5448n) {
        if (c5448n.m86135u(InterfaceC42183hY2.f85404c)) {
            return new C45822ng5();
        }
        if (c5448n.m86135u(InterfaceC42183hY2.f85408e)) {
            return new C47601qg5();
        }
        if (c5448n.m86135u(InterfaceC42183hY2.f85424m)) {
            return new C48194rg5(128);
        }
        if (c5448n.m86135u(InterfaceC42183hY2.f85426n)) {
            return new C48194rg5(256);
        }
        throw new IllegalArgumentException("unrecognized digest OID: " + c5448n);
    }
}
