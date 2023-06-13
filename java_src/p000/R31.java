package p000;

import java.util.HashMap;
import java.util.Map;
/* renamed from: R31 */
/* loaded from: classes8.dex */
public class R31 {

    /* renamed from: a */
    public static Map<String, C5448N> f31449a = new HashMap();

    /* renamed from: b */
    public static Map<C5448N, String> f31450b = new HashMap();

    static {
        Map<String, C5448N> map = f31449a;
        C5448N c5448n = InterfaceC42183hY2.f85404c;
        map.put("SHA-256", c5448n);
        Map<String, C5448N> map2 = f31449a;
        C5448N c5448n2 = InterfaceC42183hY2.f85408e;
        map2.put("SHA-512", c5448n2);
        Map<String, C5448N> map3 = f31449a;
        C5448N c5448n3 = InterfaceC42183hY2.f85424m;
        map3.put("SHAKE128", c5448n3);
        Map<String, C5448N> map4 = f31449a;
        C5448N c5448n4 = InterfaceC42183hY2.f85426n;
        map4.put("SHAKE256", c5448n4);
        f31450b.put(c5448n, "SHA-256");
        f31450b.put(c5448n2, "SHA-512");
        f31450b.put(c5448n3, "SHAKE128");
        f31450b.put(c5448n4, "SHAKE256");
    }

    /* renamed from: a */
    public static P31 m87374a(C5448N c5448n) {
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

    /* renamed from: b */
    public static String m87373b(C5448N c5448n) {
        String str = f31450b.get(c5448n);
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("unrecognized digest oid: " + c5448n);
    }

    /* renamed from: c */
    public static C5448N m87372c(String str) {
        C5448N c5448n = f31449a.get(str);
        if (c5448n != null) {
            return c5448n;
        }
        throw new IllegalArgumentException("unrecognized digest name: " + str);
    }
}
