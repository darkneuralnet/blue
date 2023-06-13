package p000;
/* renamed from: RT6 */
/* loaded from: classes6.dex */
public final class RT6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final RT6 zbb;
    private int zbd;
    private long zbe;
    private float zbf = 0.5f;

    static {
        RT6 rt6 = new RT6();
        zbb = rt6;
        AbstractC41030fb7.m41135l(RT6.class, rt6);
    }

    private RT6() {
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
                    return new C46293oT6(null);
                }
                return new RT6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ခ\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        return (byte) 1;
    }
}
