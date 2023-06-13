package p000;
/* renamed from: XW6 */
/* loaded from: classes5.dex */
public final class XW6 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final XW6 zbb;
    private long zbe;
    private long zbf;
    private AbstractC32088Ca7 zbd = AbstractC32088Ca7.f4281c;
    private InterfaceC46367ob7 zbg = AbstractC41030fb7.m41147C();

    static {
        XW6 xw6 = new XW6();
        zbb = xw6;
        AbstractC41030fb7.m41135l(XW6.class, xw6);
    }

    private XW6() {
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
                    return new WW6(null);
                }
                return new XW6();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\n\u0002\u0002\u0003\u0002\u0004\u001b", new Object[]{"zbd", "zbe", "zbf", "zbg", C45727nW6.class});
        }
        return (byte) 1;
    }
}
