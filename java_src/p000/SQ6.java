package p000;
/* renamed from: SQ6 */
/* loaded from: classes5.dex */
public final class SQ6 extends AbstractC39234cb7 {
    private static final SQ6 zbd;
    private int zbe;
    private double zbf;
    private int zbg;
    private int zbh;
    private double zbi;
    private double zbj;
    private byte zbk = 2;

    static {
        SQ6 sq6 = new SQ6();
        zbd = sq6;
        AbstractC41030fb7.m41135l(SQ6.class, sq6);
    }

    private SQ6() {
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
                            this.zbk = b;
                            return null;
                        }
                        return zbd;
                    }
                    return new RQ6(null);
                }
                return new SQ6();
            }
            return AbstractC41030fb7.m41144c(zbd, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001က\u0000\u0002င\u0001\u0003င\u0002\u0004က\u0003\u0005က\u0004", new Object[]{"zbe", "zbf", "zbg", "zbh", "zbi", "zbj"});
        }
        return Byte.valueOf(this.zbk);
    }
}
