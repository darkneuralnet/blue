package p000;
/* renamed from: g77  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C41349g77 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C41349g77 zbb;
    private int zbd;
    private float zbf;
    private String zbe = "";
    private InterfaceC46367ob7 zbg = AbstractC41030fb7.m41147C();
    private InterfaceC46367ob7 zbh = AbstractC41030fb7.m41147C();

    static {
        C41349g77 c41349g77 = new C41349g77();
        zbb = c41349g77;
        AbstractC41030fb7.m41135l(C41349g77.class, c41349g77);
    }

    private C41349g77() {
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
                    return new C67(null);
                }
                return new C41349g77();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0000\u0005\u0000\u0000\u0001\u007f\u0005\u0000\u0002\u0000\u0001\f\u0002Ȉ\u0003\u0001\u0004Ț\u007fȚ", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh"});
        }
        return (byte) 1;
    }
}
