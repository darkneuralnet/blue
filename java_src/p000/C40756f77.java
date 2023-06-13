package p000;
/* renamed from: f77 */
/* loaded from: classes5.dex */
public final class C40756f77 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C40756f77 zbb;
    private int zbd;
    private L67 zbh;
    private byte zbi = 2;
    private String zbe = "";
    private InterfaceC46367ob7 zbf = AbstractC41030fb7.m41147C();
    private InterfaceC46367ob7 zbg = AbstractC41030fb7.m41147C();

    static {
        C40756f77 c40756f77 = new C40756f77();
        zbb = c40756f77;
        AbstractC41030fb7.m41135l(C40756f77.class, c40756f77);
    }

    private C40756f77() {
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
                            this.zbi = b;
                            return null;
                        }
                        return zbb;
                    }
                    return new C40163e77(null);
                }
                return new C40756f77();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0004\u0000\u0001\u0001Ϫ\u0004\u0000\u0002\u0001\u0001ဈ\u0000\u0002\u001a\u0003ᐉ\u0001Ϫ\u001a", new Object[]{"zbd", "zbe", "zbf", "zbh", "zbg"});
        }
        return Byte.valueOf(this.zbi);
    }
}
