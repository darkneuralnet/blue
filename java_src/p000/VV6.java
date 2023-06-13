package p000;
/* renamed from: VV6 */
/* loaded from: classes5.dex */
public final class VV6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final VV6 zbb;
    private InterfaceC46367ob7 zbd = AbstractC41030fb7.m41147C();

    static {
        VV6 vv6 = new VV6();
        zbb = vv6;
        AbstractC41030fb7.m41135l(VV6.class, vv6);
    }

    private VV6() {
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
                    return new UV6(null);
                }
                return new VV6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zbd", SV6.class});
        }
        return (byte) 1;
    }
}
