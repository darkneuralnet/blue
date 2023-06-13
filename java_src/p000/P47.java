package p000;
/* renamed from: P47 */
/* loaded from: classes5.dex */
public final class P47 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final P47 zbb;
    private int zbd;
    private O47 zbg;
    private Z37 zbh;
    private Z37 zbi;
    private C46922pX6 zbj;
    private float zbm;
    private boolean zbp;
    private C36786Wc7 zbq;
    private String zbe = "";
    private String zbf = "";
    private String zbk = "en";
    private int zbl = -1;
    private InterfaceC46367ob7 zbn = AbstractC41030fb7.m41147C();
    private InterfaceC46367ob7 zbo = AbstractC41030fb7.m41147C();
    private int zbr = -1;

    static {
        P47 p47 = new P47();
        zbb = p47;
        AbstractC41030fb7.m41135l(P47.class, p47);
    }

    private P47() {
    }

    /* renamed from: E */
    public static M47 m90881E() {
        return (M47) zbb.m41128u();
    }

    /* renamed from: G */
    public static /* synthetic */ void m90879G(P47 p47, String str) {
        p47.zbd |= 1;
        p47.zbe = "PassThroughCoarseClassifier";
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
                    return new M47(null);
                }
                return new P47();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u000e\u0000\u0001\u0001\u000f\u000e\u0000\u0002\u0000\u0001ဈ\u0000\u0002င\u0007\u0003ခ\b\u0004\u001a\u0005\u001a\u0006ဉ\u0002\bဇ\t\tဉ\n\nဉ\u0003\u000bဈ\u0006\fဉ\u0004\rင\u000b\u000eဉ\u0005\u000fဈ\u0001", new Object[]{"zbd", "zbe", "zbl", "zbm", "zbn", "zbo", "zbg", "zbp", "zbq", "zbh", "zbk", "zbi", "zbr", "zbj", "zbf"});
        }
        return (byte) 1;
    }
}
