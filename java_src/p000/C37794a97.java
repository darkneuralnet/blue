package p000;
/* renamed from: a97 */
/* loaded from: classes5.dex */
public final class C37794a97 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C37794a97 zbb;
    private int zbd;
    private AbstractC32088Ca7 zbe;
    private AbstractC32088Ca7 zbf;
    private AbstractC32088Ca7 zbg;
    private H87 zbh;
    private String zbi;
    private byte zbj = 2;

    static {
        C37794a97 c37794a97 = new C37794a97();
        zbb = c37794a97;
        AbstractC41030fb7.m41135l(C37794a97.class, c37794a97);
    }

    private C37794a97() {
        AbstractC32088Ca7 abstractC32088Ca7 = AbstractC32088Ca7.f4281c;
        this.zbe = abstractC32088Ca7;
        this.zbf = abstractC32088Ca7;
        this.zbg = abstractC32088Ca7;
        this.zbi = "";
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
                            this.zbj = b;
                            return null;
                        }
                        return zbb;
                    }
                    return new Z87(null);
                }
                return new C37794a97();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0002\u0001ᔊ\u0000\u0002ည\u0001\u0003ည\u0002\u0004ᐉ\u0003\u0005ဈ\u0004", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi"});
        }
        return Byte.valueOf(this.zbj);
    }
}
