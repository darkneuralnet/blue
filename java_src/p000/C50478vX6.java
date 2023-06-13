package p000;
/* renamed from: vX6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C50478vX6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C50478vX6 zbb;
    private int zbd;
    private float zbg;
    private String zbe = "en";
    private int zbf = -1;
    private InterfaceC46367ob7 zbh = AbstractC41030fb7.m41147C();
    private InterfaceC46367ob7 zbi = AbstractC41030fb7.m41147C();

    static {
        C50478vX6 c50478vX6 = new C50478vX6();
        zbb = c50478vX6;
        AbstractC41030fb7.m41135l(C50478vX6.class, c50478vX6);
    }

    private C50478vX6() {
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
                    return new C49886uX6(null);
                }
                return new C50478vX6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ခ\u0002\u0004\u001a\u0005\u001a", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi"});
        }
        return (byte) 1;
    }
}
