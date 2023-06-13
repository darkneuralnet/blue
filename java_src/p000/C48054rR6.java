package p000;
/* renamed from: rR6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48054rR6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C48054rR6 zbb;
    private int zbd;
    private byte zbg = 2;
    private String zbe = "";
    private float zbf = 1.0f;

    static {
        C48054rR6 c48054rR6 = new C48054rR6();
        zbb = c48054rR6;
        AbstractC41030fb7.m41135l(C48054rR6.class, c48054rR6);
    }

    private C48054rR6() {
    }

    /* renamed from: E */
    public final float m15945E() {
        return this.zbf;
    }

    /* renamed from: G */
    public final String m15943G() {
        return this.zbe;
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
                    return new C47461qR6(null);
                }
                return new C48054rR6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔈ\u0000\u0002ခ\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        return Byte.valueOf(this.zbg);
    }
}
