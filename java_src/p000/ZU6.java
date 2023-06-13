package p000;
/* renamed from: ZU6 */
/* loaded from: classes5.dex */
public final class ZU6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final ZU6 zbb;
    private String zbd = "";
    private String zbe = "";
    private float zbf;

    static {
        ZU6 zu6 = new ZU6();
        zbb = zu6;
        AbstractC41030fb7.m41135l(ZU6.class, zu6);
    }

    private ZU6() {
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
                    return new VU6(null);
                }
                return new ZU6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        return (byte) 1;
    }
}
