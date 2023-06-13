package p000;
/* renamed from: Xg2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37051Xg2 extends C1744E9 {

    /* renamed from: A */
    public static final C37051Xg2 f43550A;
    @Deprecated

    /* renamed from: e */
    public static final C37051Xg2 f43551e = new C37051Xg2("RSA1_5", EnumC47980rJ4.REQUIRED);
    @Deprecated

    /* renamed from: f */
    public static final C37051Xg2 f43552f;

    /* renamed from: g */
    public static final C37051Xg2 f43553g;

    /* renamed from: h */
    public static final C37051Xg2 f43554h;

    /* renamed from: i */
    public static final C37051Xg2 f43555i;

    /* renamed from: j */
    public static final C37051Xg2 f43556j;

    /* renamed from: k */
    public static final C37051Xg2 f43557k;

    /* renamed from: l */
    public static final C37051Xg2 f43558l;

    /* renamed from: m */
    public static final C37051Xg2 f43559m;

    /* renamed from: n */
    public static final C37051Xg2 f43560n;

    /* renamed from: o */
    public static final C37051Xg2 f43561o;

    /* renamed from: p */
    public static final C37051Xg2 f43562p;

    /* renamed from: q */
    public static final C37051Xg2 f43563q;

    /* renamed from: r */
    public static final C37051Xg2 f43564r;

    /* renamed from: s */
    public static final C37051Xg2 f43565s;
    private static final long serialVersionUID = 1;

    /* renamed from: t */
    public static final C37051Xg2 f43566t;

    /* renamed from: u */
    public static final C37051Xg2 f43567u;

    /* renamed from: v */
    public static final C37051Xg2 f43568v;

    /* renamed from: w */
    public static final C37051Xg2 f43569w;

    /* renamed from: x */
    public static final C37051Xg2 f43570x;

    /* renamed from: y */
    public static final C37051Xg2 f43571y;

    /* renamed from: z */
    public static final C37051Xg2 f43572z;

    static {
        EnumC47980rJ4 enumC47980rJ4 = EnumC47980rJ4.OPTIONAL;
        f43552f = new C37051Xg2("RSA-OAEP", enumC47980rJ4);
        f43553g = new C37051Xg2("RSA-OAEP-256", enumC47980rJ4);
        f43554h = new C37051Xg2("RSA-OAEP-384", enumC47980rJ4);
        f43555i = new C37051Xg2("RSA-OAEP-512", enumC47980rJ4);
        EnumC47980rJ4 enumC47980rJ42 = EnumC47980rJ4.RECOMMENDED;
        f43556j = new C37051Xg2("A128KW", enumC47980rJ42);
        f43557k = new C37051Xg2("A192KW", enumC47980rJ4);
        f43558l = new C37051Xg2("A256KW", enumC47980rJ42);
        f43559m = new C37051Xg2("dir", enumC47980rJ42);
        f43560n = new C37051Xg2("ECDH-ES", enumC47980rJ42);
        f43561o = new C37051Xg2("ECDH-ES+A128KW", enumC47980rJ42);
        f43562p = new C37051Xg2("ECDH-ES+A192KW", enumC47980rJ4);
        f43563q = new C37051Xg2("ECDH-ES+A256KW", enumC47980rJ42);
        f43564r = new C37051Xg2("ECDH-1PU", enumC47980rJ4);
        f43565s = new C37051Xg2("ECDH-1PU+A128KW", enumC47980rJ4);
        f43566t = new C37051Xg2("ECDH-1PU+A192KW", enumC47980rJ4);
        f43567u = new C37051Xg2("ECDH-1PU+A256KW", enumC47980rJ4);
        f43568v = new C37051Xg2("A128GCMKW", enumC47980rJ4);
        f43569w = new C37051Xg2("A192GCMKW", enumC47980rJ4);
        f43570x = new C37051Xg2("A256GCMKW", enumC47980rJ4);
        f43571y = new C37051Xg2("PBES2-HS256+A128KW", enumC47980rJ4);
        f43572z = new C37051Xg2("PBES2-HS384+A192KW", enumC47980rJ4);
        f43550A = new C37051Xg2("PBES2-HS512+A256KW", enumC47980rJ4);
    }

    public C37051Xg2(String str, EnumC47980rJ4 enumC47980rJ4) {
        super(str, enumC47980rJ4);
    }

    /* renamed from: b */
    public static C37051Xg2 m76703b(String str) {
        C37051Xg2 c37051Xg2 = f43551e;
        if (str.equals(c37051Xg2.getName())) {
            return c37051Xg2;
        }
        C37051Xg2 c37051Xg22 = f43552f;
        if (str.equals(c37051Xg22.getName())) {
            return c37051Xg22;
        }
        C37051Xg2 c37051Xg23 = f43553g;
        if (str.equals(c37051Xg23.getName())) {
            return c37051Xg23;
        }
        C37051Xg2 c37051Xg24 = f43554h;
        if (str.equals(c37051Xg24.getName())) {
            return c37051Xg24;
        }
        C37051Xg2 c37051Xg25 = f43555i;
        if (str.equals(c37051Xg25.getName())) {
            return c37051Xg25;
        }
        C37051Xg2 c37051Xg26 = f43556j;
        if (str.equals(c37051Xg26.getName())) {
            return c37051Xg26;
        }
        C37051Xg2 c37051Xg27 = f43557k;
        if (str.equals(c37051Xg27.getName())) {
            return c37051Xg27;
        }
        C37051Xg2 c37051Xg28 = f43558l;
        if (str.equals(c37051Xg28.getName())) {
            return c37051Xg28;
        }
        C37051Xg2 c37051Xg29 = f43559m;
        if (str.equals(c37051Xg29.getName())) {
            return c37051Xg29;
        }
        C37051Xg2 c37051Xg210 = f43560n;
        if (str.equals(c37051Xg210.getName())) {
            return c37051Xg210;
        }
        C37051Xg2 c37051Xg211 = f43561o;
        if (str.equals(c37051Xg211.getName())) {
            return c37051Xg211;
        }
        C37051Xg2 c37051Xg212 = f43562p;
        if (str.equals(c37051Xg212.getName())) {
            return c37051Xg212;
        }
        C37051Xg2 c37051Xg213 = f43563q;
        if (str.equals(c37051Xg213.getName())) {
            return c37051Xg213;
        }
        C37051Xg2 c37051Xg214 = f43564r;
        if (str.equals(c37051Xg214.getName())) {
            return c37051Xg214;
        }
        C37051Xg2 c37051Xg215 = f43565s;
        if (str.equals(c37051Xg215.getName())) {
            return c37051Xg215;
        }
        C37051Xg2 c37051Xg216 = f43566t;
        if (str.equals(c37051Xg216.getName())) {
            return c37051Xg216;
        }
        C37051Xg2 c37051Xg217 = f43567u;
        if (str.equals(c37051Xg217.getName())) {
            return c37051Xg217;
        }
        C37051Xg2 c37051Xg218 = f43568v;
        if (str.equals(c37051Xg218.getName())) {
            return c37051Xg218;
        }
        C37051Xg2 c37051Xg219 = f43569w;
        if (str.equals(c37051Xg219.getName())) {
            return c37051Xg219;
        }
        C37051Xg2 c37051Xg220 = f43570x;
        if (str.equals(c37051Xg220.getName())) {
            return c37051Xg220;
        }
        C37051Xg2 c37051Xg221 = f43571y;
        if (str.equals(c37051Xg221.getName())) {
            return c37051Xg221;
        }
        C37051Xg2 c37051Xg222 = f43572z;
        if (str.equals(c37051Xg222.getName())) {
            return c37051Xg222;
        }
        C37051Xg2 c37051Xg223 = f43550A;
        if (str.equals(c37051Xg223.getName())) {
            return c37051Xg223;
        }
        return new C37051Xg2(str);
    }

    public C37051Xg2(String str) {
        super(str, null);
    }
}
