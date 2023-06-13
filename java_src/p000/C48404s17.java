package p000;
/* renamed from: s17 */
/* loaded from: classes6.dex */
public final class C48404s17 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C48404s17 zbb;
    private int zbd;
    private LY6 zbe;
    private P47 zbf;
    private YT6 zbg;
    private P47 zbh;
    private byte zbi = 2;

    static {
        C48404s17 c48404s17 = new C48404s17();
        zbb = c48404s17;
        AbstractC41030fb7.m41135l(C48404s17.class, c48404s17);
    }

    private C48404s17() {
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
                            this.zbi = b;
                            return null;
                        }
                        return zbb;
                    }
                    return new C47219q17(null);
                }
                return new C48404s17();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003ᐉ\u0002\u0004ဉ\u0003", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh"});
        }
        return Byte.valueOf(this.zbi);
    }
}
