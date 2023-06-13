package p000;
/* renamed from: C97 */
/* loaded from: classes5.dex */
public final class C97 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C97 zbb;
    private int zbd;
    private H87 zbe;
    private byte zbg = 2;
    private InterfaceC44588lb7 zbf = AbstractC41030fb7.m41149A();

    static {
        C97 c97 = new C97();
        zbb = c97;
        AbstractC41030fb7.m41135l(C97.class, c97);
    }

    private C97() {
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
                            this.zbg = b;
                            return null;
                        }
                        return zbb;
                    }
                    return new B97(null);
                }
                return new C97();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ᐉ\u0000\u0002\u0016", new Object[]{"zbd", "zbe", "zbf"});
        }
        return Byte.valueOf(this.zbg);
    }
}
