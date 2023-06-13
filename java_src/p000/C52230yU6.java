package p000;
/* renamed from: yU6 */
/* loaded from: classes5.dex */
public final class C52230yU6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C52230yU6 zbb;
    private int zbd;
    private float zbe;
    private float zbf;
    private float zbg;
    private float zbh;
    private BU6 zbi;
    private float zbj;
    private C42151hU6 zbk;
    private float zbl;
    private AbstractC32088Ca7 zbm;
    private AbstractC32088Ca7 zbn;
    private byte zbo = 2;

    static {
        C52230yU6 c52230yU6 = new C52230yU6();
        zbb = c52230yU6;
        AbstractC41030fb7.m41135l(C52230yU6.class, c52230yU6);
    }

    private C52230yU6() {
        AbstractC32088Ca7 abstractC32088Ca7 = AbstractC32088Ca7.f4281c;
        this.zbm = abstractC32088Ca7;
        this.zbn = abstractC32088Ca7;
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
                            this.zbo = b;
                            return null;
                        }
                        return zbb;
                    }
                    return new C51637xU6(null);
                }
                return new C52230yU6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0004\u0001ᔁ\u0000\u0002ᔁ\u0001\u0003ᔁ\u0002\u0004ခ\u0003\u0005ခ\u0007\u0006ည\b\u0007ခ\u0005\bဉ\u0006\tᐉ\u0004\nည\t", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbl", "zbm", "zbj", "zbk", "zbi", "zbn"});
        }
        return Byte.valueOf(this.zbo);
    }
}
