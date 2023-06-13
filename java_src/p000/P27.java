package p000;
/* renamed from: P27 */
/* loaded from: classes5.dex */
public final class P27 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final P27 zbb;
    private int zbd;
    private boolean zbe;
    private String zbf = "";
    private String zbg = "";

    static {
        P27 p27 = new P27();
        zbb = p27;
        AbstractC41030fb7.m41135l(P27.class, p27);
    }

    private P27() {
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
                    return new O27(null);
                }
                return new P27();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"zbd", "zbe", "zbf", "zbg"});
        }
        return (byte) 1;
    }
}
