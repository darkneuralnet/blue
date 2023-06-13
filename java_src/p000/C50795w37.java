package p000;
/* renamed from: w37  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C50795w37 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C50795w37 zbb;
    private InterfaceC46367ob7 zbd = AbstractC41030fb7.m41147C();

    static {
        C50795w37 c50795w37 = new C50795w37();
        zbb = c50795w37;
        AbstractC41030fb7.m41135l(C50795w37.class, c50795w37);
    }

    private C50795w37() {
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
                    return new C50202v37(null);
                }
                return new C50795w37();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zbd", C46053o37.class});
        }
        return (byte) 1;
    }
}
