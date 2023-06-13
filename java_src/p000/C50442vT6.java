package p000;
/* renamed from: vT6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C50442vT6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C50442vT6 zbb;
    private InterfaceC46367ob7 zbd = AbstractC41030fb7.m41147C();

    static {
        C50442vT6 c50442vT6 = new C50442vT6();
        zbb = c50442vT6;
        AbstractC41030fb7.m41135l(C50442vT6.class, c50442vT6);
    }

    private C50442vT6() {
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
                    return new C49850uT6(null);
                }
                return new C50442vT6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zbd", C48664sT6.class});
        }
        return (byte) 1;
    }
}
