package p000;
/* renamed from: KT6 */
/* loaded from: classes5.dex */
public final class KT6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final KT6 zbb;
    private InterfaceC46367ob7 zbd = AbstractC41030fb7.m41147C();

    static {
        KT6 kt6 = new KT6();
        zbb = kt6;
        AbstractC41030fb7.m41135l(KT6.class, kt6);
    }

    private KT6() {
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
                    return new JT6(null);
                }
                return new KT6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zbd", IT6.class});
        }
        return (byte) 1;
    }
}
