package p000;
/* renamed from: S87 */
/* loaded from: classes5.dex */
public final class S87 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final S87 zbb;
    private InterfaceC46367ob7 zbd = AbstractC41030fb7.m41147C();

    static {
        S87 s87 = new S87();
        zbb = s87;
        AbstractC41030fb7.m41135l(S87.class, s87);
    }

    private S87() {
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
                    return new P87(null);
                }
                return new S87();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zbd", R87.class});
        }
        return (byte) 1;
    }
}
