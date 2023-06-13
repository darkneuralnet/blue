package p000;
/* renamed from: RS6 */
/* loaded from: classes5.dex */
public final class RS6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final RS6 zbb;
    private int zbd;
    private InterfaceC46367ob7 zbe = AbstractC41030fb7.m41147C();
    private String zbf = "";
    private float zbg;

    static {
        RS6 rs6 = new RS6();
        zbb = rs6;
        AbstractC41030fb7.m41135l(RS6.class, rs6);
    }

    private RS6() {
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
                    return new QS6(null);
                }
                return new RS6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000\u0003ခ\u0001", new Object[]{"zbd", "zbe", "zbf", "zbg"});
        }
        return (byte) 1;
    }
}
