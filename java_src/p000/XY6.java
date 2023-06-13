package p000;
/* renamed from: XY6 */
/* loaded from: classes5.dex */
public final class XY6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final XY6 zbb;
    private int zbd;
    private int zbf;
    private C52850zX6 zbh;
    private double zbe = 1.0d;
    private float zbg = 0.3f;

    static {
        XY6 xy6 = new XY6();
        zbb = xy6;
        AbstractC41030fb7.m41135l(XY6.class, xy6);
    }

    private XY6() {
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
                    return new VY6(null);
                }
                return new XY6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001က\u0000\u0002င\u0001\u0003ခ\u0002\u0004ဉ\u0003", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh"});
        }
        return (byte) 1;
    }
}
