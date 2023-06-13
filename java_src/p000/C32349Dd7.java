package p000;
/* renamed from: Dd7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C32349Dd7 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C32349Dd7 zbb;
    private int zbd;
    private boolean zbe;
    private boolean zbf;

    static {
        C32349Dd7 c32349Dd7 = new C32349Dd7();
        zbb = c32349Dd7;
        AbstractC41030fb7.m41135l(C32349Dd7.class, c32349Dd7);
    }

    private C32349Dd7() {
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
                    return new C32115Cd7(null);
                }
                return new C32349Dd7();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0002\u0000\u0001\u0005\u0006\u0002\u0000\u0000\u0000\u0005ဇ\u0000\u0006ဇ\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        return (byte) 1;
    }
}
