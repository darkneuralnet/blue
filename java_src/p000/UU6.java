package p000;
/* renamed from: UU6 */
/* loaded from: classes5.dex */
public final class UU6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final UU6 zbb;
    private int zbd;
    private float zbe;

    static {
        UU6 uu6 = new UU6();
        zbb = uu6;
        AbstractC41030fb7.m41135l(UU6.class, uu6);
    }

    private UU6() {
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
                    return new TU6(null);
                }
                return new UU6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0001", new Object[]{"zbd", "zbe"});
        }
        return (byte) 1;
    }
}
