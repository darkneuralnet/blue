package p000;
/* renamed from: TR6 */
/* loaded from: classes5.dex */
public final class TR6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final TR6 zbb;
    private InterfaceC46367ob7 zbd = AbstractC41030fb7.m41147C();
    private InterfaceC46367ob7 zbe = AbstractC41030fb7.m41147C();

    static {
        TR6 tr6 = new TR6();
        zbb = tr6;
        AbstractC41030fb7.m41135l(TR6.class, tr6);
    }

    private TR6() {
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
                    return new SR6(null);
                }
                return new TR6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"zbd", QR6.class, "zbe", HS6.class});
        }
        return (byte) 1;
    }
}
