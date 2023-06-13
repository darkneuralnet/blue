package p000;
/* renamed from: G97 */
/* loaded from: classes5.dex */
public final class G97 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final G97 zbb;
    private int zbd;
    private int zbf;
    private int zbg;
    private I97 zbj;
    private C44334l97 zbl;
    private C42555i97 zbm;
    private byte zbo = 2;
    private AbstractC32088Ca7 zbe = AbstractC32088Ca7.f4281c;
    private String zbh = "";
    private InterfaceC46367ob7 zbi = AbstractC41030fb7.m41147C();
    private InterfaceC46367ob7 zbk = AbstractC41030fb7.m41147C();
    private InterfaceC46367ob7 zbn = AbstractC41030fb7.m41147C();

    static {
        G97 g97 = new G97();
        zbb = g97;
        AbstractC41030fb7.m41135l(G97.class, g97);
    }

    private G97() {
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
                        return zbb;
                    }
                    return new F97(null);
                }
                return new G97();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0003\u0004\u0001ᔊ\u0000\u0002ဈ\u0003\u0003Л\u0004ဉ\u0004\u0005Л\u0006ဉ\u0005\u0007ဉ\u0006\bЛ\tင\u0001\nင\u0002", new Object[]{"zbd", "zbe", "zbh", "zbi", C40183e97.class, "zbj", "zbk", E97.class, "zbl", "zbm", "zbn", C97.class, "zbf", "zbg"});
        }
        return Byte.valueOf(this.zbo);
    }
}
