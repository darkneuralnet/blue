package p000;
/* renamed from: G37 */
/* loaded from: classes5.dex */
public final class G37 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final G37 zbb;
    private int zbd;
    private float zbe;
    private float zbf;

    static {
        G37 g37 = new G37();
        zbb = g37;
        AbstractC41030fb7.m41135l(G37.class, g37);
    }

    private G37() {
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
                    return new F37(null);
                }
                return new G37();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        return (byte) 1;
    }
}
