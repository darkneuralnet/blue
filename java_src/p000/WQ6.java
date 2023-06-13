package p000;
/* renamed from: WQ6 */
/* loaded from: classes5.dex */
public final class WQ6 extends AbstractC39234cb7 {
    private static final WQ6 zbd;
    private int zbe;
    private int zbf;
    private byte zbg = 2;

    static {
        WQ6 wq6 = new WQ6();
        zbd = wq6;
        AbstractC41030fb7.m41135l(WQ6.class, wq6);
    }

    private WQ6() {
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
                        return zbd;
                    }
                    return new UQ6(null);
                }
                return new WQ6();
            }
            return AbstractC41030fb7.m41144c(zbd, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"zbe", "zbf", VQ6.f39095a});
        }
        return Byte.valueOf(this.zbg);
    }
}
