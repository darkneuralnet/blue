package p000;
/* renamed from: LU6 */
/* loaded from: classes5.dex */
public final class LU6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final LU6 zbb;
    private int zbd;
    private InterfaceC44588lb7 zbe = AbstractC41030fb7.m41149A();

    static {
        LU6 lu6 = new LU6();
        zbb = lu6;
        AbstractC41030fb7.m41135l(LU6.class, lu6);
    }

    private LU6() {
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
                    return new KU6(null);
                }
                return new LU6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0004\u0002'", new Object[]{"zbd", "zbe"});
        }
        return (byte) 1;
    }
}
