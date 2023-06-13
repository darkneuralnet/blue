package p000;
/* renamed from: V27 */
/* loaded from: classes5.dex */
public final class V27 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final V27 zbb;
    private int zbd;
    private boolean zbe;
    private float zbf = 0.8f;
    private int zbg;
    private int zbh;

    static {
        V27 v27 = new V27();
        zbb = v27;
        AbstractC41030fb7.m41135l(V27.class, v27);
    }

    private V27() {
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
                    return new U27(null);
                }
                return new V27();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ခ\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh"});
        }
        return (byte) 1;
    }
}
