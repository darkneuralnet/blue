package p000;
/* renamed from: n37  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C45460n37 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C45460n37 zbb;
    private int zbd;
    private int zbe;
    private int zbf;

    static {
        C45460n37 c45460n37 = new C45460n37();
        zbb = c45460n37;
        AbstractC41030fb7.m41135l(C45460n37.class, c45460n37);
    }

    private C45460n37() {
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
                    return new C44867m37(null);
                }
                return new C45460n37();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        return (byte) 1;
    }
}
