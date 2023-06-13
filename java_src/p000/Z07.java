package p000;
/* renamed from: Z07 */
/* loaded from: classes5.dex */
public final class Z07 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final Z07 zbb;
    private int zbd;
    private int zbe;
    private String zbf = "";

    static {
        Z07 z07 = new Z07();
        zbb = z07;
        AbstractC41030fb7.m41135l(Z07.class, z07);
    }

    private Z07() {
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
                    return new V07(null);
                }
                return new Z07();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"zbd", "zbe", X07.f42467a, "zbf"});
        }
        return (byte) 1;
    }
}
