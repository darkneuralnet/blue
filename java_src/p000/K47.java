package p000;
/* renamed from: K47 */
/* loaded from: classes5.dex */
public final class K47 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final K47 zbb;
    private int zbd;
    private InterfaceC46367ob7 zbe = AbstractC41030fb7.m41147C();
    private int zbf;

    static {
        K47 k47 = new K47();
        zbb = k47;
        AbstractC41030fb7.m41135l(K47.class, k47);
    }

    private K47() {
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
                    return new J47(null);
                }
                return new K47();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002င\u0000", new Object[]{"zbd", "zbe", N37.class, "zbf"});
        }
        return (byte) 1;
    }
}
