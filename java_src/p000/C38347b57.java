package p000;
/* renamed from: b57  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C38347b57 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C38347b57 zbb;
    private int zbd;
    private InterfaceC46367ob7 zbe = AbstractC41030fb7.m41147C();
    private String zbf = "";

    static {
        C38347b57 c38347b57 = new C38347b57();
        zbb = c38347b57;
        AbstractC41030fb7.m41135l(C38347b57.class, c38347b57);
    }

    private C38347b57() {
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
                    return new C37754a57(null);
                }
                return new C38347b57();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000", new Object[]{"zbd", "zbe", Y47.class, "zbf"});
        }
        return (byte) 1;
    }
}
