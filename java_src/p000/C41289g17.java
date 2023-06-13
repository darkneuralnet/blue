package p000;
/* renamed from: g17  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C41289g17 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C41289g17 zbb;
    private InterfaceC46367ob7 zbd = AbstractC41030fb7.m41147C();

    static {
        C41289g17 c41289g17 = new C41289g17();
        zbb = c41289g17;
        AbstractC41030fb7.m41135l(C41289g17.class, c41289g17);
    }

    private C41289g17() {
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
                    return new C37714a17(null);
                }
                return new C41289g17();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zbd", C40103e17.class});
        }
        return (byte) 1;
    }
}
