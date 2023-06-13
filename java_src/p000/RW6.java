package p000;
/* renamed from: RW6 */
/* loaded from: classes5.dex */
public final class RW6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final RW6 zbb;
    private C39825dZ6 zbd;
    private InterfaceC46367ob7 zbe = AbstractC41030fb7.m41147C();

    static {
        RW6 rw6 = new RW6();
        zbb = rw6;
        AbstractC41030fb7.m41135l(RW6.class, rw6);
    }

    private RW6() {
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
                    return new QW6(null);
                }
                return new RW6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\t\u0002\u001b", new Object[]{"zbd", "zbe", YV6.class});
        }
        return (byte) 1;
    }
}
