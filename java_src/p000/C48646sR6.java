package p000;

import java.util.List;
/* renamed from: sR6 */
/* loaded from: classes5.dex */
public final class C48646sR6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C48646sR6 zbb;
    private byte zbe = 2;
    private InterfaceC46367ob7 zbd = AbstractC41030fb7.m41147C();

    static {
        C48646sR6 c48646sR6 = new C48646sR6();
        zbb = c48646sR6;
        AbstractC41030fb7.m41135l(C48646sR6.class, c48646sR6);
    }

    private C48646sR6() {
    }

    /* renamed from: F */
    public static C48646sR6 m14189F() {
        return zbb;
    }

    /* renamed from: G */
    public final List m14188G() {
        return this.zbd;
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
                            this.zbe = b;
                            return null;
                        }
                        return zbb;
                    }
                    return new C46868pR6(null);
                }
                return new C48646sR6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"zbd", C48054rR6.class});
        }
        return Byte.valueOf(this.zbe);
    }
}
