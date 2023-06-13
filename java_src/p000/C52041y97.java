package p000;
/* renamed from: y97 */
/* loaded from: classes5.dex */
public final class C52041y97 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C52041y97 zbb;
    private int zbd;
    private int zbe;
    private float zbg;
    private byte zbh = 2;
    private InterfaceC44588lb7 zbf = AbstractC41030fb7.m41149A();

    static {
        C52041y97 c52041y97 = new C52041y97();
        zbb = c52041y97;
        AbstractC41030fb7.m41135l(C52041y97.class, c52041y97);
    }

    private C52041y97() {
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
                            this.zbh = b;
                            return null;
                        }
                        return zbb;
                    }
                    return new C51448x97(null);
                }
                return new C52041y97();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001ᔄ\u0000\u0002ᔁ\u0001\u0003\u0016", new Object[]{"zbd", "zbe", "zbg", "zbf"});
        }
        return Byte.valueOf(this.zbh);
    }
}
