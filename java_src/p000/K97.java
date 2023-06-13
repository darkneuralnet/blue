package p000;
/* renamed from: K97 */
/* loaded from: classes5.dex */
public final class K97 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final K97 zbb;
    private int zbA;
    private float zbB;
    private float zbD;
    private int zbE;
    private int zbd;
    private H87 zbf;
    private H87 zbg;
    private float zbi;
    private boolean zbl;
    private boolean zbn;
    private boolean zbq;
    private boolean zbr;
    private int zbs;
    private int zbt;
    private int zbu;
    private int zbv;
    private int zbw;
    private int zbx;
    private float zbz;
    private byte zbF = 2;
    private InterfaceC46367ob7 zbe = AbstractC41030fb7.m41147C();
    private String zbh = "";
    private InterfaceC46367ob7 zbj = AbstractC41030fb7.m41147C();
    private InterfaceC46367ob7 zbk = AbstractC41030fb7.m41147C();
    private String zbm = "";
    private InterfaceC46367ob7 zbo = AbstractC41030fb7.m41147C();
    private boolean zbp = true;
    private String zby = "";
    private int zbC = 1;

    static {
        K97 k97 = new K97();
        zbb = k97;
        AbstractC41030fb7.m41135l(K97.class, k97);
    }

    private K97() {
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
                        return zbb;
                    }
                    return new J97(null);
                }
                return new K97();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u001b\u0000\u0001\u0001\u001b\u001b\u0000\u0004\u0004\u0001Л\u0002ᔉ\u0000\u0003ᐉ\u0001\u0004ဈ\u0002\u0005ခ\u0003\u0006\u001b\u0007ဇ\u0004\bဈ\u0005\tЛ\nဇ\u0006\u000b\u001b\fဇ\u0007\rဇ\b\u000eဇ\t\u000fင\u000b\u0010င\f\u0011င\r\u0012င\u000e\u0013င\u000f\u0014ဈ\u0010\u0015ခ\u0011\u0016ဌ\u0012\u0017ဌ\u0014\u0018ခ\u0013\u0019ခ\u0015\u001aင\u0016\u001bင\n", new Object[]{"zbd", "zbe", C50855w97.class, "zbf", "zbg", "zbh", "zbi", "zbk", M87.class, "zbl", "zbm", "zbj", O87.class, "zbn", "zbo", C49670u97.class, "zbp", "zbq", "zbr", "zbt", "zbu", "zbv", "zbw", "zbx", "zby", "zbz", "zbA", C52203yR6.m3480a(), "zbC", C40776f97.f79550a, "zbB", "zbD", "zbE", "zbs"});
        }
        return Byte.valueOf(this.zbF);
    }
}
