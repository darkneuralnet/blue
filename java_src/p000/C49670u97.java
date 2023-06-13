package p000;
/* renamed from: u97  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C49670u97 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C49670u97 zbb;
    private int zbd;
    private float zbf;
    private String zbe = "";
    private String zbg = "";

    static {
        C49670u97 c49670u97 = new C49670u97();
        zbb = c49670u97;
        AbstractC41030fb7.m41135l(C49670u97.class, c49670u97);
    }

    private C49670u97() {
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
                    return new C49077t97(null);
                }
                return new C49670u97();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001\u0003ဈ\u0002", new Object[]{"zbd", "zbe", "zbf", "zbg"});
        }
        return (byte) 1;
    }
}
