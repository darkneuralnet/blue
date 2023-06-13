package p000;
/* renamed from: X67 */
/* loaded from: classes5.dex */
public final class X67 extends AbstractC39234cb7 {
    private static final X67 zbd;
    private byte zbe = 2;

    static {
        X67 x67 = new X67();
        zbd = x67;
        AbstractC41030fb7.m41135l(X67.class, x67);
    }

    private X67() {
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
                    return new W67(null);
                }
                return new X67();
            }
            return AbstractC41030fb7.m41144c(zbd, "\u0001\u0000", null);
        }
        return Byte.valueOf(this.zbe);
    }
}
