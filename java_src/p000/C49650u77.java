package p000;
/* renamed from: u77  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C49650u77 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C49650u77 zbb;
    private InterfaceC46367ob7 zbd = AbstractC41030fb7.m41147C();

    static {
        C49650u77 c49650u77 = new C49650u77();
        zbb = c49650u77;
        AbstractC41030fb7.m41135l(C49650u77.class, c49650u77);
    }

    private C49650u77() {
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
                    return new C49057t77(null);
                }
                return new C49650u77();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zbd", C47872r77.class});
        }
        return (byte) 1;
    }
}
