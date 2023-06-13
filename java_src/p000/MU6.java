package p000;
/* renamed from: MU6 */
/* loaded from: classes5.dex */
public final class MU6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final MU6 zbb;
    private Object zbe;
    private int zbf;
    private int zbg;
    private int zbh;
    private int zbd = 0;
    private InterfaceC46367ob7 zbi = AbstractC41030fb7.m41147C();

    static {
        MU6 mu6 = new MU6();
        zbb = mu6;
        AbstractC41030fb7.m41135l(MU6.class, mu6);
    }

    private MU6() {
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
                    return new JU6(null);
                }
                return new MU6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001\f\u0002<\u0000\u0003\u0004\u0004\u001b\u00057\u0000\u0006\u0004", new Object[]{"zbe", "zbd", "zbf", LU6.class, "zbg", "zbi", C43985ka7.class, "zbh"});
        }
        return (byte) 1;
    }
}
