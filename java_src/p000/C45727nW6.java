package p000;
/* renamed from: nW6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C45727nW6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C45727nW6 zbb;
    private int zbd;
    private int zbe;
    private int zbf;
    private String zbg = "";

    static {
        C45727nW6 c45727nW6 = new C45727nW6();
        zbb = c45727nW6;
        AbstractC41030fb7.m41135l(C45727nW6.class, c45727nW6);
    }

    private C45727nW6() {
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
                    return new C45134mW6(null);
                }
                return new C45727nW6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b\u0004Ȉ", new Object[]{"zbd", "zbe", "zbf", "zbg"});
        }
        return (byte) 1;
    }
}
