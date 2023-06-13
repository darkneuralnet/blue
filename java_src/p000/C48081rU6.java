package p000;
/* renamed from: rU6 */
/* loaded from: classes5.dex */
public final class C48081rU6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C48081rU6 zbb;
    private int zbd;
    private int zbe;
    private int zbg;
    private boolean zbh;
    private byte zbi = 2;
    private InterfaceC46367ob7 zbf = AbstractC41030fb7.m41147C();

    static {
        C48081rU6 c48081rU6 = new C48081rU6();
        zbb = c48081rU6;
        AbstractC41030fb7.m41135l(C48081rU6.class, c48081rU6);
    }

    private C48081rU6() {
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
                    return new C47488qU6(null);
                }
                return new C48081rU6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0004\u0000\u0001\u0003\u0006\u0004\u0000\u0001\u0002\u0003ᔄ\u0000\u0004Л\u0005င\u0001\u0006ဇ\u0002", new Object[]{"zbd", "zbe", "zbf", C52230yU6.class, "zbg", "zbh"});
        }
        return Byte.valueOf(this.zbi);
    }
}
