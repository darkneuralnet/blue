package p000;
/* renamed from: kS6 */
/* loaded from: classes5.dex */
public final class C43912kS6 extends AbstractC39234cb7 {
    private static final C43912kS6 zbd;
    private int zbe;
    private ZR6 zbf;
    private float zbh;
    private float zbi;
    private float zbj;
    private float zbk;
    private float zbl;
    private long zbo;
    private long zbp;
    private long zbq;
    private float zbr;
    private byte zbs = 2;
    private InterfaceC46367ob7 zbg = AbstractC41030fb7.m41147C();
    private InterfaceC46367ob7 zbm = AbstractC41030fb7.m41147C();
    private InterfaceC46367ob7 zbn = AbstractC41030fb7.m41147C();

    static {
        C43912kS6 c43912kS6 = new C43912kS6();
        zbd = c43912kS6;
        AbstractC41030fb7.m41135l(C43912kS6.class, c43912kS6);
    }

    private C43912kS6() {
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
                            this.zbs = b;
                            return null;
                        }
                        return zbd;
                    }
                    return new C37965aS6(null);
                }
                return new C43912kS6();
            }
            return AbstractC41030fb7.m41144c(zbd, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0003\u0000\u0001ဉ\u0000\u0002\u001b\u0003ခ\u0001\u0004ခ\u0002\u0005ခ\u0003\u0006ခ\u0004\u0007\u001b\b\u001b\tဃ\u0007\nခ\t\u000bဃ\b\fဃ\u0006\rခ\u0005", new Object[]{"zbe", "zbf", "zbg", C41540gS6.class, "zbh", "zbi", "zbj", "zbk", "zbm", C39151cS6.class, "zbn", XR6.class, "zbp", "zbr", "zbq", "zbo", "zbl"});
        }
        return Byte.valueOf(this.zbs);
    }
}
