package p000;
/* renamed from: ae7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C38078ae7 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C38078ae7 zbb;
    private int zbd;
    private String zbe = "";
    private long zbf;
    private long zbg;
    private long zbh;

    static {
        C38078ae7 c38078ae7 = new C38078ae7();
        zbb = c38078ae7;
        AbstractC41030fb7.m41135l(C38078ae7.class, c38078ae7);
    }

    private C38078ae7() {
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
                    return new C37497Zd7(null);
                }
                return new C38078ae7();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh"});
        }
        return (byte) 1;
    }
}
