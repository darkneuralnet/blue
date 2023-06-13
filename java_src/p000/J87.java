package p000;
/* renamed from: J87 */
/* loaded from: classes5.dex */
public final class J87 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final J87 zbb;
    private InterfaceC46367ob7 zbd = AbstractC41030fb7.m41147C();
    private int zbe;

    static {
        J87 j87 = new J87();
        zbb = j87;
        AbstractC41030fb7.m41135l(J87.class, j87);
    }

    private J87() {
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
                    return new C42545i87(null);
                }
                return new J87();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\f", new Object[]{"zbd", C41349g77.class, "zbe"});
        }
        return (byte) 1;
    }
}
