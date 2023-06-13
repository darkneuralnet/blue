package p000;
/* renamed from: kU6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C43930kU6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C43930kU6 zbb;
    private int zbd;
    private double zbe;
    private double zbf;
    private double zbh;
    private boolean zbi;
    private double zbj;
    private double zbk;
    private byte zbl = 2;
    private String zbg = "";

    static {
        C43930kU6 c43930kU6 = new C43930kU6();
        zbb = c43930kU6;
        AbstractC41030fb7.m41135l(C43930kU6.class, c43930kU6);
    }

    private C43930kU6() {
    }

    @Override // p000.AbstractC41030fb7
    /* renamed from: p */
    public final Object mo1009p(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            if (obj == null) {
                                b = 0;
                            }
                            this.zbl = b;
                            return null;
                        }
                        return zbb;
                    }
                    return new C43337jU6(null);
                }
                return new C43930kU6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0002\u0001ᔀ\u0000\u0002ᔀ\u0001\u0004က\u0005\u0005က\u0006\u0006ဇ\u0004\u0007က\u0003\bဈ\u0002", new Object[]{"zbd", "zbe", "zbf", "zbj", "zbk", "zbi", "zbh", "zbg"});
        }
        return Byte.valueOf(this.zbl);
    }
}
