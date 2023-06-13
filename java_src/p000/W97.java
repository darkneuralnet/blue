package p000;
/* renamed from: W97 */
/* loaded from: classes5.dex */
public final class W97 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final W97 zbb;
    private InterfaceC46367ob7 zbd = AbstractC41030fb7.m41147C();
    private InterfaceC46367ob7 zbe = AbstractC41030fb7.m41147C();

    static {
        W97 w97 = new W97();
        zbb = w97;
        AbstractC41030fb7.m41135l(W97.class, w97);
    }

    private W97() {
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
                    return new V97(null);
                }
                return new W97();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0002\u0000\u0000\u0001\u000f\u0002\u0000\u0002\u0000\u0001\u001b\u000f\u001a", new Object[]{"zbd", S97.class, "zbe"});
        }
        return (byte) 1;
    }
}
