package p000;
/* renamed from: OW6 */
/* loaded from: classes5.dex */
public final class OW6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final OW6 zbb;
    private InterfaceC46367ob7 zbd = AbstractC41030fb7.m41147C();

    static {
        OW6 ow6 = new OW6();
        zbb = ow6;
        AbstractC41030fb7.m41135l(OW6.class, ow6);
    }

    private OW6() {
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
                    return new NW6(null);
                }
                return new OW6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zbd", LW6.class});
        }
        return (byte) 1;
    }
}
