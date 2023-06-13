package p000;
/* renamed from: N17 */
/* loaded from: classes5.dex */
public final class N17 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final N17 zbb;
    private int zbd;
    private int zbe = 3;
    private float zbf = 100000.0f;
    private float zbg;

    static {
        N17 n17 = new N17();
        zbb = n17;
        AbstractC41030fb7.m41135l(N17.class, n17);
    }

    private N17() {
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
                    return new L17(null);
                }
                return new N17();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ခ\u0001\u0003ခ\u0002", new Object[]{"zbd", "zbe", J17.f16671a, "zbf", "zbg"});
        }
        return (byte) 1;
    }
}
