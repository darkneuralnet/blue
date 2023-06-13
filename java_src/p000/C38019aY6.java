package p000;
/* renamed from: aY6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C38019aY6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C38019aY6 zbb;
    private int zbd;
    private float zbe = 50.0f;
    private int zbf = 1;

    static {
        C38019aY6 c38019aY6 = new C38019aY6();
        zbb = c38019aY6;
        AbstractC41030fb7.m41135l(C38019aY6.class, c38019aY6);
    }

    private C38019aY6() {
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
                    return new XX6(null);
                }
                return new C38019aY6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002င\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        return (byte) 1;
    }
}
