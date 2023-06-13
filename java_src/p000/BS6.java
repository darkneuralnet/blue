package p000;
/* renamed from: BS6 */
/* loaded from: classes5.dex */
public final class BS6 extends AbstractC39234cb7 {
    private static final BS6 zbd;
    private int zbe;
    private C49248tS6 zbf;
    private float zbh;
    private float zbi;
    private C49248tS6 zbl;
    private C43912kS6 zbm;
    private byte zbo = 2;
    private InterfaceC46367ob7 zbg = AbstractC41030fb7.m41147C();
    private InterfaceC46367ob7 zbj = AbstractC41030fb7.m41147C();
    private AbstractC32088Ca7 zbk = AbstractC32088Ca7.f4281c;
    private InterfaceC46367ob7 zbn = AbstractC41030fb7.m41147C();

    static {
        BS6 bs6 = new BS6();
        zbd = bs6;
        AbstractC41030fb7.m41135l(BS6.class, bs6);
    }

    private BS6() {
    }

    @Override // p000.AbstractC41030fb7
    /* renamed from: p */
    public final Object mo1009p(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            if (obj == null) {
                                b = 0;
                            }
                            this.zbo = b;
                            return null;
                        }
                        return zbd;
                    }
                    return new C49841uS6(null);
                }
                return new BS6();
            }
            return AbstractC41030fb7.m41144c(zbd, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0003\u0001\u0001ဉ\u0000\u0002\u001b\u0003ခ\u0001\u0004\u001b\u0005ᐉ\u0005\u0006\u001b\u0007ည\u0003\bဉ\u0004\tခ\u0002", new Object[]{"zbe", "zbf", "zbg", AS6.class, "zbh", "zbj", C51026wS6.class, "zbm", "zbn", C48063rS6.class, "zbk", "zbl", "zbi"});
        }
        return Byte.valueOf(this.zbo);
    }
}
