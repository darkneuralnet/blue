package p000;
/* renamed from: hh2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C42271hh2 extends C1744E9 {

    /* renamed from: e */
    public static final C42271hh2 f85663e = new C42271hh2("HS256", EnumC47980rJ4.REQUIRED);

    /* renamed from: f */
    public static final C42271hh2 f85664f;

    /* renamed from: g */
    public static final C42271hh2 f85665g;

    /* renamed from: h */
    public static final C42271hh2 f85666h;

    /* renamed from: i */
    public static final C42271hh2 f85667i;

    /* renamed from: j */
    public static final C42271hh2 f85668j;

    /* renamed from: k */
    public static final C42271hh2 f85669k;

    /* renamed from: l */
    public static final C42271hh2 f85670l;

    /* renamed from: m */
    public static final C42271hh2 f85671m;

    /* renamed from: n */
    public static final C42271hh2 f85672n;

    /* renamed from: o */
    public static final C42271hh2 f85673o;

    /* renamed from: p */
    public static final C42271hh2 f85674p;

    /* renamed from: q */
    public static final C42271hh2 f85675q;

    /* renamed from: r */
    public static final C42271hh2 f85676r;
    private static final long serialVersionUID = 1;

    static {
        EnumC47980rJ4 enumC47980rJ4 = EnumC47980rJ4.OPTIONAL;
        f85664f = new C42271hh2("HS384", enumC47980rJ4);
        f85665g = new C42271hh2("HS512", enumC47980rJ4);
        EnumC47980rJ4 enumC47980rJ42 = EnumC47980rJ4.RECOMMENDED;
        f85666h = new C42271hh2("RS256", enumC47980rJ42);
        f85667i = new C42271hh2("RS384", enumC47980rJ4);
        f85668j = new C42271hh2("RS512", enumC47980rJ4);
        f85669k = new C42271hh2("ES256", enumC47980rJ42);
        f85670l = new C42271hh2("ES256K", enumC47980rJ4);
        f85671m = new C42271hh2("ES384", enumC47980rJ4);
        f85672n = new C42271hh2("ES512", enumC47980rJ4);
        f85673o = new C42271hh2("PS256", enumC47980rJ4);
        f85674p = new C42271hh2("PS384", enumC47980rJ4);
        f85675q = new C42271hh2("PS512", enumC47980rJ4);
        f85676r = new C42271hh2("EdDSA", enumC47980rJ4);
    }

    public C42271hh2(String str, EnumC47980rJ4 enumC47980rJ4) {
        super(str, enumC47980rJ4);
    }

    /* renamed from: b */
    public static C42271hh2 m36096b(String str) {
        C42271hh2 c42271hh2 = f85663e;
        if (str.equals(c42271hh2.getName())) {
            return c42271hh2;
        }
        C42271hh2 c42271hh22 = f85664f;
        if (str.equals(c42271hh22.getName())) {
            return c42271hh22;
        }
        C42271hh2 c42271hh23 = f85665g;
        if (str.equals(c42271hh23.getName())) {
            return c42271hh23;
        }
        C42271hh2 c42271hh24 = f85666h;
        if (str.equals(c42271hh24.getName())) {
            return c42271hh24;
        }
        C42271hh2 c42271hh25 = f85667i;
        if (str.equals(c42271hh25.getName())) {
            return c42271hh25;
        }
        C42271hh2 c42271hh26 = f85668j;
        if (str.equals(c42271hh26.getName())) {
            return c42271hh26;
        }
        C42271hh2 c42271hh27 = f85669k;
        if (str.equals(c42271hh27.getName())) {
            return c42271hh27;
        }
        C42271hh2 c42271hh28 = f85670l;
        if (str.equals(c42271hh28.getName())) {
            return c42271hh28;
        }
        C42271hh2 c42271hh29 = f85671m;
        if (str.equals(c42271hh29.getName())) {
            return c42271hh29;
        }
        C42271hh2 c42271hh210 = f85672n;
        if (str.equals(c42271hh210.getName())) {
            return c42271hh210;
        }
        C42271hh2 c42271hh211 = f85673o;
        if (str.equals(c42271hh211.getName())) {
            return c42271hh211;
        }
        C42271hh2 c42271hh212 = f85674p;
        if (str.equals(c42271hh212.getName())) {
            return c42271hh212;
        }
        C42271hh2 c42271hh213 = f85675q;
        if (str.equals(c42271hh213.getName())) {
            return c42271hh213;
        }
        C42271hh2 c42271hh214 = f85676r;
        if (str.equals(c42271hh214.getName())) {
            return c42271hh214;
        }
        return new C42271hh2(str);
    }

    public C42271hh2(String str) {
        super(str, null);
    }
}
