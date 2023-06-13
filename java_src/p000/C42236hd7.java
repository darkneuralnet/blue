package p000;
/* renamed from: hd7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C42236hd7 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C42236hd7 zbb;
    private int zbd;
    private int zbe = -1;

    static {
        C42236hd7 c42236hd7 = new C42236hd7();
        zbb = c42236hd7;
        AbstractC41030fb7.m41135l(C42236hd7.class, c42236hd7);
    }

    private C42236hd7() {
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
                    return new C41643gd7(null);
                }
                return new C42236hd7();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"zbd", "zbe"});
        }
        return (byte) 1;
    }
}
