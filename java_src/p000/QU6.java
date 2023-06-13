package p000;
/* renamed from: QU6 */
/* loaded from: classes5.dex */
public final class QU6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final QU6 zbb;
    private C48090rV6 zbd;
    private C48090rV6 zbe;

    static {
        QU6 qu6 = new QU6();
        zbb = qu6;
        AbstractC41030fb7.m41135l(QU6.class, qu6);
    }

    private QU6() {
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
                    return new PU6(null);
                }
                return new QU6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zbd", "zbe"});
        }
        return (byte) 1;
    }
}
