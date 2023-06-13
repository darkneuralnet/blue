package p000;
/* renamed from: M87 */
/* loaded from: classes5.dex */
public final class M87 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final M87 zbb;
    private int zbd;
    private int zbe = -1;
    private int zbf = -1;
    private InterfaceC43995kb7 zbg = AbstractC41030fb7.m41123z();
    private InterfaceC44588lb7 zbh = AbstractC41030fb7.m41149A();
    private InterfaceC43995kb7 zbi = AbstractC41030fb7.m41123z();

    static {
        M87 m87 = new M87();
        zbb = m87;
        AbstractC41030fb7.m41135l(M87.class, m87);
    }

    private M87() {
    }

    @Override // p000.AbstractC41030fb7
    /* renamed from: p */
    public final Object mo1009p(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zbb;
                    }
                    return new I87(null);
                }
                return new M87();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0003\u0000\u0001င\u0000\u0002င\u0001\u0003\u0013\u0004\u0016\u0006\u0013", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi"});
        }
        return (byte) 1;
    }
}
