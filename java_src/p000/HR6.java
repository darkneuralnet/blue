package p000;
/* renamed from: HR6 */
/* loaded from: classes5.dex */
public final class HR6 extends AbstractC39234cb7 {
    private static final HR6 zbd;
    private int zbC;
    private C45089mR6 zbD;
    private WQ6 zbE;
    private int zbe;
    private C41531gR6 zbh;
    private C46275oR6 zbi;
    private int zbk;
    private C43731k87 zbl;
    private float zbm;
    private float zbn;
    private float zbo;
    private float zbp;
    private C48646sR6 zbr;
    private C43310jR6 zbt;
    private C50424vR6 zbu;
    private DR6 zbv;
    private int zbw;
    private long zbx;
    private C43985ka7 zby;
    private byte zbF = 2;
    private int zbf = -1;
    private InterfaceC44588lb7 zbg = AbstractC41030fb7.m41149A();
    private int zbj = 2;
    private String zbq = "";
    private String zbs = "";
    private String zbz = "";
    private InterfaceC46367ob7 zbA = AbstractC41030fb7.m41147C();
    private InterfaceC43995kb7 zbB = AbstractC41030fb7.m41123z();

    static {
        HR6 hr6 = new HR6();
        zbd = hr6;
        AbstractC41030fb7.m41135l(HR6.class, hr6);
    }

    private HR6() {
    }

    /* renamed from: F */
    public final String m103857F() {
        return this.zbs;
    }

    /* renamed from: G */
    public final int m103856G() {
        int m114035a = BR6.m114035a(this.zbj);
        if (m114035a == 0) {
            return 3;
        }
        return m114035a;
    }

    /* renamed from: H */
    public final float m103855H() {
        return this.zbp;
    }

    /* renamed from: I */
    public final int m103854I() {
        return this.zbf;
    }

    /* renamed from: J */
    public final C41531gR6 m103853J() {
        C41531gR6 c41531gR6 = this.zbh;
        return c41531gR6 == null ? C41531gR6.m39461J() : c41531gR6;
    }

    /* renamed from: K */
    public final C48646sR6 m103852K() {
        C48646sR6 c48646sR6 = this.zbr;
        return c48646sR6 == null ? C48646sR6.m14189F() : c48646sR6;
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
                            this.zbF = b;
                            return null;
                        }
                        return zbd;
                    }
                    return new C49239tR6(null);
                }
                return new HR6();
            }
            return AbstractC41030fb7.m41144c(zbd, "\u0001\u001a\u0000\u0001\u0001\u001e\u001a\u0000\u0003\u0005\u0001င\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ဌ\u0003\u0005ဌ\u0004\u0006ဉ\u0005\u0007ခ\t\bဈ\n\rᐉ\u000b\u000eခ\u0006\u000fဈ\f\u0010ᐉ\r\u0011ဉ\u000e\u0012ဉ\u000f\u0013င\u0010\u0014ဂ\u0011\u0015ဉ\u0012\u0016ခ\b\u0017ဈ\u0013\u0018\u001a\u0019\u0013\u001aင\u0014\u001bခ\u0007\u001cဉ\u0015\u001d'\u001eᐉ\u0016", new Object[]{"zbe", "zbf", "zbh", "zbi", "zbj", AR6.f562a, "zbk", C51610xR6.f117621a, "zbl", "zbp", "zbq", "zbr", "zbm", "zbs", "zbt", "zbu", "zbv", "zbw", "zbx", "zby", "zbo", "zbz", "zbA", "zbB", "zbC", "zbn", "zbD", "zbg", "zbE"});
        }
        return Byte.valueOf(this.zbF);
    }
}
