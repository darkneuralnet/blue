package p000;
/* renamed from: t67 */
/* loaded from: classes5.dex */
public final class C49047t67 extends AbstractC39234cb7 {
    private static final C49047t67 zbd;
    private int zbe;
    private boolean zbf;
    private byte zbg = 2;

    static {
        C49047t67 c49047t67 = new C49047t67();
        zbd = c49047t67;
        AbstractC41030fb7.m41135l(C49047t67.class, c49047t67);
    }

    private C49047t67() {
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
                            this.zbg = b;
                            return null;
                        }
                        return zbd;
                    }
                    return new C48454s67(null);
                }
                return new C49047t67();
            }
            return AbstractC41030fb7.m41144c(zbd, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"zbe", "zbf"});
        }
        return Byte.valueOf(this.zbg);
    }
}
