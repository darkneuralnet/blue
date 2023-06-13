package p000;
/* renamed from: DT6 */
/* loaded from: classes5.dex */
public final class DT6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final DT6 zbb;
    private InterfaceC43995kb7 zbd = AbstractC41030fb7.m41123z();
    private InterfaceC43995kb7 zbe = AbstractC41030fb7.m41123z();
    private InterfaceC43995kb7 zbf = AbstractC41030fb7.m41123z();
    private InterfaceC43995kb7 zbg = AbstractC41030fb7.m41123z();
    private InterfaceC43995kb7 zbh = AbstractC41030fb7.m41123z();
    private InterfaceC43995kb7 zbi = AbstractC41030fb7.m41123z();

    static {
        DT6 dt6 = new DT6();
        zbb = dt6;
        AbstractC41030fb7.m41135l(DT6.class, dt6);
    }

    private DT6() {
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
                    return new CT6(null);
                }
                return new DT6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0006\u0000\u0001\u0013\u0002\u0013\u0003\u0013\u0004\u0013\u0005\u0013\u0006\u0013", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi"});
        }
        return (byte) 1;
    }
}
