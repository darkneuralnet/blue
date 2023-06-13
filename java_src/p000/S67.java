package p000;
/* renamed from: S67 */
/* loaded from: classes5.dex */
public final class S67 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final S67 zbb;
    private InterfaceC46367ob7 zbd = AbstractC41030fb7.m41147C();

    static {
        S67 s67 = new S67();
        zbb = s67;
        AbstractC41030fb7.m41135l(S67.class, s67);
    }

    private S67() {
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
                    return new P67(null);
                }
                return new S67();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zbd", R67.class});
        }
        return (byte) 1;
    }
}
