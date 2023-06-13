package p000;
/* renamed from: f47 */
/* loaded from: classes5.dex */
public final class C40726f47 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C40726f47 zbb;
    private int zbd;
    private Object zbf;
    private boolean zbg;
    private long zbi;
    private float zbl;
    private float zbm;
    private float zbn;
    private int zbe = 0;
    private byte zbo = 2;
    private InterfaceC46367ob7 zbh = AbstractC41030fb7.m41147C();
    private InterfaceC43995kb7 zbj = AbstractC41030fb7.m41123z();
    private float zbk = 0.15f;

    static {
        C40726f47 c40726f47 = new C40726f47();
        zbb = c40726f47;
        AbstractC41030fb7.m41135l(C40726f47.class, c40726f47);
    }

    private C40726f47() {
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
                            this.zbo = b;
                            return null;
                        }
                        return zbb;
                    }
                    return new C40133e47(null);
                }
                return new C40726f47();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\t\u0001\u0001\u0002\f\t\u0000\u0002\u0001\u0002м\u0000\u0003ဇ\u0000\u0004\u001b\u0005\u0013\u0006ခ\u0002\u0007ခ\u0003\bခ\u0004\u000bခ\u0005\fဂ\u0001", new Object[]{"zbf", "zbe", "zbd", E47.class, "zbg", "zbh", W37.class, "zbj", "zbk", "zbl", "zbm", "zbn", "zbi"});
        }
        return Byte.valueOf(this.zbo);
    }
}
