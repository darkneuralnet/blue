package p000;
/* renamed from: oR6 */
/* loaded from: classes5.dex */
public final class C46275oR6 extends AbstractC39234cb7 {
    private static final C46275oR6 zbd;
    private int zbe;
    private Object zbg;
    private int zbi;
    private int zbj;
    private int zbk;
    private int zbf = 0;
    private byte zbl = 2;
    private String zbh = "";

    static {
        C46275oR6 c46275oR6 = new C46275oR6();
        zbd = c46275oR6;
        AbstractC41030fb7.m41135l(C46275oR6.class, c46275oR6);
    }

    private C46275oR6() {
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
                        return zbd;
                    }
                    return new C45682nR6(null);
                }
                return new C46275oR6();
            }
            return AbstractC41030fb7.m41144c(zbd, "\u0001\u0007\u0001\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0006=\u0000\u0007=\u0000\b6\u0000", new Object[]{"zbg", "zbf", "zbe", "zbh", "zbi", "zbj", "zbk"});
        }
        return Byte.valueOf(this.zbl);
    }
}
