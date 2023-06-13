package p000;
/* renamed from: PV6 */
/* loaded from: classes5.dex */
public final class PV6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final PV6 zbb;
    private int zbd = 0;
    private Object zbe;

    static {
        PV6 pv6 = new PV6();
        zbb = pv6;
        AbstractC41030fb7.m41135l(PV6.class, pv6);
    }

    private PV6() {
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
                    return new OV6(null);
                }
                return new PV6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0000\u0003\u0001\u0000\u0002\u0004\u0003\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"zbe", "zbd", OW6.class, C51062wW6.class, C45143mX6.class});
        }
        return (byte) 1;
    }
}
