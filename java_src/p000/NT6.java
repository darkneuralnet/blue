package p000;
/* renamed from: NT6 */
/* loaded from: classes5.dex */
public final class NT6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final NT6 zbb;
    private int zbd = 0;
    private Object zbe;

    static {
        NT6 nt6 = new NT6();
        zbb = nt6;
        AbstractC41030fb7.m41135l(NT6.class, nt6);
    }

    private NT6() {
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
                    return new MT6(null);
                }
                return new NT6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"zbe", "zbd", FT6.class, BT6.class});
        }
        return (byte) 1;
    }
}
