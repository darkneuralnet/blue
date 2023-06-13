package p000;
/* renamed from: E47 */
/* loaded from: classes5.dex */
public final class E47 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final E47 zbb;
    private int zbd;
    private YT6 zbe;
    private float zbf;
    private byte zbg = 2;

    static {
        E47 e47 = new E47();
        zbb = e47;
        AbstractC41030fb7.m41135l(E47.class, e47);
    }

    private E47() {
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
                    return new D47(null);
                }
                return new E47();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ခ\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        return Byte.valueOf(this.zbg);
    }
}
