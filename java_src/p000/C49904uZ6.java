package p000;
/* renamed from: uZ6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C49904uZ6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C49904uZ6 zbb;
    private int zbd;
    private Object zbf;
    private W07 zbg;
    private boolean zbh;
    private C41902h37 zbi;
    private F27 zbj;
    private C49580u07 zbk;
    private int zbl;
    private int zbe = 0;
    private byte zbm = 2;

    static {
        C49904uZ6 c49904uZ6 = new C49904uZ6();
        zbb = c49904uZ6;
        AbstractC41030fb7.m41135l(C49904uZ6.class, c49904uZ6);
    }

    private C49904uZ6() {
    }

    /* renamed from: F */
    public static C46347oZ6 m10061F() {
        return (C46347oZ6) zbb.m41128u();
    }

    /* renamed from: H */
    public static /* synthetic */ void m10059H(C49904uZ6 c49904uZ6, F27 f27) {
        f27.getClass();
        c49904uZ6.zbj = f27;
        c49904uZ6.zbd |= 8;
    }

    /* renamed from: I */
    public static /* synthetic */ void m10058I(C49904uZ6 c49904uZ6, W07 w07) {
        w07.getClass();
        c49904uZ6.zbg = w07;
        c49904uZ6.zbd |= 1;
    }

    /* renamed from: E */
    public final int m10062E() {
        return this.zbl;
    }

    /* renamed from: J */
    public final boolean m10057J() {
        if (this.zbe == 6) {
            return ((Boolean) this.zbf).booleanValue();
        }
        return false;
    }

    /* renamed from: K */
    public final boolean m10056K() {
        if (this.zbe == 5) {
            return ((Boolean) this.zbf).booleanValue();
        }
        return false;
    }

    /* renamed from: L */
    public final boolean m10055L() {
        return (this.zbd & 32) != 0;
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
                            this.zbm = b;
                            return null;
                        }
                        return zbb;
                    }
                    return new C46347oZ6(null);
                }
                return new C49904uZ6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဇ\u0001\u0003ဉ\u0003\u0004ဉ\u0002\u0005:\u0000\u0006:\u0000\u0007ဉ\u0004\bင\u0005", new Object[]{"zbf", "zbe", "zbd", "zbg", "zbh", "zbj", "zbi", "zbk", "zbl"});
        }
        return Byte.valueOf(this.zbm);
    }
}
