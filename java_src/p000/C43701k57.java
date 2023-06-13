package p000;
/* renamed from: k57  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C43701k57 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C43701k57 zbb;
    private byte zbe = 2;
    private InterfaceC46367ob7 zbd = AbstractC41030fb7.m41147C();

    static {
        C43701k57 c43701k57 = new C43701k57();
        zbb = c43701k57;
        AbstractC41030fb7.m41135l(C43701k57.class, c43701k57);
    }

    private C43701k57() {
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
                            this.zbe = b;
                            return null;
                        }
                        return zbb;
                    }
                    return new C43108j57(null);
                }
                return new C43701k57();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"zbd", C41922h57.class});
        }
        return Byte.valueOf(this.zbe);
    }
}
