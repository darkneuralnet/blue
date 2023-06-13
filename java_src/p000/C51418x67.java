package p000;
/* renamed from: x67 */
/* loaded from: classes5.dex */
public final class C51418x67 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C51418x67 zbb;
    private C49047t67 zbj;
    private int zbl;
    private int zbm;
    private C44907m77 zbn;
    private C46093o77 zbo;
    private I67 zbr;
    private int zbs;
    private byte zbv = 2;
    private String zbd = "";
    private String zbe = "";
    private InterfaceC46367ob7 zbf = AbstractC41030fb7.m41147C();
    private InterfaceC46367ob7 zbg = AbstractC41030fb7.m41147C();
    private InterfaceC46367ob7 zbh = AbstractC41030fb7.m41147C();
    private InterfaceC46367ob7 zbi = AbstractC41030fb7.m41147C();
    private InterfaceC46367ob7 zbk = AbstractC41030fb7.m41147C();
    private InterfaceC46367ob7 zbp = AbstractC41030fb7.m41147C();
    private String zbq = "";
    private InterfaceC46367ob7 zbt = AbstractC41030fb7.m41147C();
    private InterfaceC46367ob7 zbu = AbstractC41030fb7.m41147C();

    static {
        C51418x67 c51418x67 = new C51418x67();
        zbb = c51418x67;
        AbstractC41030fb7.m41135l(C51418x67.class, c51418x67);
    }

    private C51418x67() {
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
                            this.zbv = b;
                            return null;
                        }
                        return zbb;
                    }
                    return new C50825w67(null);
                }
                return new C51418x67();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0000\u0012\u0000\u0000\u0001ϭ\u0012\u0000\b\u0003\u0001Ȉ\u0002Ȉ\u0003Ț\u0004Ț\u0005Ț\u0006Ț\u0007Љ\b\u001b\t\u0004\n\u0004\u000bЉ\fЉ\r\u001b\u000eȈ\u000f\t\u0010\u0004\u0011ȚϭȚ", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi", "zbj", "zbk", C43985ka7.class, "zbl", "zbm", "zbn", "zbo", "zbp", G67.class, "zbq", "zbr", "zbs", "zbt", "zbu"});
        }
        return Byte.valueOf(this.zbv);
    }
}
