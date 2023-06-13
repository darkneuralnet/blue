package p000;
/* renamed from: iS6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C42726iS6 extends AbstractC41030fb7<C42726iS6, FR6> implements InterfaceC36309Ub7 {
    private static final C42726iS6 zbb;
    private int zbd;
    private InterfaceC46367ob7 zbe = AbstractC41030fb7.m41147C();
    private String zbf = "";

    static {
        C42726iS6 c42726iS6 = new C42726iS6();
        zbb = c42726iS6;
        AbstractC41030fb7.m41135l(C42726iS6.class, c42726iS6);
    }

    private C42726iS6() {
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
                    return new FR6(null);
                }
                return new C42726iS6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000", new Object[]{"zbd", "zbe", AV6.class, "zbf"});
        }
        return (byte) 1;
    }
}
