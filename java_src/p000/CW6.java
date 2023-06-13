package p000;
/* renamed from: CW6 */
/* loaded from: classes5.dex */
public final class CW6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final CW6 zbb;
    private UW6 zbd;
    private double zbe;

    static {
        CW6 cw6 = new CW6();
        zbb = cw6;
        AbstractC41030fb7.m41135l(CW6.class, cw6);
    }

    private CW6() {
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
                    return new BW6(null);
                }
                return new CW6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u0000", new Object[]{"zbd", "zbe"});
        }
        return (byte) 1;
    }
}
