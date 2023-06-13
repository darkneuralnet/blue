package p000;
/* renamed from: Z17 */
/* loaded from: classes5.dex */
public final class Z17 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final Z17 zbb;
    private int zbd;
    private long zbe;
    private float zbf;

    static {
        Z17 z17 = new Z17();
        zbb = z17;
        AbstractC41030fb7.m41135l(Z17.class, z17);
    }

    private Z17() {
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
                    return new X17(null);
                }
                return new Z17();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ခ\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        return (byte) 1;
    }
}
