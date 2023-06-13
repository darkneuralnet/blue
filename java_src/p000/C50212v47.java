package p000;
/* renamed from: v47  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C50212v47 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C50212v47 zbb;
    private InterfaceC46367ob7 zbd = AbstractC41030fb7.m41147C();

    static {
        C50212v47 c50212v47 = new C50212v47();
        zbb = c50212v47;
        AbstractC41030fb7.m41135l(C50212v47.class, c50212v47);
    }

    private C50212v47() {
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
                    return new C49620u47(null);
                }
                return new C50212v47();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zbd", C48434s47.class});
        }
        return (byte) 1;
    }
}
