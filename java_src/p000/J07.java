package p000;
/* renamed from: J07 */
/* loaded from: classes5.dex */
public final class J07 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final J07 zbb;
    private int zbd;
    private int zbe = -1;
    private float zbf = 1.0f;
    private int zbg;

    static {
        J07 j07 = new J07();
        zbb = j07;
        AbstractC41030fb7.m41135l(J07.class, j07);
    }

    private J07() {
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
                    return new H07(null);
                }
                return new J07();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ခ\u0001\u0003င\u0002", new Object[]{"zbd", "zbe", "zbf", "zbg"});
        }
        return (byte) 1;
    }
}
