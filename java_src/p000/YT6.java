package p000;
/* renamed from: YT6 */
/* loaded from: classes5.dex */
public final class YT6 extends AbstractC39234cb7 {
    private static final YT6 zbd;
    private boolean zbA;
    private int zbe;
    private float zbi;
    private boolean zbl;
    private boolean zbm;
    private boolean zbn;
    private int zbo;
    private C38576bU6 zbp;
    private C52221yT6 zbq;
    private TR6 zbr;
    private NT6 zbs;
    private UT6 zbt;
    private C36786Wc7 zbv;
    private boolean zbw;
    private boolean zbx;
    private int zby;
    private int zbz;
    private byte zbB = 2;
    private String zbf = "";
    private int zbg = 10;
    private int zbh = 1;
    private float zbj = 0.3f;
    private InterfaceC46367ob7 zbk = AbstractC41030fb7.m41147C();
    private int zbu = 1;

    static {
        YT6 yt6 = new YT6();
        zbd = yt6;
        AbstractC41030fb7.m41135l(YT6.class, yt6);
    }

    private YT6() {
    }

    @Override // p000.AbstractC41030fb7
    /* renamed from: p */
    public final Object mo1009p(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            if (obj == null) {
                                b = 0;
                            }
                            this.zbB = b;
                            return null;
                        }
                        return zbd;
                    }
                    return new PT6(null);
                }
                return new YT6();
            }
            return AbstractC41030fb7.m41144c(zbd, "\u0001\u0016\u0000\u0001\u0001\u0017\u0016\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006\u001a\u0007ဇ\u0005\bဇ\u0006\tဇ\u0007\nဋ\b\u000bဉ\t\fဉ\n\rဉ\f\u000fင\u000e\u0010ဉ\r\u0011ဉ\u000f\u0012ဇ\u0010\u0013ဇ\u0011\u0014င\u0012\u0015ဉ\u000b\u0016ဌ\u0013\u0017ဇ\u0014", new Object[]{"zbe", "zbf", "zbg", "zbh", "zbi", "zbj", "zbk", "zbl", "zbm", "zbn", "zbo", "zbp", "zbq", "zbs", "zbu", "zbt", "zbv", "zbw", "zbx", "zby", "zbr", "zbz", XT6.f43290a, "zbA"});
        }
        return Byte.valueOf(this.zbB);
    }
}
