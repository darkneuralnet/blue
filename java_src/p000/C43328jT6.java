package p000;
/* renamed from: jT6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C43328jT6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C43328jT6 zbb;
    private int zbd;
    private float zbe;
    private float zbf;
    private float zbg;
    private float zbh;

    static {
        C43328jT6 c43328jT6 = new C43328jT6();
        zbb = c43328jT6;
        AbstractC41030fb7.m41135l(C43328jT6.class, c43328jT6);
    }

    private C43328jT6() {
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
                    return new C42735iT6(null);
                }
                return new C43328jT6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh"});
        }
        return (byte) 1;
    }
}
