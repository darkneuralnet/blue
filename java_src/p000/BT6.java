package p000;
/* renamed from: BT6 */
/* loaded from: classes5.dex */
public final class BT6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final BT6 zbb;
    private int zbd;
    private float zbe = 0.01f;

    static {
        BT6 bt6 = new BT6();
        zbb = bt6;
        AbstractC41030fb7.m41135l(BT6.class, bt6);
    }

    private BT6() {
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
                    return new AT6(null);
                }
                return new BT6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ခ\u0000", new Object[]{"zbd", "zbe"});
        }
        return (byte) 1;
    }
}
