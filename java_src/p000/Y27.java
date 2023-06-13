package p000;
/* renamed from: Y27 */
/* loaded from: classes5.dex */
public final class Y27 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final Y27 zbb;
    private int zbd;
    private String zbe = "";
    private String zbf = "";

    static {
        Y27 y27 = new Y27();
        zbb = y27;
        AbstractC41030fb7.m41135l(Y27.class, y27);
    }

    private Y27() {
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
                    return new X27(null);
                }
                return new Y27();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        return (byte) 1;
    }
}
