package p000;
/* renamed from: y67 */
/* loaded from: classes5.dex */
public final class C52011y67 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C52011y67 zbb;
    private int zbg;
    private int zbm;
    private boolean zbn;
    private C44907m77 zbo;
    private C46093o77 zbp;
    private I67 zbr;
    private L67 zbu;
    private byte zbw = 2;
    private InterfaceC46367ob7 zbd = AbstractC41030fb7.m41147C();
    private InterfaceC46367ob7 zbe = AbstractC41030fb7.m41147C();
    private InterfaceC46367ob7 zbf = AbstractC41030fb7.m41147C();
    private InterfaceC46367ob7 zbh = AbstractC41030fb7.m41147C();
    private InterfaceC46367ob7 zbi = AbstractC41030fb7.m41147C();
    private InterfaceC46367ob7 zbj = AbstractC41030fb7.m41147C();
    private InterfaceC46367ob7 zbk = AbstractC41030fb7.m41147C();
    private InterfaceC46367ob7 zbl = AbstractC41030fb7.m41147C();
    private InterfaceC46367ob7 zbq = AbstractC41030fb7.m41147C();
    private String zbs = "";
    private String zbt = "";
    private InterfaceC46367ob7 zbv = AbstractC41030fb7.m41147C();

    static {
        C52011y67 c52011y67 = new C52011y67();
        zbb = c52011y67;
        AbstractC41030fb7.m41135l(C52011y67.class, c52011y67);
    }

    private C52011y67() {
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
                            this.zbw = b;
                            return null;
                        }
                        return zbb;
                    }
                    return new C50232v67(null);
                }
                return new C52011y67();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0000\u0013\u0000\u0000\u0001Ϫ\u0013\u0000\n\b\u0001Л\u0006Л\u0007Л\b\u0004\tЛ\nȚ\u000b\u0004\fЉ\rЉ\u000eЛ\u000fȚ\u0010Ț\u0011Ț\u0012\t\u0013Ȉ\u0014Ȉ\u0015\u0007ϩЉϪ\u001b", new Object[]{"zbd", C51418x67.class, "zbe", V67.class, "zbf", C37774a77.class, "zbg", "zbh", C40756f77.class, "zbi", "zbm", "zbo", "zbp", "zbq", A67.class, "zbj", "zbk", "zbl", "zbr", "zbs", "zbt", "zbn", "zbu", "zbv", C43985ka7.class});
        }
        return Byte.valueOf(this.zbw);
    }
}
