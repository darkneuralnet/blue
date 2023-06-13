package p000;
/* renamed from: SX6 */
/* loaded from: classes6.dex */
public final class SX6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final SX6 zbb;
    private InterfaceC46367ob7 zbd = AbstractC41030fb7.m41147C();

    static {
        SX6 sx6 = new SX6();
        zbb = sx6;
        AbstractC41030fb7.m41135l(SX6.class, sx6);
    }

    private SX6() {
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
                    return new DX6(null);
                }
                return new SX6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zbd", JX6.class});
        }
        return (byte) 1;
    }
}
