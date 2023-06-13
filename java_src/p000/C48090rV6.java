package p000;
/* renamed from: rV6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48090rV6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C48090rV6 zbb;
    private float zbd;
    private float zbe;

    static {
        C48090rV6 c48090rV6 = new C48090rV6();
        zbb = c48090rV6;
        AbstractC41030fb7.m41135l(C48090rV6.class, c48090rV6);
    }

    private C48090rV6() {
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
                    return new C47497qV6(null);
                }
                return new C48090rV6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0001\u0002\u0001", new Object[]{"zbd", "zbe"});
        }
        return (byte) 1;
    }
}
