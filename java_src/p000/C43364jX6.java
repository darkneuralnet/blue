package p000;
/* renamed from: jX6 */
/* loaded from: classes6.dex */
public final class C43364jX6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C43364jX6 zbb;
    private int zbd;
    private Object zbf;
    private boolean zbg;
    private P47 zbh;
    private boolean zbi;
    private T37 zbj;
    private float zbk;
    private boolean zbl;
    private boolean zbm;
    private boolean zbo;
    private float zbp;
    private int zbq;
    private XY6 zbr;
    private int zbe = 0;
    private byte zbs = 2;
    private int zbn = -1;

    static {
        C43364jX6 c43364jX6 = new C43364jX6();
        zbb = c43364jX6;
        AbstractC41030fb7.m41135l(C43364jX6.class, c43364jX6);
    }

    private C43364jX6() {
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
                            this.zbs = b;
                            return null;
                        }
                        return zbb;
                    }
                    return new GW6(null);
                }
                return new C43364jX6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u000e\u0001\u0001\u0001\u000e\u000e\u0000\u0000\u0001\u0001м\u0000\u0002ဉ\u0001\u0003ဉ\u0003\u0004ဇ\u0006\u0005င\u0007\u0006ဇ\b\u0007ဇ\u0000\bခ\t\tင\n\nဇ\u0002\u000bဉ\u000b\fခ\u0004\rဇ\u0005\u000e<\u0000", new Object[]{"zbf", "zbe", "zbd", YT6.class, "zbh", "zbj", "zbm", "zbn", "zbo", "zbg", "zbp", "zbq", "zbi", "zbr", "zbk", "zbl", C48987t07.class});
        }
        return Byte.valueOf(this.zbs);
    }
}
