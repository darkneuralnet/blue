package p000;
/* renamed from: WS6 */
/* loaded from: classes5.dex */
public final class WS6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final WS6 zbb;
    private int zbd;
    private String zbe = "";
    private InterfaceC43995kb7 zbf = AbstractC41030fb7.m41123z();
    private InterfaceC43995kb7 zbg = AbstractC41030fb7.m41123z();
    private InterfaceC46367ob7 zbh = AbstractC41030fb7.m41147C();

    static {
        WS6 ws6 = new WS6();
        zbb = ws6;
        AbstractC41030fb7.m41135l(WS6.class, ws6);
    }

    private WS6() {
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
                    return new VS6(null);
                }
                return new WS6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0003\u0000\u0001ဈ\u0000\u0002$\u0003$\u0004\u001a", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh"});
        }
        return (byte) 1;
    }
}
