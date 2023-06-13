package p000;
/* renamed from: MV6 */
/* loaded from: classes5.dex */
public final class MV6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final MV6 zbb;
    private int zbd;
    private String zbe = "visionkit-pa.googleapis.com";
    private String zbf = "";
    private InterfaceC46367ob7 zbg = AbstractC41030fb7.m41147C();

    static {
        MV6 mv6 = new MV6();
        zbb = mv6;
        AbstractC41030fb7.m41135l(MV6.class, mv6);
    }

    private MV6() {
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
                    return new JV6(null);
                }
                return new MV6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001b", new Object[]{"zbd", "zbe", "zbf", "zbg", LV6.class});
        }
        return (byte) 1;
    }
}
