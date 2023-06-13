package p000;
/* renamed from: fV6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C40974fV6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C40974fV6 zbb;
    private int zbd = 0;
    private Object zbe;
    private float zbf;

    static {
        C40974fV6 c40974fV6 = new C40974fV6();
        zbb = c40974fV6;
        AbstractC41030fb7.m41135l(C40974fV6.class, c40974fV6);
    }

    private C40974fV6() {
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
                    return new C40381eV6(null);
                }
                return new C40974fV6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u00017\u0000\u00024\u0000\u0003Ȼ\u0000\u0004\u0001", new Object[]{"zbe", "zbd", "zbf"});
        }
        return (byte) 1;
    }
}
