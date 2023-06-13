package p000;
/* renamed from: zY6 */
/* loaded from: classes5.dex */
public final class C52859zY6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C52859zY6 zbb;
    private boolean zbA;
    private C51673xY6 zbB;
    private int zbd;
    private boolean zbg;
    private C47882r87 zbh;
    private boolean zbi;
    private int zbj;
    private boolean zbk;
    private boolean zbl;
    private float zbm;
    private float zbn;
    private boolean zbo;
    private boolean zbp;
    private boolean zbs;
    private int zbt;
    private boolean zbu;
    private boolean zbw;
    private C87 zbx;
    private boolean zby;
    private int zbz;
    private String zbe = "";
    private String zbf = "";
    private boolean zbq = true;
    private boolean zbr = true;
    private float zbv = 0.75f;

    static {
        C52859zY6 c52859zY6 = new C52859zY6();
        zbb = c52859zY6;
        AbstractC41030fb7.m41135l(C52859zY6.class, c52859zY6);
    }

    private C52859zY6() {
    }

    /* renamed from: E */
    public static C49302tY6 m1124E() {
        return (C49302tY6) zbb.m41128u();
    }

    /* renamed from: G */
    public static /* synthetic */ void m1122G(C52859zY6 c52859zY6, String str) {
        c52859zY6.zbd |= 1;
        c52859zY6.zbe = str;
    }

    /* renamed from: H */
    public static /* synthetic */ void m1121H(C52859zY6 c52859zY6, String str) {
        c52859zY6.zbd |= 2;
        c52859zY6.zbf = str;
    }

    /* renamed from: I */
    public static /* synthetic */ void m1120I(C52859zY6 c52859zY6, boolean z) {
        c52859zY6.zbd |= 4;
        c52859zY6.zbg = true;
    }

    /* renamed from: J */
    public static /* synthetic */ void m1119J(C52859zY6 c52859zY6, C47882r87 c47882r87) {
        c47882r87.getClass();
        c52859zY6.zbh = c47882r87;
        c52859zY6.zbd |= 8;
    }

    /* renamed from: K */
    public static /* synthetic */ void m1118K(C52859zY6 c52859zY6, boolean z) {
        c52859zY6.zbd |= 16;
        c52859zY6.zbi = true;
    }

    @Override // p000.AbstractC41030fb7
    /* renamed from: p */
    public final Object mo1009p(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zbb;
                    }
                    return new C49302tY6(null);
                }
                return new C52859zY6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0018\u0000\u0001\u0001\u0019\u0018\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ခ\b\u0004ဇ\u0006\u0005ခ\t\u0006ဇ\u0007\bင\u0015\tင\u0005\nဇ\n\u000bဇ\u000b\fဇ\f\rဇ\r\u000eဇ\u000e\u000fင\u000f\u0010ဇ\u0010\u0011ခ\u0011\u0012ဇ\u0012\u0013ဉ\u0013\u0014ဇ\u0002\u0015ဉ\u0017\u0016ဇ\u0016\u0017ဉ\u0003\u0018ဇ\u0004\u0019ဇ\u0014", new Object[]{"zbd", "zbe", "zbf", "zbm", "zbk", "zbn", "zbl", "zbz", "zbj", "zbo", "zbp", "zbq", "zbr", "zbs", "zbt", "zbu", "zbv", "zbw", "zbx", "zbg", "zbB", "zbA", "zbh", "zbi", "zby"});
        }
        return (byte) 1;
    }
}
