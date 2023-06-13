package p000;
/* renamed from: LZ6 */
/* loaded from: classes5.dex */
public final class LZ6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final LZ6 zbb;
    private int zbd;
    private String zbe = "";
    private String zbf = "";

    static {
        LZ6 lz6 = new LZ6();
        zbb = lz6;
        AbstractC41030fb7.m41135l(LZ6.class, lz6);
    }

    private LZ6() {
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
                    return new JZ6(null);
                }
                return new LZ6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        return (byte) 1;
    }
}
