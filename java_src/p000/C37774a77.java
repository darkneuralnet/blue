package p000;
@Deprecated
/* renamed from: a77 */
/* loaded from: classes5.dex */
public final class C37774a77 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C37774a77 zbb;
    private int zbd;
    private C38960c77 zbj;
    private byte zbk = 2;
    private String zbe = "";
    private InterfaceC46367ob7 zbf = AbstractC41030fb7.m41147C();
    private InterfaceC46367ob7 zbg = AbstractC41030fb7.m41147C();
    private InterfaceC46367ob7 zbh = AbstractC41030fb7.m41147C();
    private InterfaceC46367ob7 zbi = AbstractC41030fb7.m41147C();

    static {
        C37774a77 c37774a77 = new C37774a77();
        zbb = c37774a77;
        AbstractC41030fb7.m41135l(C37774a77.class, c37774a77);
    }

    private C37774a77() {
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
                        return zbb;
                    }
                    return new Z67(null);
                }
                return new C37774a77();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0006\u0000\u0001\u0001ϫ\u0006\u0000\u0004\u0001\u0001ဈ\u0000\u0002\u001a\u0003\u001a\u0004ᐉ\u0001Ϫ\u001aϫ\u001a", new Object[]{"zbd", "zbe", "zbf", "zbh", "zbj", "zbg", "zbi"});
        }
        return Byte.valueOf(this.zbk);
    }
}
