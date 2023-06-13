package p000;
/* renamed from: w97 */
/* loaded from: classes5.dex */
public final class C50855w97 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C50855w97 zbb;
    private int zbd;
    private int zbe;
    private H87 zbg;
    private H87 zbh;
    private float zbj;
    private H87 zbl;
    private H87 zbm;
    private C37794a97 zbn;
    private A97 zbp;
    private byte zbq = 2;
    private InterfaceC44588lb7 zbf = AbstractC41030fb7.m41149A();
    private String zbi = "";
    private InterfaceC46367ob7 zbk = AbstractC41030fb7.m41147C();
    private boolean zbo = true;

    static {
        C50855w97 c50855w97 = new C50855w97();
        zbb = c50855w97;
        AbstractC41030fb7.m41135l(C50855w97.class, c50855w97);
    }

    private C50855w97() {
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
                            this.zbq = b;
                            return null;
                        }
                        return zbb;
                    }
                    return new C50262v97(null);
                }
                return new C50855w97();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0002\b\u0001ᔄ\u0000\u0002ᔉ\u0001\u0003ᐉ\u0002\u0004ဈ\u0003\u0005ခ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007\tဇ\b\nᐉ\t\u000bЛ\f\u0016", new Object[]{"zbd", "zbe", "zbg", "zbh", "zbi", "zbj", "zbl", "zbm", "zbn", "zbo", "zbp", "zbk", O87.class, "zbf"});
        }
        return Byte.valueOf(this.zbq);
    }
}
