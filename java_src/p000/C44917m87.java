package p000;
/* renamed from: m87  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C44917m87 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C44917m87 zbb;
    private int zbd;
    private int zbe;
    private int zbf;
    private int zbg;
    private int zbh;
    private float zbi;
    private byte zbj = 2;

    static {
        C44917m87 c44917m87 = new C44917m87();
        zbb = c44917m87;
        AbstractC41030fb7.m41135l(C44917m87.class, c44917m87);
    }

    private C44917m87() {
    }

    /* renamed from: K */
    public static C44917m87 m26284K() {
        return zbb;
    }

    /* renamed from: E */
    public final float m26290E() {
        return this.zbi;
    }

    /* renamed from: F */
    public final int m26289F() {
        return this.zbh;
    }

    /* renamed from: G */
    public final int m26288G() {
        return this.zbe;
    }

    /* renamed from: H */
    public final int m26287H() {
        return this.zbf;
    }

    /* renamed from: I */
    public final int m26286I() {
        return this.zbg;
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
                            this.zbj = b;
                            return null;
                        }
                        return zbb;
                    }
                    return new C44324l87(null);
                }
                return new C44917m87();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0004\u0001ᔄ\u0000\u0002ᔄ\u0001\u0003ᔄ\u0002\u0004ᔄ\u0003\u0005ခ\u0004", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi"});
        }
        return Byte.valueOf(this.zbj);
    }
}
