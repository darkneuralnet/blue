package p000;
/* renamed from: MZ6 */
/* loaded from: classes6.dex */
public final class MZ6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final MZ6 zbb;
    private int zbd;
    private long zbe;
    private long zbf;

    static {
        MZ6 mz6 = new MZ6();
        zbb = mz6;
        AbstractC41030fb7.m41135l(MZ6.class, mz6);
    }

    private MZ6() {
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
                    return new KZ6(null);
                }
                return new MZ6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        return (byte) 1;
    }
}
