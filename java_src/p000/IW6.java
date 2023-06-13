package p000;
/* renamed from: IW6 */
/* loaded from: classes5.dex */
public final class IW6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final IW6 zbb;
    private InterfaceC46367ob7 zbd = AbstractC41030fb7.m41147C();

    static {
        IW6 iw6 = new IW6();
        zbb = iw6;
        AbstractC41030fb7.m41135l(IW6.class, iw6);
    }

    private IW6() {
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
                    return new EW6(null);
                }
                return new IW6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zbd", CW6.class});
        }
        return (byte) 1;
    }
}
