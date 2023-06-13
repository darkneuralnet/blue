package p000;
/* renamed from: sa7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48728sa7 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C48728sa7 zbb;
    private InterfaceC46367ob7 zbd = AbstractC41030fb7.m41147C();

    static {
        C48728sa7 c48728sa7 = new C48728sa7();
        zbb = c48728sa7;
        AbstractC41030fb7.m41135l(C48728sa7.class, c48728sa7);
    }

    private C48728sa7() {
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
                    return new P97(null);
                }
                return new C48728sa7();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zbd", C36777Wb7.class});
        }
        return (byte) 1;
    }
}
