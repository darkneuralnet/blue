package p000;
/* renamed from: SZ6 */
/* loaded from: classes6.dex */
public final class SZ6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final SZ6 zbb;
    private int zbd;
    private Object zbf;
    private int zbe = 0;
    private String zbg = "";

    static {
        SZ6 sz6 = new SZ6();
        zbb = sz6;
        AbstractC41030fb7.m41135l(SZ6.class, sz6);
    }

    private SZ6() {
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
                    return new IZ6(null);
                }
                return new SZ6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u00025\u0000\u0003<\u0000", new Object[]{"zbf", "zbe", "zbd", "zbg", QZ6.class});
        }
        return (byte) 1;
    }
}
