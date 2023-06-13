package p000;
/* renamed from: m77 */
/* loaded from: classes5.dex */
public final class C44907m77 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C44907m77 zbb;
    private int zbd;
    private L67 zbf;
    private byte zbg = 2;
    private String zbe = "DefaultInputStreamHandler";

    static {
        C44907m77 c44907m77 = new C44907m77();
        zbb = c44907m77;
        AbstractC41030fb7.m41135l(C44907m77.class, c44907m77);
    }

    private C44907m77() {
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
                    return new C44314l77(null);
                }
                return new C44907m77();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0003ᐉ\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        return Byte.valueOf(this.zbg);
    }
}
