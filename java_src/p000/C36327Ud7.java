package p000;
/* renamed from: Ud7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36327Ud7 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C36327Ud7 zbb;
    private int zbd;
    private int zbe;

    static {
        C36327Ud7 c36327Ud7 = new C36327Ud7();
        zbb = c36327Ud7;
        AbstractC41030fb7.m41135l(C36327Ud7.class, c36327Ud7);
    }

    private C36327Ud7() {
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
                    return new C36093Td7(null);
                }
                return new C36327Ud7();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"zbd", "zbe"});
        }
        return (byte) 1;
    }
}
