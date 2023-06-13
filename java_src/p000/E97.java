package p000;
/* renamed from: E97 */
/* loaded from: classes5.dex */
public final class E97 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final E97 zbb;
    private int zbd;
    private H87 zbe;
    private int zbh;
    private int zbi;
    private byte zbj = 2;
    private String zbf = "";
    private InterfaceC44588lb7 zbg = AbstractC41030fb7.m41149A();

    static {
        E97 e97 = new E97();
        zbb = e97;
        AbstractC41030fb7.m41135l(E97.class, e97);
    }

    private E97() {
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
                    return new D97(null);
                }
                return new E97();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0003\u0016\u0004င\u0002\u0005ဌ\u0003", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi", C52203yR6.m3480a()});
        }
        return Byte.valueOf(this.zbj);
    }
}
