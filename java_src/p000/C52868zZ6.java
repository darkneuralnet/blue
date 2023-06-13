package p000;
/* renamed from: zZ6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C52868zZ6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C52868zZ6 zbb;
    private int zbd;
    private String zbe = "";
    private String zbf = "";

    static {
        C52868zZ6 c52868zZ6 = new C52868zZ6();
        zbb = c52868zZ6;
        AbstractC41030fb7.m41135l(C52868zZ6.class, c52868zZ6);
    }

    private C52868zZ6() {
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
                    return new C51682xZ6(null);
                }
                return new C52868zZ6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        return (byte) 1;
    }
}
