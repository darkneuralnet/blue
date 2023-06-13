package p000;
/* renamed from: kY6 */
/* loaded from: classes5.dex */
public final class C43966kY6 extends AbstractC39234cb7 {
    private static final C43966kY6 zbd;
    private byte zbe = 2;

    static {
        C43966kY6 c43966kY6 = new C43966kY6();
        zbd = c43966kY6;
        AbstractC41030fb7.m41135l(C43966kY6.class, c43966kY6);
    }

    private C43966kY6() {
    }

    @Override // p000.AbstractC41030fb7
    /* renamed from: p */
    public final Object mo1009p(int i, Object obj, Object obj2) {
        byte b;
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            if (obj == null) {
                                b = 0;
                            } else {
                                b = 1;
                            }
                            this.zbe = b;
                            return null;
                        }
                        return zbd;
                    }
                    return new C41594gY6(null);
                }
                return new C43966kY6();
            }
            return AbstractC41030fb7.m41144c(zbd, "\u0001\u0000", null);
        }
        return Byte.valueOf(this.zbe);
    }
}
