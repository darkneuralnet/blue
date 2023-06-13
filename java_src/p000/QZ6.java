package p000;
/* renamed from: QZ6 */
/* loaded from: classes6.dex */
public final class QZ6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final QZ6 zbb;
    private InterfaceC46367ob7 zbd = AbstractC41030fb7.m41147C();

    static {
        QZ6 qz6 = new QZ6();
        zbb = qz6;
        AbstractC41030fb7.m41135l(QZ6.class, qz6);
    }

    private QZ6() {
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
                    return new OZ6(null);
                }
                return new QZ6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zbd", MZ6.class});
        }
        return (byte) 1;
    }
}
