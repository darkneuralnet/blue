package p000;
@Deprecated
/* renamed from: c77 */
/* loaded from: classes5.dex */
public final class C38960c77 extends AbstractC39234cb7 {
    private static final C38960c77 zbd;
    private int zbe;
    private byte zbg = 2;
    private boolean zbf = true;

    static {
        C38960c77 c38960c77 = new C38960c77();
        zbd = c38960c77;
        AbstractC41030fb7.m41135l(C38960c77.class, c38960c77);
    }

    private C38960c77() {
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
                    return new C38367b77(null);
                }
                return new C38960c77();
            }
            return AbstractC41030fb7.m41144c(zbd, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"zbe", "zbf"});
        }
        return Byte.valueOf(this.zbg);
    }
}
