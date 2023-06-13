package p000;
/* renamed from: H87 */
/* loaded from: classes5.dex */
public final class H87 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final H87 zbb;
    private int zbd;
    private int zbe;
    private int zbf;
    private int zbg;
    private int zbh;
    private float zbi;
    private U87 zbj;
    private byte zbk = 2;

    static {
        H87 h87 = new H87();
        zbb = h87;
        AbstractC41030fb7.m41135l(H87.class, h87);
    }

    private H87() {
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
                            this.zbk = b;
                            return null;
                        }
                        return zbb;
                    }
                    return new G87(null);
                }
                return new H87();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0004\u0001ᔄ\u0000\u0002ᔄ\u0001\u0003ᔄ\u0002\u0004ᔄ\u0003\u0005ခ\u0004\u0006ဉ\u0005", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi", "zbj"});
        }
        return Byte.valueOf(this.zbk);
    }
}
