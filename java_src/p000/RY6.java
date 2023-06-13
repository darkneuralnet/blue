package p000;
/* renamed from: RY6 */
/* loaded from: classes5.dex */
public final class RY6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final RY6 zbb;
    private int zbd;
    private float zbh;
    private byte zbi = 2;
    private String zbe = "";
    private String zbf = "";
    private InterfaceC46367ob7 zbg = AbstractC41030fb7.m41147C();

    static {
        RY6 ry6 = new RY6();
        zbb = ry6;
        AbstractC41030fb7.m41135l(RY6.class, ry6);
    }

    private RY6() {
    }

    @Override // p000.AbstractC41030fb7
    /* renamed from: p */
    public final Object mo1009p(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            if (obj == null) {
                                b = 0;
                            }
                            this.zbi = b;
                            return null;
                        }
                        return zbb;
                    }
                    return new PY6(null);
                }
                return new RY6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003Л\u0004ခ\u0002", new Object[]{"zbd", "zbe", "zbf", "zbg", C50855w97.class, "zbh"});
        }
        return Byte.valueOf(this.zbi);
    }
}
