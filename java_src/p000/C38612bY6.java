package p000;
/* renamed from: bY6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C38612bY6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C38612bY6 zbb;
    private int zbd;
    private int zbe;

    static {
        C38612bY6 c38612bY6 = new C38612bY6();
        zbb = c38612bY6;
        AbstractC41030fb7.m41135l(C38612bY6.class, c38612bY6);
    }

    private C38612bY6() {
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
                    return new YX6(null);
                }
                return new C38612bY6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"zbd", "zbe"});
        }
        return (byte) 1;
    }
}
