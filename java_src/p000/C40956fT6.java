package p000;
/* renamed from: fT6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C40956fT6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C40956fT6 zbb;
    private int zbd;
    private float zbf;
    private float zbg;
    private float zbi;
    private String zbe = "";
    private float zbh = 1.0f;
    private InterfaceC46367ob7 zbj = AbstractC41030fb7.m41147C();

    static {
        C40956fT6 c40956fT6 = new C40956fT6();
        zbb = c40956fT6;
        AbstractC41030fb7.m41135l(C40956fT6.class, c40956fT6);
    }

    private C40956fT6() {
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
                    return new C40363eT6(null);
                }
                return new C40956fT6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006\u001a", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi", "zbj"});
        }
        return (byte) 1;
    }
}
