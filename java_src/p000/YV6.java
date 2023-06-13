package p000;
/* renamed from: YV6 */
/* loaded from: classes5.dex */
public final class YV6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final YV6 zbb;
    private String zbd = "";
    private String zbe = "";
    private double zbf;

    static {
        YV6 yv6 = new YV6();
        zbb = yv6;
        AbstractC41030fb7.m41135l(YV6.class, yv6);
    }

    private YV6() {
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
                    return new XV6(null);
                }
                return new YV6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0000\u0003Ȉ", new Object[]{"zbd", "zbf", "zbe"});
        }
        return (byte) 1;
    }
}
