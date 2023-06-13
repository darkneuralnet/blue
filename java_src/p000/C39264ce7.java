package p000;
/* renamed from: ce7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C39264ce7 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C39264ce7 zbb;
    private int zbd;
    private String zbe = "";
    private String zbf = "";

    static {
        C39264ce7 c39264ce7 = new C39264ce7();
        zbb = c39264ce7;
        AbstractC41030fb7.m41135l(C39264ce7.class, c39264ce7);
    }

    private C39264ce7() {
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
                    return new C38671be7(null);
                }
                return new C39264ce7();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        return (byte) 1;
    }
}
