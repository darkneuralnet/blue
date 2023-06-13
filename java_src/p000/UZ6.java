package p000;
/* renamed from: UZ6 */
/* loaded from: classes6.dex */
public final class UZ6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final UZ6 zbb;
    private InterfaceC46367ob7 zbd = AbstractC41030fb7.m41147C();

    static {
        UZ6 uz6 = new UZ6();
        zbb = uz6;
        AbstractC41030fb7.m41135l(UZ6.class, uz6);
    }

    private UZ6() {
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
                    return new GZ6(null);
                }
                return new UZ6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zbd", SZ6.class});
        }
        return (byte) 1;
    }
}
