package p000;
/* renamed from: Ii6  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C33563Ii6 {
    /* renamed from: a */
    public static C2675G9 m101755a(String str) {
        if (str.equals("SHA-1")) {
            return new C2675G9(InterfaceC31877Bd3.f2611i, TF0.f35039b);
        }
        if (str.equals("SHA-224")) {
            return new C2675G9(InterfaceC42183hY2.f85410f);
        }
        if (str.equals("SHA-256")) {
            return new C2675G9(InterfaceC42183hY2.f85404c);
        }
        if (str.equals("SHA-384")) {
            return new C2675G9(InterfaceC42183hY2.f85406d);
        }
        if (str.equals("SHA-512")) {
            return new C2675G9(InterfaceC42183hY2.f85408e);
        }
        throw new IllegalArgumentException("unrecognised digest algorithm: " + str);
    }

    /* renamed from: b */
    public static P31 m101754b(C2675G9 c2675g9) {
        if (c2675g9.m105700j().m86135u(InterfaceC31877Bd3.f2611i)) {
            return Q31.m89018b();
        }
        if (c2675g9.m105700j().m86135u(InterfaceC42183hY2.f85410f)) {
            return Q31.m89017c();
        }
        if (c2675g9.m105700j().m86135u(InterfaceC42183hY2.f85404c)) {
            return Q31.m89016d();
        }
        if (c2675g9.m105700j().m86135u(InterfaceC42183hY2.f85406d)) {
            return Q31.m89015e();
        }
        if (c2675g9.m105700j().m86135u(InterfaceC42183hY2.f85408e)) {
            return Q31.m89010j();
        }
        throw new IllegalArgumentException("unrecognised OID in digest algorithm identifier: " + c2675g9.m105700j());
    }
}
