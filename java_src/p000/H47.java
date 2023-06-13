package p000;
/* renamed from: H47 */
/* loaded from: classes5.dex */
public final class H47 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final H47 zbb;
    private InterfaceC46367ob7 zbd = AbstractC41030fb7.m41147C();

    static {
        H47 h47 = new H47();
        zbb = h47;
        AbstractC41030fb7.m41135l(H47.class, h47);
    }

    private H47() {
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
                    return new G47(null);
                }
                return new H47();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zbd", K47.class});
        }
        return (byte) 1;
    }
}
