package p000;
/* renamed from: mX6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C45143mX6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C45143mX6 zbb;

    static {
        C45143mX6 c45143mX6 = new C45143mX6();
        zbb = c45143mX6;
        AbstractC41030fb7.m41135l(C45143mX6.class, c45143mX6);
    }

    private C45143mX6() {
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
                    return new C44550lX6(null);
                }
                return new C45143mX6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0000\u0000", null);
        }
        return (byte) 1;
    }
}
