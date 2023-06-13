package p000;
/* renamed from: fR6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C40938fR6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C40938fR6 zbb;
    private int zbd;
    private C44917m87 zbf;
    private byte zbg = 2;
    private InterfaceC46367ob7 zbe = AbstractC41030fb7.m41147C();

    static {
        C40938fR6 c40938fR6 = new C40938fR6();
        zbb = c40938fR6;
        AbstractC41030fb7.m41135l(C40938fR6.class, c40938fR6);
    }

    private C40938fR6() {
    }

    /* renamed from: G */
    public static C40938fR6 m41363G() {
        return zbb;
    }

    /* renamed from: E */
    public final C44917m87 m41365E() {
        C44917m87 c44917m87 = this.zbf;
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
                            this.zbg = b;
                            return null;
                        }
                        return zbb;
                    }
                    return new C40345eR6(null);
                }
                return new C40938fR6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001Л\u0002ᐉ\u0000", new Object[]{"zbd", "zbe", C37956aR6.class, "zbf"});
        }
        return Byte.valueOf(this.zbg);
    }
}
