package p000;
/* renamed from: Z97 */
/* loaded from: classes5.dex */
public final class Z97 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final Z97 zbb;
    private int zbd;
    private float zbe;
    private float zbf;
    private float zbg;
    private boolean zbl;
    private float zbm;
    private float zbn;
    private byte zbo = 2;
    private String zbh = "";
    private int zbi = -1;
    private float zbj = -1.0f;
    private float zbk = -1.0f;

    static {
        Z97 z97 = new Z97();
        zbb = z97;
        AbstractC41030fb7.m41135l(Z97.class, z97);
    }

    private Z97() {
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
                            this.zbo = b;
                            return null;
                        }
                        return zbb;
                    }
                    return new Y97(null);
                }
                return new Z97();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0000\u0001\u0001ᔁ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ဈ\u0003\u0005င\u0004\u0007ခ\u0005\bခ\u0006\tဇ\u0007\nခ\b\u000bခ\t", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi", "zbj", "zbk", "zbl", "zbm", "zbn"});
        }
        return Byte.valueOf(this.zbo);
    }
}
