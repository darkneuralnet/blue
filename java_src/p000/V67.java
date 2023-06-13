package p000;
/* renamed from: V67 */
/* loaded from: classes5.dex */
public final class V67 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final V67 zbb;
    private int zbd;
    private X67 zbh;
    private byte zbi = 2;
    private String zbe = "";
    private String zbf = "";
    private String zbg = "";

    static {
        V67 v67 = new V67();
        zbb = v67;
        AbstractC41030fb7.m41135l(V67.class, v67);
    }

    private V67() {
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
                            this.zbi = b;
                            return null;
                        }
                        return zbb;
                    }
                    return new U67(null);
                }
                return new V67();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0004\u0000\u0001\u0001Ϫ\u0004\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003ᐉ\u0003Ϫဈ\u0002", new Object[]{"zbd", "zbe", "zbf", "zbh", "zbg"});
        }
        return Byte.valueOf(this.zbi);
    }
}
