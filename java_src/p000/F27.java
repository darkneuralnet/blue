package p000;
/* renamed from: F27 */
/* loaded from: classes6.dex */
public final class F27 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final F27 zbb;
    private int zbd;
    private int zbe = 1;
    private boolean zbf;

    static {
        F27 f27 = new F27();
        zbb = f27;
        AbstractC41030fb7.m41135l(F27.class, f27);
    }

    private F27() {
    }

    /* renamed from: E */
    public static A27 m108066E() {
        return (A27) zbb.m41128u();
    }

    /* renamed from: G */
    public static /* synthetic */ void m108064G(F27 f27, int i) {
        f27.zbe = 1;
        f27.zbd = 1 | f27.zbd;
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
                    return new A27(null);
                }
                return new F27();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001", new Object[]{"zbd", "zbe", C50222v57.f113517a, "zbf"});
        }
        return (byte) 1;
    }
}
