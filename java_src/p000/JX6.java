package p000;
/* renamed from: JX6 */
/* loaded from: classes6.dex */
public final class JX6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final JX6 zbb;
    private int zbd;
    private String zbe = "";
    private InterfaceC46367ob7 zbf = AbstractC41030fb7.m41147C();
    private InterfaceC46367ob7 zbg = AbstractC41030fb7.m41147C();
    private long zbh;

    static {
        JX6 jx6 = new JX6();
        zbb = jx6;
        AbstractC41030fb7.m41135l(JX6.class, jx6);
    }

    private JX6() {
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
                    return new GX6(null);
                }
                return new JX6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001a\u0003\u001b\u0004ဂ\u0001", new Object[]{"zbd", "zbe", "zbf", "zbg", PX6.class, "zbh"});
        }
        return (byte) 1;
    }
}
