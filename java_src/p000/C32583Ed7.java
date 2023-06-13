package p000;
/* renamed from: Ed7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C32583Ed7 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C32583Ed7 zbb;
    private InterfaceC46367ob7 zbd = AbstractC41030fb7.m41147C();

    static {
        C32583Ed7 c32583Ed7 = new C32583Ed7();
        zbb = c32583Ed7;
        AbstractC41030fb7.m41135l(C32583Ed7.class, c32583Ed7);
    }

    private C32583Ed7() {
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
                    return new C38661bd7(null);
                }
                return new C32583Ed7();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zbd", ER6.class});
        }
        return (byte) 1;
    }
}
