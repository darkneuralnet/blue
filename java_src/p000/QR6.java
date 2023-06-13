package p000;
/* renamed from: QR6 */
/* loaded from: classes5.dex */
public final class QR6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final QR6 zbb;
    private int zbd;
    private InterfaceC43995kb7 zbe = AbstractC41030fb7.m41123z();
    private InterfaceC43995kb7 zbf = AbstractC41030fb7.m41123z();
    private int zbg;
    private int zbh;
    private int zbi;
    private int zbj;

    static {
        QR6 qr6 = new QR6();
        zbb = qr6;
        AbstractC41030fb7.m41135l(QR6.class, qr6);
    }

    private QR6() {
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
                    return new PR6(null);
                }
                return new QR6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001\u0013\u0002\u0013\u0003ဋ\u0000\u0004ဋ\u0001\u0005ဋ\u0002\u0006ဋ\u0003", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi", "zbj"});
        }
        return (byte) 1;
    }
}
