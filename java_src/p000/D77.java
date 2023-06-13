package p000;
/* renamed from: D77 */
/* loaded from: classes5.dex */
public final class D77 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final D77 zbb;
    private int zbd;
    private float zbe;
    private float zbf;

    static {
        D77 d77 = new D77();
        zbb = d77;
        AbstractC41030fb7.m41135l(D77.class, d77);
    }

    private D77() {
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
                    return new C77(null);
                }
                return new D77();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        return (byte) 1;
    }
}
