package p000;
/* renamed from: ES6 */
/* loaded from: classes5.dex */
public final class ES6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final ES6 zbb;
    private byte zbe = 2;
    private InterfaceC46367ob7 zbd = AbstractC41030fb7.m41147C();

    static {
        ES6 es6 = new ES6();
        zbb = es6;
        AbstractC41030fb7.m41135l(ES6.class, es6);
    }

    private ES6() {
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
                    return new DS6(null);
                }
                return new ES6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"zbd", BS6.class});
        }
        return Byte.valueOf(this.zbe);
    }
}
