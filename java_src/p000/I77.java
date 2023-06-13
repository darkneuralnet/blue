package p000;
/* renamed from: I77 */
/* loaded from: classes5.dex */
public final class I77 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final I77 zbb;
    private int zbd;
    private float zbe;
    private float zbf;
    private float zbg;
    private float zbh;
    private float zbi;
    private long zbj;
    private byte zbk = 2;

    static {
        I77 i77 = new I77();
        zbb = i77;
        AbstractC41030fb7.m41135l(I77.class, i77);
    }

    private I77() {
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
                    return new H77(null);
                }
                return new I77();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0004\u0001ᔁ\u0000\u0002ᔁ\u0001\u0003ᔁ\u0002\u0004ᔁ\u0003\u0005ခ\u0004\u0006ဂ\u0005", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi", "zbj"});
        }
        return Byte.valueOf(this.zbk);
    }
}
