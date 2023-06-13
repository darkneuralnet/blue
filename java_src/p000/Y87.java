package p000;
/* renamed from: Y87 */
/* loaded from: classes5.dex */
public final class Y87 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final Y87 zbb;
    private int zbd;
    private C37794a97 zbe;
    private float zbf;
    private byte zbh = 2;
    private InterfaceC43995kb7 zbg = AbstractC41030fb7.m41123z();

    static {
        Y87 y87 = new Y87();
        zbb = y87;
        AbstractC41030fb7.m41135l(Y87.class, y87);
    }

    private Y87() {
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
                    return new X87(null);
                }
                return new Y87();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ᐉ\u0000\u0002ခ\u0001\u0003\u0013", new Object[]{"zbd", "zbe", "zbf", "zbg"});
        }
        return Byte.valueOf(this.zbh);
    }
}
