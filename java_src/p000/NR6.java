package p000;
/* renamed from: NR6 */
/* loaded from: classes5.dex */
public final class NR6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final NR6 zbb;
    private C34671Nb7 zbd = C34671Nb7.m93721d();

    static {
        NR6 nr6 = new NR6();
        zbb = nr6;
        AbstractC41030fb7.m41135l(NR6.class, nr6);
    }

    private NR6() {
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
                    return new LR6(null);
                }
                return new NR6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"zbd", MR6.f23125a});
        }
        return (byte) 1;
    }
}
