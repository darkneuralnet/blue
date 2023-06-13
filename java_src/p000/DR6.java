package p000;
/* renamed from: DR6 */
/* loaded from: classes5.dex */
public final class DR6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final DR6 zbb;
    private int zbd;
    private int zbe;
    private int zbf;
    private int zbg = 1;
    private int zbh = 1;

    static {
        DR6 dr6 = new DR6();
        zbb = dr6;
        AbstractC41030fb7.m41135l(DR6.class, dr6);
    }

    private DR6() {
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
                    return new CR6(null);
                }
                return new DR6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh"});
        }
        return (byte) 1;
    }
}
