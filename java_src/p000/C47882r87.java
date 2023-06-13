package p000;
/* renamed from: r87  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C47882r87 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C47882r87 zbb;
    private C50252v87 zbd;
    private double zbe;
    private double zbf;

    static {
        C47882r87 c47882r87 = new C47882r87();
        zbb = c47882r87;
        AbstractC41030fb7.m41135l(C47882r87.class, c47882r87);
    }

    private C47882r87() {
    }

    /* renamed from: E */
    public static C47289q87 m16439E() {
        return (C47289q87) zbb.m41128u();
    }

    /* renamed from: G */
    public static /* synthetic */ void m16437G(C47882r87 c47882r87, C50252v87 c50252v87) {
        c50252v87.getClass();
        c47882r87.zbd = c50252v87;
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
                    return new C47289q87(null);
                }
                return new C47882r87();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u0000\u0003\u0000", new Object[]{"zbd", "zbe", "zbf"});
        }
        return (byte) 1;
    }
}
