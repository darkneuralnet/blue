package p000;
/* renamed from: ge7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C41653ge7 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C41653ge7 zbb;
    private int zbd;
    private int zbg;
    private String zbe = "";
    private String zbf = "";
    private String zbh = "";

    static {
        C41653ge7 c41653ge7 = new C41653ge7();
        zbb = c41653ge7;
        AbstractC41030fb7.m41135l(C41653ge7.class, c41653ge7);
    }

    private C41653ge7() {
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
                    return new C41060fe7(null);
                }
                return new C41653ge7();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဈ\u0003", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh"});
        }
        return (byte) 1;
    }
}
