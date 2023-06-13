package p000;
/* renamed from: IX6 */
/* loaded from: classes5.dex */
public final class IX6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final IX6 zbb;
    private int zbd;
    private double zbe;
    private double zbf;

    static {
        IX6 ix6 = new IX6();
        zbb = ix6;
        AbstractC41030fb7.m41135l(IX6.class, ix6);
    }

    private IX6() {
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
                    return new FX6(null);
                }
                return new IX6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        return (byte) 1;
    }
}
