package p000;
/* renamed from: RZ6 */
/* loaded from: classes5.dex */
public final class RZ6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final RZ6 zbb;
    private int zbd;
    private C46940pZ6 zbe;
    private InterfaceC43995kb7 zbf = AbstractC41030fb7.m41123z();

    static {
        RZ6 rz6 = new RZ6();
        zbb = rz6;
        AbstractC41030fb7.m41135l(RZ6.class, rz6);
    }

    private RZ6() {
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
                    return new PZ6(null);
                }
                return new RZ6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u0013", new Object[]{"zbd", "zbe", "zbf"});
        }
        return (byte) 1;
    }
}
