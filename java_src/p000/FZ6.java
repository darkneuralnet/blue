package p000;
/* renamed from: FZ6 */
/* loaded from: classes5.dex */
public final class FZ6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final FZ6 zbb;
    private int zbd;
    private float zbf;
    private int zbi;
    private float zbj;
    private InterfaceC46367ob7 zbe = AbstractC41030fb7.m41147C();
    private boolean zbg = true;
    private float zbh = 0.8f;

    static {
        FZ6 fz6 = new FZ6();
        zbb = fz6;
        AbstractC41030fb7.m41135l(FZ6.class, fz6);
    }

    private FZ6() {
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
                    return new DZ6(null);
                }
                return new FZ6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u001a\u0002ခ\u0000\u0003ဇ\u0001\u0004ခ\u0002\u0005င\u0003\u0006ခ\u0004", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi", "zbj"});
        }
        return (byte) 1;
    }
}
