package p000;
/* renamed from: L67 */
/* loaded from: classes5.dex */
public final class L67 extends AbstractC39234cb7 {
    private static final L67 zbd;
    private byte zbe = 2;

    static {
        L67 l67 = new L67();
        zbd = l67;
        AbstractC41030fb7.m41135l(L67.class, l67);
    }

    private L67() {
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
                    return new K67(null);
                }
                return new L67();
            }
            return AbstractC41030fb7.m41144c(zbd, "\u0001\u0000", null);
        }
        return Byte.valueOf(this.zbe);
    }
}
