package p000;
/* renamed from: SV6 */
/* loaded from: classes5.dex */
public final class SV6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final SV6 zbb;
    private String zbd = "";
    private InterfaceC46367ob7 zbe = AbstractC41030fb7.m41147C();

    static {
        SV6 sv6 = new SV6();
        zbb = sv6;
        AbstractC41030fb7.m41135l(SV6.class, sv6);
    }

    private SV6() {
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
                    return new RV6(null);
                }
                return new SV6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zbd", "zbe", YV6.class});
        }
        return (byte) 1;
    }
}
