package p000;
/* renamed from: jR6 */
/* loaded from: classes5.dex */
public final class C43310jR6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C43310jR6 zbb;
    private int zbd;
    private C44917m87 zbf;
    private float zbg;
    private byte zbh = 2;
    private int zbe = 2;

    static {
        C43310jR6 c43310jR6 = new C43310jR6();
        zbb = c43310jR6;
        AbstractC41030fb7.m41135l(C43310jR6.class, c43310jR6);
    }

    private C43310jR6() {
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
                            this.zbh = b;
                            return null;
                        }
                        return zbb;
                    }
                    return new C42717iR6(null);
                }
                return new C43310jR6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0003\u0000\u0001\u0001\u0007\u0003\u0000\u0000\u0001\u0001ဌ\u0000\u0002ᐉ\u0001\u0007ခ\u0002", new Object[]{"zbd", "zbe", C42124hR6.f85241a, "zbf", "zbg"});
        }
        return Byte.valueOf(this.zbh);
    }
}
