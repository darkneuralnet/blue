package p000;
/* renamed from: eU6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C40372eU6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C40372eU6 zbb;
    private int zbd = 0;
    private Object zbe;

    static {
        C40372eU6 c40372eU6 = new C40372eU6();
        zbb = c40372eU6;
        AbstractC41030fb7.m41135l(C40372eU6.class, c40372eU6);
    }

    private C40372eU6() {
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
                    return new C39780dU6(null);
                }
                return new C40372eU6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001;\u0000\u0002=\u0000", new Object[]{"zbe", "zbd"});
        }
        return (byte) 1;
    }
}
