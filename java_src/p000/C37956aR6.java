package p000;
/* renamed from: aR6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C37956aR6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C37956aR6 zbb;
    private int zbd;
    private int zbe;
    private int zbf;
    private byte zbg = 2;

    static {
        C37956aR6 c37956aR6 = new C37956aR6();
        zbb = c37956aR6;
        AbstractC41030fb7.m41135l(C37956aR6.class, c37956aR6);
    }

    private C37956aR6() {
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
                            this.zbg = b;
                            return null;
                        }
                        return zbb;
                    }
                    return new ZQ6(null);
                }
                return new C37956aR6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔄ\u0000\u0002ᔄ\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        return Byte.valueOf(this.zbg);
    }
}
