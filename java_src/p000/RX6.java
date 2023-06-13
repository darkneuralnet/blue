package p000;
/* renamed from: RX6 */
/* loaded from: classes5.dex */
public final class RX6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final RX6 zbb;
    private int zbd;
    private float zbe;
    private boolean zbf;

    static {
        RX6 rx6 = new RX6();
        zbb = rx6;
        AbstractC41030fb7.m41135l(RX6.class, rx6);
    }

    private RX6() {
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
                    return new OX6(null);
                }
                return new RX6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ဇ\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        return (byte) 1;
    }
}
