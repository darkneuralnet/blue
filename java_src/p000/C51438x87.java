package p000;
/* renamed from: x87  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C51438x87 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C51438x87 zbb;
    private C43985ka7 zbd;

    static {
        C51438x87 c51438x87 = new C51438x87();
        zbb = c51438x87;
        AbstractC41030fb7.m41135l(C51438x87.class, c51438x87);
    }

    private C51438x87() {
    }

    /* renamed from: F */
    public static C51438x87 m5814F() {
        return zbb;
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
                    return new C50845w87(null);
                }
                return new C51438x87();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zbd"});
        }
        return (byte) 1;
    }
}
