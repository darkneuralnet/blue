package p000;
/* renamed from: U97 */
/* loaded from: classes5.dex */
public final class U97 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final U97 zbb;
    private int zbd;
    private InterfaceC46367ob7 zbe = AbstractC41030fb7.m41147C();
    private InterfaceC46367ob7 zbf = AbstractC41030fb7.m41147C();
    private int zbg;

    static {
        U97 u97 = new U97();
        zbb = u97;
        AbstractC41030fb7.m41135l(U97.class, u97);
    }

    private U97() {
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
                    return new T97(null);
                }
                return new U97();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003င\u0000", new Object[]{"zbd", "zbe", W97.class, "zbf", N97.class, "zbg"});
        }
        return (byte) 1;
    }
}
