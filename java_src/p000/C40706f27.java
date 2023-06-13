package p000;
/* renamed from: f27  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C40706f27 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C40706f27 zbb;
    private int zbd;
    private C38327b37 zbe;
    private C52021y77 zbf;
    private RY6 zbg;
    private S27 zbh;
    private C47822r27 zbi;
    private C44264l27 zbj;
    private M27 zbk;
    private byte zbl = 2;

    static {
        C40706f27 c40706f27 = new C40706f27();
        zbb = c40706f27;
        AbstractC41030fb7.m41135l(C40706f27.class, c40706f27);
    }

    private C40706f27() {
    }

    @Override // p000.AbstractC41030fb7
    /* renamed from: p */
    public final Object mo1009p(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            if (obj == null) {
                                b = 0;
                            }
                            this.zbl = b;
                            return null;
                        }
                        return zbb;
                    }
                    return new C39521d27(null);
                }
                return new C40706f27();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003ᐉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi", "zbj", "zbk"});
        }
        return Byte.valueOf(this.zbl);
    }
}
