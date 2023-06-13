package p000;
/* renamed from: HS6 */
/* loaded from: classes5.dex */
public final class HS6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final HS6 zbb;
    private int zbd;
    private int zbe;
    private int zbf;

    static {
        HS6 hs6 = new HS6();
        zbb = hs6;
        AbstractC41030fb7.m41135l(HS6.class, hs6);
    }

    private HS6() {
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
                    return new GS6(null);
                }
                return new HS6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        return (byte) 1;
    }
}
