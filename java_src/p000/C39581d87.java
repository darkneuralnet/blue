package p000;
/* renamed from: d87  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C39581d87 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C39581d87 zbb;
    private InterfaceC46367ob7 zbd = AbstractC41030fb7.m41147C();

    static {
        C39581d87 c39581d87 = new C39581d87();
        zbb = c39581d87;
        AbstractC41030fb7.m41135l(C39581d87.class, c39581d87);
    }

    private C39581d87() {
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
                    return new C37784a87(null);
                }
                return new C39581d87();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zbd", C38970c87.class});
        }
        return (byte) 1;
    }
}
