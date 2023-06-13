package p000;
/* renamed from: f87  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C40766f87 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C40766f87 zbb;
    private int zbd;
    private C39581d87 zbe;
    private double zbf;
    private boolean zbg;
    private C44917m87 zbh;
    private byte zbi = 2;

    static {
        C40766f87 c40766f87 = new C40766f87();
        zbb = c40766f87;
        AbstractC41030fb7.m41135l(C40766f87.class, c40766f87);
    }

    private C40766f87() {
    }

    /* renamed from: F */
    public static C40766f87 m41954F() {
        return zbb;
    }

    /* renamed from: G */
    public final C44917m87 m41953G() {
        C44917m87 c44917m87 = this.zbh;
        return c44917m87 == null ? C44917m87.m26284K() : c44917m87;
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
                            this.zbi = b;
                            return null;
                        }
                        return zbb;
                    }
                    return new C40173e87(null);
                }
                return new C40766f87();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဉ\u0000\u0002က\u0001\u0003ဇ\u0002\u0004ᐉ\u0003", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh"});
        }
        return Byte.valueOf(this.zbi);
    }
}
