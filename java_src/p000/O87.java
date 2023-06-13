package p000;
/* renamed from: O87 */
/* loaded from: classes5.dex */
public final class O87 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final O87 zbb;
    private int zbd;
    private float zbe;
    private int zbf;
    private byte zbg = 2;

    static {
        O87 o87 = new O87();
        zbb = o87;
        AbstractC41030fb7.m41135l(O87.class, o87);
    }

    private O87() {
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
                    return new N87(null);
                }
                return new O87();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔁ\u0000\u0002င\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        return Byte.valueOf(this.zbg);
    }
}
