package p000;
/* renamed from: e37  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C40123e37 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C40123e37 zbb;
    private int zbd;
    private float zbe = 0.7f;
    private int zbf = 2;
    private float zbg = 0.2f;

    static {
        C40123e37 c40123e37 = new C40123e37();
        zbb = c40123e37;
        AbstractC41030fb7.m41135l(C40123e37.class, c40123e37);
    }

    private C40123e37() {
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
                    return new C39531d37(null);
                }
                return new C40123e37();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ခ\u0000\u0002င\u0001\u0003ခ\u0002", new Object[]{"zbd", "zbe", "zbf", "zbg"});
        }
        return (byte) 1;
    }
}
