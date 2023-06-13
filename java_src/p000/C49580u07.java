package p000;
/* renamed from: u07  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C49580u07 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C49580u07 zbb;
    private int zbd;
    private boolean zbe;
    private String zbf = "";

    static {
        C49580u07 c49580u07 = new C49580u07();
        zbb = c49580u07;
        AbstractC41030fb7.m41135l(C49580u07.class, c49580u07);
    }

    private C49580u07() {
    }

    @Override // p000.AbstractC41030fb7
    /* renamed from: p */
    public final Object mo1009p(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zbb;
                    }
                    return new C48126rZ6(null);
                }
                return new C49580u07();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        return (byte) 1;
    }
}
