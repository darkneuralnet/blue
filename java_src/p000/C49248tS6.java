package p000;
/* renamed from: tS6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C49248tS6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C49248tS6 zbb;
    private int zbd;
    private float zbe;
    private float zbf;
    private float zbg;
    private float zbh;

    static {
        C49248tS6 c49248tS6 = new C49248tS6();
        zbb = c49248tS6;
        AbstractC41030fb7.m41135l(C49248tS6.class, c49248tS6);
    }

    private C49248tS6() {
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
                    return new C48655sS6(null);
                }
                return new C49248tS6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh"});
        }
        return (byte) 1;
    }
}
