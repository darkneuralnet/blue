package p000;
/* renamed from: U17 */
/* loaded from: classes6.dex */
public final class U17 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final U17 zbb;
    private int zbd;
    private int zbe;
    private YT6 zbf;
    private V47 zbg;
    private C50183v17 zbh;
    private C52898zc7 zbi;
    private byte zbj = 2;

    static {
        U17 u17 = new U17();
        zbb = u17;
        AbstractC41030fb7.m41135l(U17.class, u17);
    }

    private U17() {
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
                    return new Q17(null);
                }
                return new U17();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ဉ\u0002\u0002ဉ\u0003\u0003ဌ\u0000\u0004ဉ\u0004\u0005ᐉ\u0001", new Object[]{"zbd", "zbg", "zbh", "zbe", S17.f33042a, "zbi", "zbf"});
        }
        return Byte.valueOf(this.zbj);
    }
}
