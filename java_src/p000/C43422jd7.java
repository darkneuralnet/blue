package p000;
/* renamed from: jd7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C43422jd7 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C43422jd7 zbb;
    private int zbd;
    private String zbe = "";
    private String zbf = "";

    static {
        C43422jd7 c43422jd7 = new C43422jd7();
        zbb = c43422jd7;
        AbstractC41030fb7.m41135l(C43422jd7.class, c43422jd7);
    }

    private C43422jd7() {
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
                    return new C42829id7(null);
                }
                return new C43422jd7();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        return (byte) 1;
    }
}