package p000;
/* renamed from: h57 */
/* loaded from: classes5.dex */
public final class C41922h57 extends AbstractC39234cb7 {
    private static final C41922h57 zbd;
    private int zbe;
    private long zbf;
    private C52574z37 zbg;
    private H37 zbh;
    private byte zbj = 2;
    private InterfaceC46367ob7 zbi = AbstractC41030fb7.m41147C();

    static {
        C41922h57 c41922h57 = new C41922h57();
        zbd = c41922h57;
        AbstractC41030fb7.m41135l(C41922h57.class, c41922h57);
    }

    private C41922h57() {
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
                        return zbd;
                    }
                    return new C41329g57(null);
                }
                return new C41922h57();
            }
            return AbstractC41030fb7.m41144c(zbd, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဉ\u0001\u0003\u001b\u0004ဉ\u0002", new Object[]{"zbe", "zbf", "zbg", "zbi", N37.class, "zbh"});
        }
        return Byte.valueOf(this.zbj);
    }
}
