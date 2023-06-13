package p000;
/* renamed from: o77 */
/* loaded from: classes5.dex */
public final class C46093o77 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C46093o77 zbb;
    private int zbd;
    private L67 zbg;
    private byte zbh = 2;
    private String zbe = "InOrderOutputStreamHandler";
    private InterfaceC46367ob7 zbf = AbstractC41030fb7.m41147C();

    static {
        C46093o77 c46093o77 = new C46093o77();
        zbb = c46093o77;
        AbstractC41030fb7.m41135l(C46093o77.class, c46093o77);
    }

    private C46093o77() {
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
                            this.zbh = b;
                            return null;
                        }
                        return zbb;
                    }
                    return new C45500n77(null);
                }
                return new C46093o77();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ဈ\u0000\u0002\u001a\u0003ᐉ\u0001", new Object[]{"zbd", "zbe", "zbf", "zbg"});
        }
        return Byte.valueOf(this.zbh);
    }
}
