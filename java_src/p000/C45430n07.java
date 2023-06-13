package p000;
/* renamed from: n07  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C45430n07 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C45430n07 zbb;
    private InterfaceC46367ob7 zbd = AbstractC41030fb7.m41147C();

    static {
        C45430n07 c45430n07 = new C45430n07();
        zbb = c45430n07;
        AbstractC41030fb7.m41135l(C45430n07.class, c45430n07);
    }

    private C45430n07() {
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
                    return new C41872h07(null);
                }
                return new C45430n07();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zbd", C44244l07.class});
        }
        return (byte) 1;
    }
}
