package p000;
/* renamed from: hV6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C42160hV6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C42160hV6 zbb;
    private int zbd = 0;
    private Object zbe;
    private int zbf;
    private float zbg;

    static {
        C42160hV6 c42160hV6 = new C42160hV6();
        zbb = c42160hV6;
        AbstractC41030fb7.m41135l(C42160hV6.class, c42160hV6);
    }

    private C42160hV6() {
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
                    return new C41567gV6(null);
                }
                return new C42160hV6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002\u0001\u0003?\u0000\u0004Ȼ\u0000", new Object[]{"zbe", "zbd", "zbf", "zbg"});
        }
        return (byte) 1;
    }
}