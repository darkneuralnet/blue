package p000;
/* renamed from: PX6 */
/* loaded from: classes6.dex */
public final class PX6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final PX6 zbb;
    private int zbd;
    private float zbe;
    private long zbf;
    private long zbg;
    private long zbh;

    static {
        PX6 px6 = new PX6();
        zbb = px6;
        AbstractC41030fb7.m41135l(PX6.class, px6);
    }

    private PX6() {
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
                    return new MX6(null);
                }
                return new PX6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh"});
        }
        return (byte) 1;
    }
}
