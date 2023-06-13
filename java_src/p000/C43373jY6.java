package p000;
/* renamed from: jY6 */
/* loaded from: classes6.dex */
public final class C43373jY6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C43373jY6 zbb;
    private Object zbe;
    private int zbd = 0;
    private byte zbg = 2;
    private InterfaceC46367ob7 zbf = AbstractC41030fb7.m41147C();

    static {
        C43373jY6 c43373jY6 = new C43373jY6();
        zbb = c43373jY6;
        AbstractC41030fb7.m41135l(C43373jY6.class, c43373jY6);
    }

    private C43373jY6() {
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
                    return new C42187hY6(null);
                }
                return new C43373jY6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0002\u0001\u0000\u0001\u0003\u0002\u0000\u0001\u0001\u0001:\u0000\u0003Л", new Object[]{"zbe", "zbd", "zbf", OS6.class});
        }
        return Byte.valueOf(this.zbg);
    }
}
