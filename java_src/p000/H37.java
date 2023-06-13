package p000;
/* renamed from: H37 */
/* loaded from: classes5.dex */
public final class H37 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final H37 zbb;
    private InterfaceC46367ob7 zbd = AbstractC41030fb7.m41147C();

    static {
        H37 h37 = new H37();
        zbb = h37;
        AbstractC41030fb7.m41135l(H37.class, h37);
    }

    private H37() {
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
                    return new E37(null);
                }
                return new H37();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zbd", G37.class});
        }
        return (byte) 1;
    }
}
