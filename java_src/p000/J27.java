package p000;
/* renamed from: J27 */
/* loaded from: classes5.dex */
public final class J27 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final J27 zbb;
    private int zbd;
    private float zbe = 0.3f;

    static {
        J27 j27 = new J27();
        zbb = j27;
        AbstractC41030fb7.m41135l(J27.class, j27);
    }

    private J27() {
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
                    return new I27(null);
                }
                return new J27();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ခ\u0000", new Object[]{"zbd", "zbe"});
        }
        return (byte) 1;
    }
}
