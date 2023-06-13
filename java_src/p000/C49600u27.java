package p000;
/* renamed from: u27  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C49600u27 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C49600u27 zbb;
    private int zbd;
    private String zbe = "";
    private InterfaceC46367ob7 zbf = AbstractC41030fb7.m41147C();
    private boolean zbg;

    static {
        C49600u27 c49600u27 = new C49600u27();
        zbb = c49600u27;
        AbstractC41030fb7.m41135l(C49600u27.class, c49600u27);
    }

    private C49600u27() {
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
                    return new C48414s27(null);
                }
                return new C49600u27();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a\u0003ဇ\u0001", new Object[]{"zbd", "zbe", "zbf", "zbg"});
        }
        return (byte) 1;
    }
}
