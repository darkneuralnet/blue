package p000;
/* renamed from: iZ6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C42789iZ6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C42789iZ6 zbb;
    private int zbd;
    private InterfaceC46367ob7 zbe = AbstractC41030fb7.m41147C();
    private long zbf;

    static {
        C42789iZ6 c42789iZ6 = new C42789iZ6();
        zbb = c42789iZ6;
        AbstractC41030fb7.m41135l(C42789iZ6.class, c42789iZ6);
    }

    private C42789iZ6() {
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
                    return new C41603gZ6(null);
                }
                return new C42789iZ6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဂ\u0000", new Object[]{"zbd", "zbe", "zbf"});
        }
        return (byte) 1;
    }
}
