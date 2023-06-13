package p000;
/* renamed from: FT6 */
/* loaded from: classes5.dex */
public final class FT6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final FT6 zbb;
    private int zbd;
    private float zbe = 10.0f;
    private float zbf = 10.0f;
    private float zbg = 5.0f;
    private float zbh = 5.0f;
    private float zbi = 10.0f;
    private float zbj = 10.0f;

    static {
        FT6 ft6 = new FT6();
        zbb = ft6;
        AbstractC41030fb7.m41135l(FT6.class, ft6);
    }

    private FT6() {
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
                    return new ET6(null);
                }
                return new FT6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi", "zbj"});
        }
        return (byte) 1;
    }
}
