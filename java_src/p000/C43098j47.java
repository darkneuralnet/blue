package p000;
/* renamed from: j47  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C43098j47 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C43098j47 zbb;
    private int zbd;
    private int zbe;
    private int zbf;
    private int zbg;
    private String zbh = "";
    private String zbi = "";

    static {
        C43098j47 c43098j47 = new C43098j47();
        zbb = c43098j47;
        AbstractC41030fb7.m41135l(C43098j47.class, c43098j47);
    }

    private C43098j47() {
    }

    @Override // p000.AbstractC41030fb7
    /* renamed from: p */
    public final Object mo1009p(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zbb;
                    }
                    return new C42505i47(null);
                }
                return new C43098j47();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi"});
        }
        return (byte) 1;
    }
}
