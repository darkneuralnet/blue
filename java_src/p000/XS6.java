package p000;
/* renamed from: XS6 */
/* loaded from: classes5.dex */
public final class XS6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final XS6 zbb;
    private InterfaceC46367ob7 zbd = AbstractC41030fb7.m41147C();

    static {
        XS6 xs6 = new XS6();
        zbb = xs6;
        AbstractC41030fb7.m41135l(XS6.class, xs6);
    }

    private XS6() {
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
                    return new US6(null);
                }
                return new XS6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zbd", WS6.class});
        }
        return (byte) 1;
    }
}
