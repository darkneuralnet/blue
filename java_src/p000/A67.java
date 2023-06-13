package p000;
/* renamed from: A67 */
/* loaded from: classes5.dex */
public final class A67 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final A67 zbb;
    private L67 zbf;
    private byte zbg = 2;
    private String zbd = "";
    private String zbe = "";

    static {
        A67 a67 = new A67();
        zbb = a67;
        AbstractC41030fb7.m41135l(A67.class, a67);
    }

    private A67() {
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
                    return new C52604z67(null);
                }
                return new A67();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0001\u0001Ȉ\u0002Ȉ\u0003Љ", new Object[]{"zbd", "zbe", "zbf"});
        }
        return Byte.valueOf(this.zbg);
    }
}
