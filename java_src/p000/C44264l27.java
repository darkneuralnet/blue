package p000;
/* renamed from: l27  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C44264l27 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C44264l27 zbb;
    private int zbd;
    private int zbf;
    private int zbg;
    private float zbi;
    private InterfaceC46367ob7 zbe = AbstractC41030fb7.m41147C();
    private String zbh = "";

    static {
        C44264l27 c44264l27 = new C44264l27();
        zbb = c44264l27;
        AbstractC41030fb7.m41135l(C44264l27.class, c44264l27);
    }

    private C44264l27() {
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
                    return new C43078j27(null);
                }
                return new C44264l27();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001c\u0002င\u0000\u0003င\u0001\u0004ဈ\u0002\u0005ခ\u0003", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi"});
        }
        return (byte) 1;
    }
}
