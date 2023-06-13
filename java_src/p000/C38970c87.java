package p000;
/* renamed from: c87  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C38970c87 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C38970c87 zbb;
    private int zbd;
    private double zbe;
    private double zbf;

    static {
        C38970c87 c38970c87 = new C38970c87();
        zbb = c38970c87;
        AbstractC41030fb7.m41135l(C38970c87.class, c38970c87);
    }

    private C38970c87() {
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
                    return new C38377b87(null);
                }
                return new C38970c87();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        return (byte) 1;
    }
}
