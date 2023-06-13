package p000;
/* renamed from: ca7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C39224ca7 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C39224ca7 zbb;
    private int zbd;
    private float zbf;
    private String zbe = "";
    private int zbg = 1;

    static {
        C39224ca7 c39224ca7 = new C39224ca7();
        zbb = c39224ca7;
        AbstractC41030fb7.m41135l(C39224ca7.class, c39224ca7);
    }

    private C39224ca7() {
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
                    return new C38631ba7(null);
                }
                return new C39224ca7();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001\u0003င\u0002", new Object[]{"zbd", "zbe", "zbf", "zbg"});
        }
        return (byte) 1;
    }
}
