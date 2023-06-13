package p000;

import java.util.HashMap;
import java.util.Map;
/* renamed from: Hi6  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C33329Hi6 {

    /* renamed from: a */
    public static final C2675G9 f13782a;

    /* renamed from: b */
    public static final C2675G9 f13783b;

    /* renamed from: c */
    public static final C2675G9 f13784c;

    /* renamed from: d */
    public static final C2675G9 f13785d;

    /* renamed from: e */
    public static final C2675G9 f13786e;

    /* renamed from: f */
    public static final C2675G9 f13787f;

    /* renamed from: g */
    public static final C2675G9 f13788g;

    /* renamed from: h */
    public static final C2675G9 f13789h;

    /* renamed from: i */
    public static final Map f13790i;

    static {
        C5448N c5448n = BD3.f2068X;
        f13782a = new C2675G9(c5448n);
        C5448N c5448n2 = BD3.f2069Y;
        f13783b = new C2675G9(c5448n2);
        f13784c = new C2675G9(InterfaceC42183hY2.f85418j);
        f13785d = new C2675G9(InterfaceC42183hY2.f85414h);
        f13786e = new C2675G9(InterfaceC42183hY2.f85404c);
        f13787f = new C2675G9(InterfaceC42183hY2.f85408e);
        f13788g = new C2675G9(InterfaceC42183hY2.f85424m);
        f13789h = new C2675G9(InterfaceC42183hY2.f85426n);
        HashMap hashMap = new HashMap();
        f13790i = hashMap;
        hashMap.put(c5448n, Q52.m88940a(5));
        hashMap.put(c5448n2, Q52.m88940a(6));
    }

    /* renamed from: a */
    public static C2675G9 m103513a(String str) {
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
    public static P31 m103512b(C5448N c5448n) {
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

    /* renamed from: c */
    public static String m103511c(C5448N c5448n) {
        if (c5448n.m86135u(InterfaceC31877Bd3.f2611i)) {
            return "SHA-1";
        }
        if (c5448n.m86135u(InterfaceC42183hY2.f85410f)) {
            return "SHA-224";
        }
        if (c5448n.m86135u(InterfaceC42183hY2.f85404c)) {
            return "SHA-256";
        }
        if (c5448n.m86135u(InterfaceC42183hY2.f85406d)) {
            return "SHA-384";
        }
        if (c5448n.m86135u(InterfaceC42183hY2.f85408e)) {
            return "SHA-512";
        }
        throw new IllegalArgumentException("unrecognised digest algorithm: " + c5448n);
    }

    /* renamed from: d */
    public static C2675G9 m103510d(int i) {
        if (i != 5) {
            if (i == 6) {
                return f13783b;
            }
            throw new IllegalArgumentException("unknown security category: " + i);
        }
        return f13782a;
    }

    /* renamed from: e */
    public static int m103509e(C2675G9 c2675g9) {
        return ((Integer) f13790i.get(c2675g9.m105700j())).intValue();
    }

    /* renamed from: f */
    public static C2675G9 m103508f(String str) {
        if (str.equals("SHA3-256")) {
            return f13784c;
        }
        if (str.equals("SHA-512/256")) {
            return f13785d;
        }
        throw new IllegalArgumentException("unknown tree digest: " + str);
    }

    /* renamed from: g */
    public static String m103507g(C48786sg5 c48786sg5) {
        C2675G9 m13848o = c48786sg5.m13848o();
        if (m13848o.m105700j().m86135u(f13784c.m105700j())) {
            return "SHA3-256";
        }
        if (m13848o.m105700j().m86135u(f13785d.m105700j())) {
            return "SHA-512/256";
        }
        throw new IllegalArgumentException("unknown tree digest: " + m13848o.m105700j());
    }

    /* renamed from: h */
    public static C2675G9 m103506h(String str) {
        if (str.equals("SHA-256")) {
            return f13786e;
        }
        if (str.equals("SHA-512")) {
            return f13787f;
        }
        if (str.equals("SHAKE128")) {
            return f13788g;
        }
        if (str.equals("SHAKE256")) {
            return f13789h;
        }
        throw new IllegalArgumentException("unknown tree digest: " + str);
    }
}
