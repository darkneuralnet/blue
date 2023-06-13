package p000;
/* renamed from: MY6 */
/* loaded from: classes6.dex */
public final class MY6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final MY6 zbb;
    private int zbd;
    private C47269q67 zbe;
    private I77 zbf;
    private boolean zbg;
    private byte zbi = 2;
    private String zbh = "";

    static {
        MY6 my6 = new MY6();
        zbb = my6;
        AbstractC41030fb7.m41135l(MY6.class, my6);
    }

    private MY6() {
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
                    return new KY6(null);
                }
                return new MY6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဉ\u0000\u0002ᐉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh"});
        }
        return Byte.valueOf(this.zbi);
    }
}
