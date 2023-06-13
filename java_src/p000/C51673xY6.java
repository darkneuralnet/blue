package p000;
/* renamed from: xY6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C51673xY6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C51673xY6 zbb;
    private int zbd;
    private String zbe = "";
    private String zbf = "";
    private String zbg = "";

    static {
        C51673xY6 c51673xY6 = new C51673xY6();
        zbb = c51673xY6;
        AbstractC41030fb7.m41135l(C51673xY6.class, c51673xY6);
    }

    private C51673xY6() {
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
                    return new C50487vY6(null);
                }
                return new C51673xY6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"zbd", "zbe", "zbf", "zbg"});
        }
        return (byte) 1;
    }
}
