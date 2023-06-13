package p000;
/* renamed from: CZ6 */
/* loaded from: classes6.dex */
public final class CZ6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final CZ6 zbb;
    private int zbd;
    private boolean zbe;
    private String zbf = "";

    static {
        CZ6 cz6 = new CZ6();
        zbb = cz6;
        AbstractC41030fb7.m41135l(CZ6.class, cz6);
    }

    private CZ6() {
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
                    return new AZ6(null);
                }
                return new CZ6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        return (byte) 1;
    }
}
