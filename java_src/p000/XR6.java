package p000;
/* renamed from: XR6 */
/* loaded from: classes5.dex */
public final class XR6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final XR6 zbb;
    private int zbd;
    private int zbe;
    private String zbf = "";
    private float zbg;
    private float zbh;

    static {
        XR6 xr6 = new XR6();
        zbb = xr6;
        AbstractC41030fb7.m41135l(XR6.class, xr6);
    }

    private XR6() {
    }

    /* renamed from: F */
    public static XR6 m77007F() {
        return zbb;
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
                    return new VR6(null);
                }
                return new XR6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{"zbd", "zbe", WR6.f41021a, "zbf", "zbg", "zbh"});
        }
        return (byte) 1;
    }
}